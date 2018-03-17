package com.kiki.kikinews.domain;

import java.util.List;

/**
 * Created by Administrator on 2017/9/18.
 */

public class NewsBean {


    /**
     * reason : 成功的返回
     * result : {
     * "stat":"1"
     * ,"data":[
     * {"uniquekey":"d15d4489682dfe4b8b536b6d55e8dfc9"
     * ,"title":"金庸笔下的武学奇才，萧峰第五，第四最奇葩，第一无可争议"
     * ,"date":"2017-09-18 17:31"
     * ,"category":"头条"
     * ,"author_name":"娱乐全网通"
     * ,"url":"http://mini.eastday.com/mobile/170918173115603.html"
     * ,"thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170918/20170918_e8ae2ee84483a70e80c88e0b72b8a123_cover_mwpm_03200403.jpg"
     * ,"thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170918/20170918_d73fdfe293f04be7259528fd4c11e45e_cover_mwpm_03200403.jpg"
     * ,"thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170918/20170918_1a7c745fe1d9ad1b90db940a7ac1be6e_cover_mwpm_03200403.jpg"}
     *
     * ,{"uniquekey":"62199e83be3613f181518b069218e93c"
     * ,"title":"房灵敏任广西纪委书记 31省区市现任纪委书记名单"
     * ,"date":"2017-09-18 18:12"
     * ,"category":"头条"
     * ,"author_name":"人民网"
     * ,"url":"http://mini.eastday.com/mobile/170918181206593.html"
     * ,"thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170918/20170918181206_cc372a7a9e45605b3323ddfefaeb2ad8_1_mwpm_03200403.jpg"}
     *
     * ,{"uniquekey":"c1cf16188d3a1c7cb8ec7b76f49cc0ec"
     * ,"title":"三部门：推动婚恋交友平台实名认证 严打婚托婚骗"
     * ,"date":"2017-09-18 17:40"
     * ,"category":"头条"
     * ,"author_name":"中国新闻网"
     * ,"url":"http://mini.eastday.com/mobile/170918174026816.html"
     * ,"thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170918/20170918174026_57cb7d0b5a6a44a848189a705644b40e_1_mwpm_03200403.jpg"
     * ,"thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170918/20170918174026_57cb7d0b5a6a44a848189a705644b40e_2_mwpm_03200403.jpg"}
     * ,
     *
     * {"uniquekey":"07adc6ca6146e6fb6a20b789ab5c4fdd","title":"爱情里, 始于人品, 忠于感觉的几大星座!","date":"2017-09-18 17:28","category":"头条","author_name":"星座细说","url":"http://mini.eastday.com/mobile/170918172814008.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170918/20170918_c7da904236c76128df10850f49a8f62f_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170918/20170918_722f08d61edf056a05e677f1ac9dbc37_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170918/20170918_ce0833379c5038f891cb05771314f610_cover_mwpm_03200403.jpg"},{"uniquekey":"e0bfd224b85694d7bb9e4477341c31d9","title":"公安部第三研究所：公民网络电子身份标识eID拟载入手机卡","date":"2017-09-18 17:27","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170918172716088.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170918/20170918172716_fbb5b28cc4777f3a73e3f6cad232d9d2_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170918/20170918172716_fbb5b28cc4777f3a73e3f6cad232d9d2_1_mwpm_03200403.jpg"},{"uniquekey":"ed5c1fc86962d8d1a8b073e9519d3c33","title":"【见证这五年·大科学装置】厉害了！大科学装置","date":"2017-09-18 17:18","category":"头条","author_name":"光明网","url":"http://mini.eastday.com/mobile/170918171839010.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170918/20170918171839_c55a81b91ff6541c65eacde5b7d5bb39_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170918/20170918171839_c55a81b91ff6541c65eacde5b7d5bb39_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170918/20170918171839_c55a81b91ff6541c65eacde5b7d5bb39_2_mwpm_03200403.jpg"},{"uniquekey":"e5626a042582659273859213aedfbb1c","title":"回望\u201c九一八\u201d 不能不知的8个历史真相","date":"2017-09-18 17:11","category":"头条","author_name":"武器知识","url":"http://mini.eastday.com/mobile/170918171153228.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170918/20170918_752bf17cd82e1cabdc774b20827bb950_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170918/20170918_a406c93c15fca73c3a2e3d2eb8bc1653_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170918/20170918_83b5a00f72b5feb14bb6a24cf95c9bd5_cover_mwpm_03200403.jpg"},{"uniquekey":"895429756c51199d0a370b64560f8c8a","title":"俄媒：太阳能发电发展迅速 全球经济或迎来转变","date":"2017-09-18 17:10","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170918171030997.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170918/20170918171030_48ae700e89118e8c0906d1584471e555_1_mwpm_03200403.jpg"},{"uniquekey":"eb3d58ec1013f9a0db35aacee0aa2bf7","title":"港媒：进军东南亚 欧美该向中国科技巨头\u201c取经\u201d","date":"2017-09-18 17:10","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170918171030154.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170918/20170918171030_7f4f0d9f77b127a1bd88e5f68748836a_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170918/20170918171030_7f4f0d9f77b127a1bd88e5f68748836a_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170918/20170918171030_7f4f0d9f77b127a1bd88e5f68748836a_2_mwpm_03200403.jpg"},{"uniquekey":"7b524e6dd72a4d67d9cd6296b030859a","title":"又一官员下马！刘善桥因严重违纪被双开","date":"2017-09-18 17:05","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/170918170529344.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170918/20170918170529_d1f3a3d96b30be7d568481a6f58dbabd_1_mwpm_03200403.jpg"},{"uniquekey":"3504e7a91ac0ace29d8804eca102e2a7","title":"个人信息保卫战：\u201c内鬼\u201d、黑客成泄露源头，公检法升级严打","date":"2017-09-18 17:00","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170918170034965.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170918/20170918170034_1afcf8cd630f6f356a27998491fc3fe5_1_mwpm_03200403.jpg"},{"uniquekey":"eb4708cfa9a236058ff5dac066c0fc7c","title":"法国民调：过半民众认为马克龙在为富人谋利","date":"2017-09-18 17:00","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170918170017712.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170918/20170918170017_53190a25df81d15f78fddd6812064667_1_mwpm_03200403.jpg"},{"uniquekey":"396873aff60ad1b84140b54213f64801","title":"新疆兵团近千万亩棉花进入盛花期即将采收","date":"2017-09-18 17:00","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170918170003858.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170918/20170918170003_9f99e43a9d4b8743f8f2db03cdd247db_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170918/20170918170003_9f99e43a9d4b8743f8f2db03cdd247db_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170918/20170918170003_9f99e43a9d4b8743f8f2db03cdd247db_5_mwpm_03200403.jpg"},{"uniquekey":"266068e87bf2d5f104e554d736ef4547","title":"中国解封在飞机上使用便携式电子设备禁令：由航空公司评估","date":"2017-09-18 16:57","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170918165748153.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170918/20170918165748_d56088f13f4c9cb8f0b0c03307620903_1_mwpm_03200403.jpg"},{"uniquekey":"efb68decc4808e8c4ea5e425ab0eef61","title":"营口在西炮台遗址开展纪念\u201c九·一八\u201d主题活动","date":"2017-09-18 16:50","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/170918165046516.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170918/20170918165046_31c6d7212f3954d1d2c237174044bcbf_7_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170918/20170918165046_942d904733dc8da1ed50fdf7d27fdc10_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170918/20170918165046_32590ca3e3b3fc75c42e814998049758_5_mwpm_03200403.jpg"},{"uniquekey":"7f518458fb9106059e3add994088d3d8","title":"环球网记者独家采访中国公共外交协会副会长胡正跃","date":"2017-09-18 16:50","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170918165004555.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170918/20170918165004_30df66386324e4feb133e758901adbfd_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170918/20170918165004_30df66386324e4feb133e758901adbfd_2_mwpm_03200403.jpg"},{"uniquekey":"6f80c53ff5285831e68cfbf08ac45524","title":"俄卫星社第一副总编：跟西方媒体互相指责，跟中国是互相合作","date":"2017-09-18 16:50","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170918165004114.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170918/20170918165004_111bade4af6b5d010e6deab25e2da2ed_1_mwpm_03200403.jpg"},{"uniquekey":"d59713deb724df94ec40391e5d51078e","title":"环球网记者独家采访俄中友好协会主席梅津采夫","date":"2017-09-18 16:50","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170918165003869.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170918/20170918165003_dcf48cc8a6f412c0af8887571794fd88_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170918/20170918165003_dcf48cc8a6f412c0af8887571794fd88_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170918/20170918165003_dcf48cc8a6f412c0af8887571794fd88_2_mwpm_03200403.jpg"},{"uniquekey":"2c651cea21425e7b4337307849bca7d0","title":"清朝入关时，这个国家还不在，现今这个国家是世界霸主","date":"2017-09-18 16:42","category":"头条","author_name":"月中花","url":"http://mini.eastday.com/mobile/170918164222942.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170918/20170918_0a75146006e091439d58547c40a4580e_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170918/20170918_e59e7762f8f98fb477ec52f43b09c0d1_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170918/20170918_0d45ab7f019933b55a9ee0cc99b6ee12_cover_mwpm_03200403.jpg"},{"uniquekey":"dbe7f84dbfd17df151fd379daa728da0","title":"金鸡奖范冰冰获得最佳女主，观众席里闫妮的表情亮了！","date":"2017-09-18 16:37","category":"头条","author_name":"谈资","url":"http://mini.eastday.com/mobile/170918163710017.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170918/20170918163710_5b6abc62a68488e24ff48169f97ce403_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170918/20170918163710_5b6abc62a68488e24ff48169f97ce403_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170918/20170918163710_5b6abc62a68488e24ff48169f97ce403_3_mwpm_03200403.jpg"},{"uniquekey":"6049bfc6b8c5e7b024932bb8c3581820","title":"\u201c学习词典：党的十八大以来党员干部必知的新词\u201d栏目上线","date":"2017-09-18 16:31","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/170918163140729.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170918/20170918163140_3d78906a2cffd0bed8269ca74cbe03c0_1_mwpm_03200403.jpg"},{"uniquekey":"f3ea601ad490bb11f97758964d9241be","title":"91岁老者隐姓埋名30年攻克核心技术，奖励100万不算多","date":"2017-09-18 16:31","category":"头条","author_name":"军情亮点","url":"http://mini.eastday.com/mobile/170918163123217.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170918/20170918_a9f79743ba76f7622020d616a8822f23_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170918/20170918_d9ce85888157e43918de6f2ec06ae97b_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170918/20170918_728f303346ced5f09650cc5b18f11635_cover_mwpm_03200403.jpg"},{"uniquekey":"f6f048e5673cb41b38d0f3af55ae2093","title":"环球网总经理单成彪：我们能为中俄交流尽绵薄之力 倍感荣光","date":"2017-09-18 16:29","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170918162944090.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170918/20170918162944_5adb30162a020d634a03b3eb26839993_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170918/20170918162944_5adb30162a020d634a03b3eb26839993_2_mwpm_03200403.jpg"},{"uniquekey":"d4929331f43b102d559f7aef26cf544c","title":"法国老佛爷货仓存安全隐患：半年工伤事故超60起","date":"2017-09-18 16:29","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170918162943912.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170918/20170918162943_0d5eb03756bbf330d5dfaa1c33ba8f57_1_mwpm_03200403.jpg"},{"uniquekey":"56d28a1011a8a91197d40c620901aad1","title":"这三种食物全是一级致癌物，尤其是第二种，吃的人特别多","date":"2017-09-18 16:25","category":"头条","author_name":"育儿微刊","url":"http://mini.eastday.com/mobile/170918162506369.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170918/20170918_8465ad9af71130dca1b8a0ff0435b660_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170918/20170918_088192d66307adcad3f1745787509a97_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170918/20170918_1c5de52023c9db987317ae63d7d0a68c_cover_mwpm_03200403.jpg"},{"uniquekey":"293f0185f76ba1069dbec62d276677aa","title":"艾滋病毒疫苗新突破 增强B细胞应答","date":"2017-09-18 16:23","category":"头条","author_name":"Mail Online","url":"http://mini.eastday.com/mobile/170918162338424.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170918/20170918162338_e017c7571d7e5a94df8a31750a085821_1_mwpm_03200403.jpg"},{"uniquekey":"3ca73771d00c57bfcefe76b30bc63068","title":"父亲去世，女孩和奶奶每天粗茶淡饭，别人扔掉的菜叶子她们当宝贝","date":"2017-09-18 16:11","category":"头条","author_name":"天天身边事","url":"http://mini.eastday.com/mobile/170918161128097.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170918/20170918_5d2b8ba641c14ae4af7b7b853b9f904b_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170918/20170918_f76dcca770464ddbd600c644752c1c78_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170918/20170918_9ac17e5ae6fb9a87dfc4c5594b301baa_cover_mwpm_03200403.jpg"},{"uniquekey":"03c5cb57247d87c3880b5e33f33be5b1","title":"纪念\u201c九一八\u201d扬州百名大学生拼字呼吁勿忘国耻","date":"2017-09-18 16:09","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170918160926629.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170918/20170918160926_d2c2e14c5fad6fbd759670ad0b3e0e26_10_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170918/20170918160926_d2c2e14c5fad6fbd759670ad0b3e0e26_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170918/20170918160926_d2c2e14c5fad6fbd759670ad0b3e0e26_5_mwpm_03200403.jpg"},{"uniquekey":"361d1f5a08b6fe6cd94a7906d4592850","title":"湖北省政协原副主席刘善桥严重违纪被开除党籍和公职","date":"2017-09-18 16:08","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/170918160804152.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170918/20170918160804_964cadfed1addc578de4258e06e71d98_1_mwpm_03200403.jpg"},{"uniquekey":"38fd047bcacbca2f0b24a0394c4bb285","title":"手指长度可预测运动能力，往往更具攻击性","date":"2017-09-18 16:06","category":"头条","author_name":"一个科普","url":"http://mini.eastday.com/mobile/170918160654767.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170918/20170918_93346400b13a4e43ab85b6c2be54fe7d_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170918/20170918_ef5bb8db015b60d5345dbbca4fa86ffd_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170918/20170918_f18e7fad863fd69d2fb5069eb03fa74d_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{
         * "uniquekey":"d15d4489682dfe4b8b536b6d55e8dfc9"
         * ,"title":"金庸笔下的武学奇才，萧峰第五，第四最奇葩，第一无可争议"
         * ,"date":"2017-09-18 17:31"
         * ,"category":"头条"
         * ,"author_name":"娱乐全网通"
         * ,"url":"http://mini.eastday.com/mobile/170918173115603.html"
         * ,"thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170918/20170918_e8ae2ee84483a70e80c88e0b72b8a123_cover_mwpm_03200403.jpg"
         * ,"thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170918/20170918_d73fdfe293f04be7259528fd4c11e45e_cover_mwpm_03200403.jpg"
         * ,"thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170918/20170918_1a7c745fe1d9ad1b90db940a7ac1be6e_cover_mwpm_03200403.jpg"}
         *
         * ,{"uniquekey":"62199e83be3613f181518b069218e93c"
         * ,"title":"房灵敏任广西纪委书记 31省区市现任纪委书记名单"
         * ,"date":"2017-09-18 18:12"
         * ,"category":"头条"
         * ,"author_name":"人民网"
         * ,"url":"http://mini.eastday.com/mobile/170918181206593.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170918/20170918181206_cc372a7a9e45605b3323ddfefaeb2ad8_1_mwpm_03200403.jpg"},
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : d15d4489682dfe4b8b536b6d55e8dfc9
             * title : 金庸笔下的武学奇才，萧峰第五，第四最奇葩，第一无可争议
             * date : 2017-09-18 17:31
             * category : 头条
             * author_name : 娱乐全网通
             * url : http://mini.eastday.com/mobile/170918173115603.html
             * thumbnail_pic_s : http://05.imgmini.eastday.com/mobile/20170918/20170918_e8ae2ee84483a70e80c88e0b72b8a123_cover_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://05.imgmini.eastday.com/mobile/20170918/20170918_d73fdfe293f04be7259528fd4c11e45e_cover_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://05.imgmini.eastday.com/mobile/20170918/20170918_1a7c745fe1d9ad1b90db940a7ac1be6e_cover_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
