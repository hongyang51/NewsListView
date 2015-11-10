package com.xyb.newslistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView; // 定义出listview
    private RequestQueue requestQueue; // 定义一个请求队列 使用volley包下的 官方产品棒棒哒!
    private String HTTPURL = "http://litchiapi.jstv.com/api/" +
            "GetFeeds?column=3&PageSize=20&pageIndex=1&val=100511D3BE5301280E0992C73A9DEC41";//请求的网址
    private ArrayList<NewsEntity.ParamzEntity.FeedsEntity.DataEntity> dataEntities
            = new ArrayList<>();// 坑爹的GsonFormat生成的 但是还真好用!
    private ListViewAdapter listViewAdapter; // listview必备是配置是也!

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestQueue = Volley.newRequestQueue(this);
        initView();// 写个方法来初始化控件
        initData();// 写个方法来设置数据
    }

    private void initData() {
        /**
         * 第一个是请求的网址
         * 第二个为请求成功的监听实现方法参数为解析到的String类型数据
         * 第三个是请求失败监听,那就把你失败后要执行的方法写在这里
         * **/
        StringRequest stringRequest = new StringRequest(HTTPURL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    // 原生的抠脚json解析,回顾回顾.....
                    JSONObject jsonObject = new JSONObject(response);
                    JSONObject object = jsonObject.getJSONObject("paramz");
                    JSONArray jsonArray = object.getJSONArray("feeds");
                    NewsEntity.ParamzEntity.FeedsEntity.DataEntity dataEntity;
                    for (int i = 0; i < jsonArray.length(); i++) {
                        // 将集合遍历额
                        JSONObject json = jsonArray.getJSONObject(i).getJSONObject("data");
                        String subject = json.getString("subject");
                        String summary = json.getString("summary");
                        String cover = "http://litchiapi.jstv.com" + json.getString("cover");
                        dataEntity = new NewsEntity.ParamzEntity.FeedsEntity.DataEntity(subject, summary, cover);
                        dataEntities.add(dataEntity);
                    }
//                    Gson gson = new Gson();
//                    NewsEntity newsEntity = gson.fromJson(response, NewsEntity.class);
//                    NewsEntity newsEntity = JSON.parseObject(response,NewsEntity.class);
                    listViewAdapter.addNews(dataEntities);// 适配器中数据设置的方法将数据传递过去 notify一下

                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        requestQueue.add(stringRequest); // 请求需要加到队列中才能执行哦 这个是先执行哦 别看写在下面 哈哈

    }

    /**
     * 初始化控件的方法
     **/
    private void initView() {
        listViewAdapter = new ListViewAdapter(this);
        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(listViewAdapter);
    }
}
