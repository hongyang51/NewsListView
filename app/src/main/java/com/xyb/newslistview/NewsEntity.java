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

import java.util.List;

/***
 * BY YanBinXie  AT 15/11/10 下午3:08
 */
public class NewsEntity {

    /**
     * status : ok
     * paramz : {"feeds":[{"id":299058,"oid":288328,"category":"article","data":{"subject":"工作人员套取新农合565元被降级","summary":"昨天记者获悉，驻马店市纪委通报4起涉医领域违纪违法典型案件。","cover":"/Attachs/Article/288328/65b28e724f3b4a65ae7bb3f5c97699ab_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 19:35:53"}},{"id":299057,"oid":288327,"category":"article","data":{"subject":"中缅边境缴8.8公斤炸药45枚雷管","summary":"云南普洱边防支队18日查获一起非法走私买卖爆炸物品案。","cover":"/Attachs/Article/288327/492576bb63c941358830bd181c527aeb_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 19:33:32"}},{"id":299055,"oid":288325,"category":"article","data":{"subject":"台渔船翻覆发现4遇难者1大陆人","summary":"台湾渔船\u201c世晖31号\u201d18日在桃园外海与一货轮\u201c亚泥2号\u201d发生碰撞后翻覆。","cover":"/Attachs/Article/288325/3d9b7a45082d426198e27295384697ae_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 19:29:36"}},{"id":299043,"oid":288320,"category":"article","data":{"subject":"贵阳一官员开受贿轿车接受调查","summary":"贵阳一官员开着不法商人为其购买的轿车前往接受组织调查。","cover":"/Attachs/Article/288320/3dff218fa4c34451b93fe7fd39163aa0_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 19:00:17"}},{"id":299039,"oid":288316,"category":"article","data":{"subject":"牛散操纵股价亏2.78亿被罚3百万","summary":"中国证监会召开例行新闻发布会，通报了一大批违法违规案件的处理情况。","cover":"/Attachs/Article/288316/7d2372a70810421b82e8c2a444a3b4df_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 18:41:18"}},{"id":299037,"oid":288314,"category":"article","data":{"subject":"交通局副局长因掌掴女医师被免","summary":"贵州省印江县交通局副局长蒋雨忠因怒骂、掌掴县人民医院医师被免职。","cover":"/Attachs/Article/288314/0a2a5c0611f84bfeae905d53fabe91ca_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 17:56:46"}},{"id":299006,"oid":288295,"category":"article","data":{"subject":"美国人眼中的习近平","summary":"此次访美是习近平就任国家主席后首次对美国进行国事访问。","cover":"/Attachs/Article/288295/2adde12f94324ae69cd080a5fa9aaaf7_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 17:05:12"}},{"id":299004,"oid":288293,"category":"article","data":{"subject":"习近平访美 美媒关注哪些焦点","summary":"9月下旬，国家主席习近平将应邀访美并出席联合国系列峰会。","cover":"/Attachs/Article/288293/67b5458baee74de7a0f5f0a2d86db524_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 17:00:55"}},{"id":299001,"oid":288290,"category":"article","data":{"subject":"广州老奶奶晕倒 市民热心相助","summary":"今天上午12时许，市少年宫内一唐奶奶晕倒，路过学生家纷纷伸出援手。","cover":"/Attachs/Article/288290/a11f01cc3db2468bb7f07581d32e5898_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 16:58:33"}},{"id":299000,"oid":288289,"category":"article","data":{"subject":"天津爆炸周边整治初步方案出台","summary":"天津港爆炸受损的居民区周边环境景观及基础设施配套规划初步方案出台。","cover":"/Attachs/Article/288289/9a2f9c5d1d3c4a16816b63a41629323b_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 16:56:16"}},{"id":298992,"oid":288281,"category":"article","data":{"subject":"湖北多名党员因带彩娱乐被免职","summary":"湖北省近期部署开展了党员干部\u201c带彩\u201d娱乐问题专项整治工作。","cover":"/Attachs/Article/288281/51777d5e0a144679ab79661b5a9f07d6_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 16:25:40"}},{"id":298990,"oid":288275,"category":"article","data":{"subject":"湖南一官员宴请财政官员后死亡","summary":"针对\u201c郴州国土官员宴请财政官员后死亡\u201d一事，郴州市纪委作出通报。","cover":"/Attachs/Article/288275/7f7982af1bbd41cf94b4b3888aa2e6bd_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 16:16:42"}},{"id":298986,"oid":288272,"category":"article","data":{"subject":"新华社：楼市回暖更要坚守政策","summary":"8月份70个大中城市新建商品住宅价格同比综合平均上涨1.7%。","cover":"/Attachs/Article/288272/944938065cc14f208a4e1f12f23acfa9_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 15:57:22"}},{"id":298983,"oid":288270,"category":"article","data":{"subject":"平邑事件镇书记和镇长被停职","summary":"9月19日，\u201c平邑9.14\u201d事件地方镇主要负责人被停职检查。","cover":"/Attachs/Article/288270/874b82ff0cb647578eb007495282d915_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 16:03:21"}},{"id":298957,"oid":288253,"category":"article","data":{"subject":"天津消防总队政委受贿9万判5年","summary":"受贿事实共3起，均发生在徐在上海消防系统任职期间。","cover":"/Attachs/Article/288253/592894f9adb74390a36553c427f14389_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 15:04:32"}},{"id":298935,"oid":288240,"category":"article","data":{"subject":"老赖代表欠3亿 人大不批复批捕","summary":"义乌市人民法院与义乌热线联合开设的老赖曝光台上，朱剑峰至今赫然在册。","cover":"/Attachs/Article/288240/bf223d44b00448e7bb87ab9499a73620_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 14:42:38"}},{"id":298921,"oid":288234,"category":"article","data":{"subject":"李小鹏：山西仍有部门不作为","summary":"一些地方和部门不作为、慢作为、工作措施不力等问题依然存在。","cover":"/Attachs/Article/288234/4ece636c2889470b9be66ff393c93d0e_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 14:21:07"}},{"id":298917,"oid":288230,"category":"article","data":{"subject":"感动网友\"雨伞爸爸\"毕业于南大","summary":"爆红照片并不会改变我们的生活，会尽全力为儿子创造最好的条件，自由闯荡。","cover":"/Attachs/Article/288230/7c16334e2ebf495b8140264423b91b89_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 15:28:58"}},{"id":298916,"oid":288229,"category":"article","data":{"subject":"杨振宁携39岁夫人回家乡合肥","summary":"这位93岁的老人一下子扎进近代物理系的实验室里，跟老师学生畅聊学术问题。","cover":"/Attachs/Article/288229/9ddacfb194074a58be9cf2c9555b1ee3_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 14:03:46"}},{"id":298885,"oid":288204,"category":"article","data":{"subject":"原呼格案调查组长妻子被控制","summary":"因为涉及冯志明涉嫌职务犯罪案件，其妻子被办案机关采取司法强制措施。","cover":"/Attachs/Article/288204/96b4a0d5c9784b5eac826ab31de97f27_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 11:46:31"}}],"PageIndex":1,"PageSize":20,"TotalCount":40678,"TotalPage":2034}
     */

