package com.xyb.newslistview;
/*
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
           \  .-\__  `-`  ___/-. /
         ___`. .'  /--.--\  `. . __
      ."" '<  `.___\_<|>_/___.'  >'"".
     | | :  `- \`.;`\ _ /`;.`/ - ` : | |
     \  \ `-.   \_ __\ /__ _/   .-` /  /
======`-.____`-.___\_____/___.-`____.-'======
                   `=---='
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
         佛祖保佑       永无BUG
*/

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;

/***
 * BY YanBinXie  AT 15/11/10 下午3:06
 */
public class ListViewAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<NewsEntity.ParamzEntity.FeedsEntity.DataEntity> newsEntities;

    private NetworkImageView iv;
    private ImageLoader imageLoader;

    public ListViewAdapter(Context context) {
        this.context = context;
        RequestQueue queue = Volley.newRequestQueue(context);
        imageLoader = new ImageLoader(queue, new ImageLoader.ImageCache() {
            int maxMemory = (int) Runtime.getRuntime().maxMemory();
            int cacheSize = maxMemory / 8; // imageLoader 最大缓存哦哦
            private LruCache<String, Bitmap> mCache = new LruCache<>(cacheSize);

            @Override
            public Bitmap getBitmap(String url) {
                return mCache.get(url);
            }

            @Override
            public void putBitmap(String url, Bitmap bitmap) {
                mCache.put(url, bitmap);
            }
        });
    }

    public void addNews(ArrayList<NewsEntity.ParamzEntity.FeedsEntity.DataEntity> newsEntities) {
        this.newsEntities = newsEntities;
        notifyDataSetChanged();

    }

    @Override
    public int getCount() {
        return newsEntities != null && newsEntities.size() > 0 ? newsEntities.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return newsEntities != null && newsEntities.size() > 0 ? newsEntities.get(position) : null;

    }

    @Override
    public long getItemId(int position) {
        return newsEntities != null && newsEntities.size() > 0 ? position : 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        /**
         * 这是一种实现方法 但是我感觉使用ViewHolder的方法比较好,这里偷懒了,,
         * */
        TextView title,summary;
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item, null);
        } else {
            view = convertView;
        }
        iv = (NetworkImageView) view.findViewById(R.id.iv);
        summary = (TextView) view.findViewById(R.id.summary);
        title = (TextView) view.findViewById(R.id.title);
        summary.setText(newsEntities.get(position).getSummary());
        title.setText(newsEntities.get(position).getSubject());
        iv.setDefaultImageResId(R.mipmap.ic_launcher);
        iv.setErrorImageResId(R.mipmap.ic_launcher);
        iv.setImageUrl(newsEntities.get(position).getCover(), imageLoader);

        return view;
    }
}