    private String status;
    /**
     * feeds : [{"id":299058,"oid":288328,"category":"article","data":{"subject":"工作人员套取新农合565元被降级","summary":"昨天记者获悉，驻马店市纪委通报4起涉医领域违纪违法典型案件。","cover":"/Attachs/Article/288328/65b28e724f3b4a65ae7bb3f5c97699ab_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 19:35:53"}},{"id":299057,"oid":288327,"category":"article","data":{"subject":"中缅边境缴8.8公斤炸药45枚雷管","summary":"云南普洱边防支队18日查获一起非法走私买卖爆炸物品案。","cover":"/Attachs/Article/288327/492576bb63c941358830bd181c527aeb_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 19:33:32"}},{"id":299055,"oid":288325,"category":"article","data":{"subject":"台渔船翻覆发现4遇难者1大陆人","summary":"台湾渔船\u201c世晖31号\u201d18日在桃园外海与一货轮\u201c亚泥2号\u201d发生碰撞后翻覆。","cover":"/Attachs/Article/288325/3d9b7a45082d426198e27295384697ae_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 19:29:36"}},{"id":299043,"oid":288320,"category":"article","data":{"subject":"贵阳一官员开受贿轿车接受调查","summary":"贵阳一官员开着不法商人为其购买的轿车前往接受组织调查。","cover":"/Attachs/Article/288320/3dff218fa4c34451b93fe7fd39163aa0_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 19:00:17"}},{"id":299039,"oid":288316,"category":"article","data":{"subject":"牛散操纵股价亏2.78亿被罚3百万","summary":"中国证监会召开例行新闻发布会，通报了一大批违法违规案件的处理情况。","cover":"/Attachs/Article/288316/7d2372a70810421b82e8c2a444a3b4df_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 18:41:18"}},{"id":299037,"oid":288314,"category":"article","data":{"subject":"交通局副局长因掌掴女医师被免","summary":"贵州省印江县交通局副局长蒋雨忠因怒骂、掌掴县人民医院医师被免职。","cover":"/Attachs/Article/288314/0a2a5c0611f84bfeae905d53fabe91ca_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 17:56:46"}},{"id":299006,"oid":288295,"category":"article","data":{"subject":"美国人眼中的习近平","summary":"此次访美是习近平就任国家主席后首次对美国进行国事访问。","cover":"/Attachs/Article/288295/2adde12f94324ae69cd080a5fa9aaaf7_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 17:05:12"}},{"id":299004,"oid":288293,"category":"article","data":{"subject":"习近平访美 美媒关注哪些焦点","summary":"9月下旬，国家主席习近平将应邀访美并出席联合国系列峰会。","cover":"/Attachs/Article/288293/67b5458baee74de7a0f5f0a2d86db524_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 17:00:55"}},{"id":299001,"oid":288290,"category":"article","data":{"subject":"广州老奶奶晕倒 市民热心相助","summary":"今天上午12时许，市少年宫内一唐奶奶晕倒，路过学生家纷纷伸出援手。","cover":"/Attachs/Article/288290/a11f01cc3db2468bb7f07581d32e5898_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 16:58:33"}},{"id":299000,"oid":288289,"category":"article","data":{"subject":"天津爆炸周边整治初步方案出台","summary":"天津港爆炸受损的居民区周边环境景观及基础设施配套规划初步方案出台。","cover":"/Attachs/Article/288289/9a2f9c5d1d3c4a16816b63a41629323b_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 16:56:16"}},{"id":298992,"oid":288281,"category":"article","data":{"subject":"湖北多名党员因带彩娱乐被免职","summary":"湖北省近期部署开展了党员干部\u201c带彩\u201d娱乐问题专项整治工作。","cover":"/Attachs/Article/288281/51777d5e0a144679ab79661b5a9f07d6_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 16:25:40"}},{"id":298990,"oid":288275,"category":"article","data":{"subject":"湖南一官员宴请财政官员后死亡","summary":"针对\u201c郴州国土官员宴请财政官员后死亡\u201d一事，郴州市纪委作出通报。","cover":"/Attachs/Article/288275/7f7982af1bbd41cf94b4b3888aa2e6bd_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 16:16:42"}},{"id":298986,"oid":288272,"category":"article","data":{"subject":"新华社：楼市回暖更要坚守政策","summary":"8月份70个大中城市新建商品住宅价格同比综合平均上涨1.7%。","cover":"/Attachs/Article/288272/944938065cc14f208a4e1f12f23acfa9_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 15:57:22"}},{"id":298983,"oid":288270,"category":"article","data":{"subject":"平邑事件镇书记和镇长被停职","summary":"9月19日，\u201c平邑9.14\u201d事件地方镇主要负责人被停职检查。","cover":"/Attachs/Article/288270/874b82ff0cb647578eb007495282d915_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 16:03:21"}},{"id":298957,"oid":288253,"category":"article","data":{"subject":"天津消防总队政委受贿9万判5年","summary":"受贿事实共3起，均发生在徐在上海消防系统任职期间。","cover":"/Attachs/Article/288253/592894f9adb74390a36553c427f14389_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 15:04:32"}},{"id":298935,"oid":288240,"category":"article","data":{"subject":"老赖代表欠3亿 人大不批复批捕","summary":"义乌市人民法院与义乌热线联合开设的老赖曝光台上，朱剑峰至今赫然在册。","cover":"/Attachs/Article/288240/bf223d44b00448e7bb87ab9499a73620_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 14:42:38"}},{"id":298921,"oid":288234,"category":"article","data":{"subject":"李小鹏：山西仍有部门不作为","summary":"一些地方和部门不作为、慢作为、工作措施不力等问题依然存在。","cover":"/Attachs/Article/288234/4ece636c2889470b9be66ff393c93d0e_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 14:21:07"}},{"id":298917,"oid":288230,"category":"article","data":{"subject":"感动网友\"雨伞爸爸\"毕业于南大","summary":"爆红照片并不会改变我们的生活，会尽全力为儿子创造最好的条件，自由闯荡。","cover":"/Attachs/Article/288230/7c16334e2ebf495b8140264423b91b89_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 15:28:58"}},{"id":298916,"oid":288229,"category":"article","data":{"subject":"杨振宁携39岁夫人回家乡合肥","summary":"这位93岁的老人一下子扎进近代物理系的实验室里，跟老师学生畅聊学术问题。","cover":"/Attachs/Article/288229/9ddacfb194074a58be9cf2c9555b1ee3_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 14:03:46"}},{"id":298885,"oid":288204,"category":"article","data":{"subject":"原呼格案调查组长妻子被控制","summary":"因为涉及冯志明涉嫌职务犯罪案件，其妻子被办案机关采取司法强制措施。","cover":"/Attachs/Article/288204/96b4a0d5c9784b5eac826ab31de97f27_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 11:46:31"}}]
     * PageIndex : 1
     * PageSize : 20
     * TotalCount : 40678
     * TotalPage : 2034
     */

    private ParamzEntity paramz;

    public void setStatus(String status) {
        this.status = status;
    }

    public void setParamz(ParamzEntity paramz) {
        this.paramz = paramz;
    }

    public String getStatus() {
        return status;
    }

    public ParamzEntity getParamz() {
        return paramz;
    }

    public static class ParamzEntity {
        private int PageIndex;
        private int PageSize;
        private int TotalCount;
        private int TotalPage;
        /**
         * id : 299058
         * oid : 288328
         * category : article
         * data : {"subject":"工作人员套取新农合565元被降级","summary":"昨天记者获悉，驻马店市纪委通报4起涉医领域违纪违法典型案件。","cover":"/Attachs/Article/288328/65b28e724f3b4a65ae7bb3f5c97699ab_padmini.JPG","pic":"","format":"txt","changed":"2015-09-19 19:35:53"}
         */

        private List<FeedsEntity> feeds;

        public void setPageIndex(int PageIndex) {
            this.PageIndex = PageIndex;
        }

        public void setPageSize(int PageSize) {
            this.PageSize = PageSize;
        }

        public void setTotalCount(int TotalCount) {
            this.TotalCount = TotalCount;
        }

        public void setTotalPage(int TotalPage) {
            this.TotalPage = TotalPage;
        }

        public void setFeeds(List<FeedsEntity> feeds) {
            this.feeds = feeds;
        }

        public int getPageIndex() {
            return PageIndex;
        }

        public int getPageSize() {
            return PageSize;
        }

        public int getTotalCount() {
            return TotalCount;
        }

        public int getTotalPage() {
            return TotalPage;
        }

        public List<FeedsEntity> getFeeds() {
            return feeds;
        }

        public static class FeedsEntity {
            private int id;
            private int oid;
            private String category;
            /**
             * subject : 工作人员套取新农合565元被降级
             * summary : 昨天记者获悉，驻马店市纪委通报4起涉医领域违纪违法典型案件。
             * cover : /Attachs/Article/288328/65b28e724f3b4a65ae7bb3f5c97699ab_padmini.JPG
             * pic :
             * format : txt
             * changed : 2015-09-19 19:35:53
             */



            private DataEntity data;

            public void setId(int id) {
                this.id = id;
            }

            public void setOid(int oid) {
                this.oid = oid;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public void setData(DataEntity data) {
                this.data = data;
            }

            public int getId() {
                return id;
            }

            public int getOid() {
                return oid;
            }

            public String getCategory() {
                return category;
            }

            public DataEntity getData() {
                return data;
            }

            public static class DataEntity {
                private String subject;
                private String summary;
                private String cover;
                private String pic;
                private String format;
                private String changed;

                public DataEntity(String subject, String summary, String cover) {
                    this.subject = subject;
                    this.summary = summary;
                    this.cover = cover;
                }

                public void setSubject(String subject) {
                    this.subject = subject;
                }

                public void setSummary(String summary) {
                    this.summary = summary;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public void setFormat(String format) {
                    this.format = format;
                }

                public void setChanged(String changed) {
                    this.changed = changed;
                }

                public String getSubject() {
                    return subject;
                }

                public String getSummary() {
                    return summary;
                }

                public String getCover() {
                    return cover;
                }

                public String getPic() {
                    return pic;
                }

                public String getFormat() {
                    return format;
                }

                public String getChanged() {
                    return changed;
                }
            }
        }
    }
}
