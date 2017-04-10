package bean;

import java.util.List;

/**
 * 用途：
 * author：王倩凤Administrator
 * date:2017/4/10.
 */

public class NewBean {


    /**
     * error_code : 0
     * reason : 成功的返回
     * result : {"data":[{"author_name":"观察者网","category":"国际","date":"2017-04-21 21:30","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170421/20170421213010_40029e57cb37fef1a5a9e250c2c9d6f0_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170421/20170421213010_40029e57cb37fef1a5a9e250c2c9d6f0_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170421/20170421213010_40029e57cb37fef1a5a9e250c2c9d6f0_3_mwpm_03200403.jpeg","title":"6人14年1300万封口费 美国金牌主持人性丑闻缠身","uniquekey":"9737457f52c4e616f8a8fceb2b897c11","url":"http://mini.eastday.com/mobile/170421213010474.html"},{"author_name":"人民网-日本频道","category":"国际","date":"2017-04-10 13:59","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170410/20170410135949_87d604b26ae9f2a13d5ea1ba42039d99_1_mwpm_03200403.jpeg","title":"日本中部机场胶囊酒店开业 钟点房每小时1000日元","uniquekey":"f0236a3f645b5231a56da86a66d3a987","url":"http://mini.eastday.com/mobile/170410135949277.html"},{"author_name":"中国新闻网","category":"国际","date":"2017-04-10 13:59","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170410/20170410135917_4b814bade585156fbcb21cfbf002dca3_1_mwpm_03200403.jpeg","title":"韩国在全球最先推出\u201c盲文护照\u201d 海外旅行更便利","uniquekey":"3a180c192a1efc959f9cd1ab89b32544","url":"http://mini.eastday.com/mobile/170410135917207.html"},{"author_name":"看看新闻Knews","category":"国际","date":"2017-04-10 13:58","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170410/20170410135858_7cebc34be38a1cf79ca6aec29266eded_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170410/20170410135858_7cebc34be38a1cf79ca6aec29266eded_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170410/20170410135858_7cebc34be38a1cf79ca6aec29266eded_3_mwpm_03200403.jpeg","title":"美常驻联合国大使：有伊朗、俄罗斯、巴沙尔 叙利亚看不到和平","uniquekey":"d02a52406c622b882973008498e05257","url":"http://mini.eastday.com/mobile/170410135858715.html"},{"author_name":"生活趣闻吧","category":"国际","date":"2017-04-10 13:53","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170410/20170410_137c023bfd4543ecbdbfb3a46c69b9a7_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170410/20170410_31da9027c640338df0f915a7d6cb6194_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170410/20170410_fbcbc620568d869aa884e2c68b819e61_cover_mwpm_03200403.jpeg","title":"美国居民一庭院遭遇虫子入侵，要是中国人见了就高兴坏了！","uniquekey":"b0d7a29037fbcc61955ce68ba77b6baa","url":"http://mini.eastday.com/mobile/170410135352499.html"},{"author_name":"中国新闻网","category":"国际","date":"2017-04-10 13:53","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170410/20170410135322_112bbb7ce5a9638c6293f1f65de03a38_1_mwpm_03200403.jpeg","title":"俄媒：美国飞机将在俄罗斯进行观察飞行","uniquekey":"0631c9134419f98ad6fc7610166acd25","url":"http://mini.eastday.com/mobile/170410135322399.html"},{"author_name":"亚洲经济中文网","category":"国际","date":"2017-04-10 13:51","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170410/20170410135158_97afa01a0ca40ab5ccb18a2090404774_1_mwpm_03200403.jpeg","title":"LG电子第1季度营业利润9215亿韩元","uniquekey":"05b1c5c12ca913221709bdbf65ab9183","url":"http://mini.eastday.com/mobile/170410135158296.html"},{"author_name":"日本窗","category":"国际","date":"2017-04-10 13:50","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170410/20170410135021_2ea30fb373359ef129b6553205d7f52a_12_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170410/20170410135021_2ea30fb373359ef129b6553205d7f52a_11_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170410/20170410135021_2ea30fb373359ef129b6553205d7f52a_1_mwpm_03200403.jpeg","title":"Excel居然能画画？论手绘大师，除了这位日本老爷爷，我谁都不服！","uniquekey":"31f1dfd00b2ddfae736f2e9dc1349c64","url":"http://mini.eastday.com/mobile/170410135021501.html"},{"author_name":"日本窗","category":"国际","date":"2017-04-10 13:50","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170410/20170410135021_07e92262405ad9e3600af78ec75b1645_9_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170410/20170410135021_07e92262405ad9e3600af78ec75b1645_10_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170410/20170410135021_07e92262405ad9e3600af78ec75b1645_5_mwpm_03200403.jpeg","title":"日本妹子约会都化什么妆？2017年最佳妆容竟然是这个！","uniquekey":"8cebe313edbd231b2e15c3f570b21a6b","url":"http://mini.eastday.com/mobile/170410135021201.html"},{"author_name":"中国侨网","category":"国际","date":"2017-04-10 13:47","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170410/20170410134709_f4350943687e656aa48fae94e95e2c89_1_mwpm_03200403.jpeg","title":"西班牙华人酒吧卫生不达标遭罚款 提醒侨胞注意","uniquekey":"b0b6fbf7f927915e8bfcefe30f841ee5","url":"http://mini.eastday.com/mobile/170410134709883.html"},{"author_name":"中国网","category":"国际","date":"2017-04-10 13:46","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170410/20170410134652_5bd47e53a2c42e7cc65f308476e72da5_1_mwpm_03200403.png","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170410/20170410134652_35304d09917b075d4bb1e95f0a79f09d_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170410/20170410134652_5a6446cd495e4d3f4bcc121946632af1_3_mwpm_03200403.jpeg","title":"南苏丹赤道地区：恐惧笼罩 希望犹存","uniquekey":"a1edd3931bf651c8dd2c39765cfd2da5","url":"http://mini.eastday.com/mobile/170410134652872.html"},{"author_name":"国搜头条","category":"国际","date":"2017-04-10 13:46","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170410/20170410134616_37f2d22aad1534703908b092a0894b4e_1_mwpm_03200403.jpeg","title":"缅怀一战中牺牲华工　在法华侨参加公祭仪式","uniquekey":"cd411d68cf639db44c8427408719bfff","url":"http://mini.eastday.com/mobile/170410134616109.html"},{"author_name":"中国网","category":"国际","date":"2017-04-10 13:45","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170410/20170410134508_a103f6a770bd6e3e5f2974b1e6cfbfe8_1_mwpm_03200403.jpeg","title":"红十字国际委员会：急需加强应对非洲饥荒工作力度","uniquekey":"13b2df970c93451aabcb5b72b09e410d","url":"http://mini.eastday.com/mobile/170410134508604.html"},{"author_name":"镜观世界","category":"国际","date":"2017-04-10 13:44","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170410/20170410_bc613241d58df8c24d90da81d8d3f84f_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170410/20170410_f5ffd96e5f61450bd6937bd99934d693_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170410/20170410_17595508f93f2db73cc3dc18d86cde02_cover_mwpm_03200403.jpeg","title":"我国一邻国：经济落后，盛产罂粟，男少女多","uniquekey":"86b089a0ea49856cc68da98ece943206","url":"http://mini.eastday.com/mobile/170410134402681.html"},{"author_name":"海外网","category":"国际","date":"2017-04-10 13:42","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170410/20170410134218_c3915c53814c2b4f2742460c24562ee9_1_mwpm_03200403.jpeg","title":"新加坡赛林丹李宗伟缺阵 谌龙首轮迎来复仇战","uniquekey":"060ae8b0095dee24b2ac2cbd628fd3b4","url":"http://mini.eastday.com/mobile/170410134218797.html"},{"author_name":"海外网","category":"国际","date":"2017-04-10 13:42","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170410/20170410134218_43f38eaec1d7ac6c33e7faf142b993f9_1_mwpm_03200403.jpeg","title":"中国演员受邀新加坡 \u201c潮州好声音\u201d决赛评委","uniquekey":"a181e34cfc7545698a91d3eb869f766e","url":"http://mini.eastday.com/mobile/170410134218312.html"},{"author_name":"新民晚报","category":"国际","date":"2017-04-10 13:40","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170410/20170410134031_4f310f70596439a5353652358d3b2c46_1_mwpm_03200403.jpeg","title":"\u201c习特会\u201d：两国元首对表 夯实中美\u201c大厦\u201d","uniquekey":"d30793a678219f96bddd9cc495e8192f","url":"http://mini.eastday.com/mobile/170410134031264.html"},{"author_name":"央视财经","category":"国际","date":"2017-04-10 13:37","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170410/20170410133728_4aae2c6416aac8dc76596b98d42c9028_1_mwpm_03200403.jpeg","title":"中国煎饼成纽约爆款：一天卖数百个 一个卖上百元","uniquekey":"ceedae42a5ba2fd659df71f4718ca159","url":"http://mini.eastday.com/mobile/170410133728625.html"},{"author_name":"北京时间","category":"国际","date":"2017-04-10 13:33","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170410/20170410133302_e90fbde856930cfa4d52bad3fe5c4d4c_1_mwpm_03200403.jpeg","title":"澳大利亚或对所有跨境网购征收GST，eBay等电商平台不乐意了","uniquekey":"e5e8420898f4f87aa536546013c787da","url":"http://mini.eastday.com/mobile/170410133302956.html"},{"author_name":"国搜头条","category":"国际","date":"2017-04-10 13:27","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170410/20170410132723_d1c2a9b73785f6ac344834b8cb36734a_1_mwpm_03200403.jpeg","title":"化学武器疑云很难消散　叙利亚局势会失控吗","uniquekey":"6e71b3a62ffe8d0472be752eeabb8a27","url":"http://mini.eastday.com/mobile/170410132723254.html"},{"author_name":"逗比女王榜","category":"国际","date":"2017-04-10 13:26","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170410/20170410_8459702535787dd186e13c5aa7eca1d1_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170410/20170410_8f1fafeea6e797fcd77d9b6fd2ad418d_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170410/20170410_252d6bc2a5cc740acac87b5b5d6c614c_cover_mwpm_03200403.jpeg","title":"狮王残忍撕咬幼鬣狗，狗妈妈选择了默默呆在一旁！","uniquekey":"a047afc8f519599c316abb73959deb7f","url":"http://mini.eastday.com/mobile/170410132602542.html"},{"author_name":"深圳特区报","category":"国际","date":"2017-04-10 13:24","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170410/20170410132420_0fbd008485f7c1b27866454d2e8eeafe_1_mwpm_03200403.jpeg","title":"法警方缴获3.5吨武器弹药","uniquekey":"385f087514b81d56ba0667ed60c93aaf","url":"http://mini.eastday.com/mobile/170410132420463.html"},{"author_name":"育儿百科圈","category":"国际","date":"2017-04-10 13:23","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170410/20170410_382d4e8975595fa6d2a0f9c6ff306d81_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170410/20170410_78e6d79e34590586df5491178cdfd80d_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170410/20170410_fc3bbbdb478af6e09ccb80604404db28_cover_mwpm_03200403.jpeg","title":"鬣狗竟敢叫板狮王？没想到结局出乎所有人意料之外！","uniquekey":"7cfbf35db4af93766bee4859b3e0729a","url":"http://mini.eastday.com/mobile/170410132355206.html"},{"author_name":"思维敏捷方","category":"国际","date":"2017-04-10 13:23","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170410/20170410_549130a30ac87a48acb12b5efd03bb02_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170410/20170410_f04c6adf350ad43c7f84324617f14f3a_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170410/20170410_64e1245757b3b2845b15c5438847e166_cover_mwpm_03200403.jpeg","title":" 镜头下：一夫多妻之国，干活卖力，穷的不行","uniquekey":"93d75ff23f6ae1ba1d94901a4008243f","url":"http://mini.eastday.com/mobile/170410132355114.html"},{"author_name":"育儿百科圈","category":"国际","date":"2017-04-10 13:22","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170410/20170410_59e2f5c3108350daffd4038df06a7a1e_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170410/20170410_d99d6738bc28ee921745c366f2b601c6_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170410/20170410_510c993520b1f859ffa86cad656a4c3a_cover_mwpm_03200403.jpeg","title":"狮子妈妈为保护幼狮向同类求救，却遭到了这样的待遇！","uniquekey":"aa001e73005ffc5d6bb3c981b257a184","url":"http://mini.eastday.com/mobile/170410132229099.html"},{"author_name":"玩转云南","category":"国际","date":"2017-04-10 13:22","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170410/20170410132210_44b3656d49d96b3b44ee5b6d42b3b3cc_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170410/20170410132210_44b3656d49d96b3b44ee5b6d42b3b3cc_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170410/20170410132210_44b3656d49d96b3b44ee5b6d42b3b3cc_3_mwpm_03200403.jpeg","title":"东南亚地区是这样过泼水节的！","uniquekey":"505802aa7fe36e383139636a0e218a99","url":"http://mini.eastday.com/mobile/170410132210095.html"},{"author_name":"玩转云南","category":"国际","date":"2017-04-10 13:22","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170410/20170410132207_22663479df8e4e5729cef67dc97868c5_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170410/20170410132207_22663479df8e4e5729cef67dc97868c5_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170410/20170410132207_22663479df8e4e5729cef67dc97868c5_3_mwpm_03200403.jpeg","title":"老挝\u201c千佛古都\u201d的泼水节，你要来一发吗？","uniquekey":"4e1b2f8e0598bbd508ab6183471a6208","url":"http://mini.eastday.com/mobile/170410132207977.html"},{"author_name":"北京时间","category":"国际","date":"2017-04-10 13:20","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170410/20170410132054_5bc8f58851100c56946cb55b2dccecbb_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170410/20170410132054_5bc8f58851100c56946cb55b2dccecbb_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170410/20170410132054_5bc8f58851100c56946cb55b2dccecbb_3_mwpm_03200403.jpeg","title":"被敌国占领, 他们不仅不驱逐侵略者, 却要效忠, 这个国家令人瞠目","uniquekey":"c1241ac162b4739d8db9fab2aa87fc10","url":"http://mini.eastday.com/mobile/170410132054376.html"},{"author_name":"中非工业论坛","category":"国际","date":"2017-04-10 13:20","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170410/20170410132052_fb132a0bf5b6bca521a8ed8f1ea49327_1_mwpm_03200403.png","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170410/20170410132052_fb132a0bf5b6bca521a8ed8f1ea49327_2_mwpm_03200403.png","title":"驻赞比亚使馆举办赞中资企业和华人华侨座谈会","uniquekey":"ee26c5d331506186d0e4f9464cbc0e43","url":"http://mini.eastday.com/mobile/170410132052021.html"},{"author_name":"知辨天下事","category":"国际","date":"2017-04-10 13:20","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170410/20170410_913ad242819d25c5e7e8a6cf8f715a39_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170410/20170410_1fb1d78baaf9d42d4524386163b94682_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170410/20170410_a9d2d5a47be77eb561eb8c92026a9dbb_cover_mwpm_03200403.jpeg","title":"双胞胎姐妹和孪生哥俩结婚二十多年，日常生活经常遭遇尴尬","uniquekey":"348dc306c4cb29465578b90a2f715a88","url":"http://mini.eastday.com/mobile/170410132010044.html"}],"stat":"1"}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

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

    public static class ResultBean {
        /**
         * data : [{"author_name":"观察者网","category":"国际","date":"2017-04-21 21:30","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170421/20170421213010_40029e57cb37fef1a5a9e250c2c9d6f0_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170421/20170421213010_40029e57cb37fef1a5a9e250c2c9d6f0_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170421/20170421213010_40029e57cb37fef1a5a9e250c2c9d6f0_3_mwpm_03200403.jpeg","title":"6人14年1300万封口费 美国金牌主持人性丑闻缠身","uniquekey":"9737457f52c4e616f8a8fceb2b897c11","url":"http://mini.eastday.com/mobile/170421213010474.html"},{"author_name":"人民网-日本频道","category":"国际","date":"2017-04-10 13:59","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170410/20170410135949_87d604b26ae9f2a13d5ea1ba42039d99_1_mwpm_03200403.jpeg","title":"日本中部机场胶囊酒店开业 钟点房每小时1000日元","uniquekey":"f0236a3f645b5231a56da86a66d3a987","url":"http://mini.eastday.com/mobile/170410135949277.html"},{"author_name":"中国新闻网","category":"国际","date":"2017-04-10 13:59","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170410/20170410135917_4b814bade585156fbcb21cfbf002dca3_1_mwpm_03200403.jpeg","title":"韩国在全球最先推出\u201c盲文护照\u201d 海外旅行更便利","uniquekey":"3a180c192a1efc959f9cd1ab89b32544","url":"http://mini.eastday.com/mobile/170410135917207.html"},{"author_name":"看看新闻Knews","category":"国际","date":"2017-04-10 13:58","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170410/20170410135858_7cebc34be38a1cf79ca6aec29266eded_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170410/20170410135858_7cebc34be38a1cf79ca6aec29266eded_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170410/20170410135858_7cebc34be38a1cf79ca6aec29266eded_3_mwpm_03200403.jpeg","title":"美常驻联合国大使：有伊朗、俄罗斯、巴沙尔 叙利亚看不到和平","uniquekey":"d02a52406c622b882973008498e05257","url":"http://mini.eastday.com/mobile/170410135858715.html"},{"author_name":"生活趣闻吧","category":"国际","date":"2017-04-10 13:53","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170410/20170410_137c023bfd4543ecbdbfb3a46c69b9a7_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170410/20170410_31da9027c640338df0f915a7d6cb6194_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170410/20170410_fbcbc620568d869aa884e2c68b819e61_cover_mwpm_03200403.jpeg","title":"美国居民一庭院遭遇虫子入侵，要是中国人见了就高兴坏了！","uniquekey":"b0d7a29037fbcc61955ce68ba77b6baa","url":"http://mini.eastday.com/mobile/170410135352499.html"},{"author_name":"中国新闻网","category":"国际","date":"2017-04-10 13:53","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170410/20170410135322_112bbb7ce5a9638c6293f1f65de03a38_1_mwpm_03200403.jpeg","title":"俄媒：美国飞机将在俄罗斯进行观察飞行","uniquekey":"0631c9134419f98ad6fc7610166acd25","url":"http://mini.eastday.com/mobile/170410135322399.html"},{"author_name":"亚洲经济中文网","category":"国际","date":"2017-04-10 13:51","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170410/20170410135158_97afa01a0ca40ab5ccb18a2090404774_1_mwpm_03200403.jpeg","title":"LG电子第1季度营业利润9215亿韩元","uniquekey":"05b1c5c12ca913221709bdbf65ab9183","url":"http://mini.eastday.com/mobile/170410135158296.html"},{"author_name":"日本窗","category":"国际","date":"2017-04-10 13:50","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170410/20170410135021_2ea30fb373359ef129b6553205d7f52a_12_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170410/20170410135021_2ea30fb373359ef129b6553205d7f52a_11_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170410/20170410135021_2ea30fb373359ef129b6553205d7f52a_1_mwpm_03200403.jpeg","title":"Excel居然能画画？论手绘大师，除了这位日本老爷爷，我谁都不服！","uniquekey":"31f1dfd00b2ddfae736f2e9dc1349c64","url":"http://mini.eastday.com/mobile/170410135021501.html"},{"author_name":"日本窗","category":"国际","date":"2017-04-10 13:50","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170410/20170410135021_07e92262405ad9e3600af78ec75b1645_9_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170410/20170410135021_07e92262405ad9e3600af78ec75b1645_10_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170410/20170410135021_07e92262405ad9e3600af78ec75b1645_5_mwpm_03200403.jpeg","title":"日本妹子约会都化什么妆？2017年最佳妆容竟然是这个！","uniquekey":"8cebe313edbd231b2e15c3f570b21a6b","url":"http://mini.eastday.com/mobile/170410135021201.html"},{"author_name":"中国侨网","category":"国际","date":"2017-04-10 13:47","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170410/20170410134709_f4350943687e656aa48fae94e95e2c89_1_mwpm_03200403.jpeg","title":"西班牙华人酒吧卫生不达标遭罚款 提醒侨胞注意","uniquekey":"b0b6fbf7f927915e8bfcefe30f841ee5","url":"http://mini.eastday.com/mobile/170410134709883.html"},{"author_name":"中国网","category":"国际","date":"2017-04-10 13:46","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170410/20170410134652_5bd47e53a2c42e7cc65f308476e72da5_1_mwpm_03200403.png","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170410/20170410134652_35304d09917b075d4bb1e95f0a79f09d_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170410/20170410134652_5a6446cd495e4d3f4bcc121946632af1_3_mwpm_03200403.jpeg","title":"南苏丹赤道地区：恐惧笼罩 希望犹存","uniquekey":"a1edd3931bf651c8dd2c39765cfd2da5","url":"http://mini.eastday.com/mobile/170410134652872.html"},{"author_name":"国搜头条","category":"国际","date":"2017-04-10 13:46","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170410/20170410134616_37f2d22aad1534703908b092a0894b4e_1_mwpm_03200403.jpeg","title":"缅怀一战中牺牲华工　在法华侨参加公祭仪式","uniquekey":"cd411d68cf639db44c8427408719bfff","url":"http://mini.eastday.com/mobile/170410134616109.html"},{"author_name":"中国网","category":"国际","date":"2017-04-10 13:45","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170410/20170410134508_a103f6a770bd6e3e5f2974b1e6cfbfe8_1_mwpm_03200403.jpeg","title":"红十字国际委员会：急需加强应对非洲饥荒工作力度","uniquekey":"13b2df970c93451aabcb5b72b09e410d","url":"http://mini.eastday.com/mobile/170410134508604.html"},{"author_name":"镜观世界","category":"国际","date":"2017-04-10 13:44","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170410/20170410_bc613241d58df8c24d90da81d8d3f84f_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170410/20170410_f5ffd96e5f61450bd6937bd99934d693_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170410/20170410_17595508f93f2db73cc3dc18d86cde02_cover_mwpm_03200403.jpeg","title":"我国一邻国：经济落后，盛产罂粟，男少女多","uniquekey":"86b089a0ea49856cc68da98ece943206","url":"http://mini.eastday.com/mobile/170410134402681.html"},{"author_name":"海外网","category":"国际","date":"2017-04-10 13:42","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170410/20170410134218_c3915c53814c2b4f2742460c24562ee9_1_mwpm_03200403.jpeg","title":"新加坡赛林丹李宗伟缺阵 谌龙首轮迎来复仇战","uniquekey":"060ae8b0095dee24b2ac2cbd628fd3b4","url":"http://mini.eastday.com/mobile/170410134218797.html"},{"author_name":"海外网","category":"国际","date":"2017-04-10 13:42","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170410/20170410134218_43f38eaec1d7ac6c33e7faf142b993f9_1_mwpm_03200403.jpeg","title":"中国演员受邀新加坡 \u201c潮州好声音\u201d决赛评委","uniquekey":"a181e34cfc7545698a91d3eb869f766e","url":"http://mini.eastday.com/mobile/170410134218312.html"},{"author_name":"新民晚报","category":"国际","date":"2017-04-10 13:40","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170410/20170410134031_4f310f70596439a5353652358d3b2c46_1_mwpm_03200403.jpeg","title":"\u201c习特会\u201d：两国元首对表 夯实中美\u201c大厦\u201d","uniquekey":"d30793a678219f96bddd9cc495e8192f","url":"http://mini.eastday.com/mobile/170410134031264.html"},{"author_name":"央视财经","category":"国际","date":"2017-04-10 13:37","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170410/20170410133728_4aae2c6416aac8dc76596b98d42c9028_1_mwpm_03200403.jpeg","title":"中国煎饼成纽约爆款：一天卖数百个 一个卖上百元","uniquekey":"ceedae42a5ba2fd659df71f4718ca159","url":"http://mini.eastday.com/mobile/170410133728625.html"},{"author_name":"北京时间","category":"国际","date":"2017-04-10 13:33","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170410/20170410133302_e90fbde856930cfa4d52bad3fe5c4d4c_1_mwpm_03200403.jpeg","title":"澳大利亚或对所有跨境网购征收GST，eBay等电商平台不乐意了","uniquekey":"e5e8420898f4f87aa536546013c787da","url":"http://mini.eastday.com/mobile/170410133302956.html"},{"author_name":"国搜头条","category":"国际","date":"2017-04-10 13:27","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170410/20170410132723_d1c2a9b73785f6ac344834b8cb36734a_1_mwpm_03200403.jpeg","title":"化学武器疑云很难消散　叙利亚局势会失控吗","uniquekey":"6e71b3a62ffe8d0472be752eeabb8a27","url":"http://mini.eastday.com/mobile/170410132723254.html"},{"author_name":"逗比女王榜","category":"国际","date":"2017-04-10 13:26","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170410/20170410_8459702535787dd186e13c5aa7eca1d1_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170410/20170410_8f1fafeea6e797fcd77d9b6fd2ad418d_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170410/20170410_252d6bc2a5cc740acac87b5b5d6c614c_cover_mwpm_03200403.jpeg","title":"狮王残忍撕咬幼鬣狗，狗妈妈选择了默默呆在一旁！","uniquekey":"a047afc8f519599c316abb73959deb7f","url":"http://mini.eastday.com/mobile/170410132602542.html"},{"author_name":"深圳特区报","category":"国际","date":"2017-04-10 13:24","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170410/20170410132420_0fbd008485f7c1b27866454d2e8eeafe_1_mwpm_03200403.jpeg","title":"法警方缴获3.5吨武器弹药","uniquekey":"385f087514b81d56ba0667ed60c93aaf","url":"http://mini.eastday.com/mobile/170410132420463.html"},{"author_name":"育儿百科圈","category":"国际","date":"2017-04-10 13:23","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170410/20170410_382d4e8975595fa6d2a0f9c6ff306d81_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170410/20170410_78e6d79e34590586df5491178cdfd80d_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170410/20170410_fc3bbbdb478af6e09ccb80604404db28_cover_mwpm_03200403.jpeg","title":"鬣狗竟敢叫板狮王？没想到结局出乎所有人意料之外！","uniquekey":"7cfbf35db4af93766bee4859b3e0729a","url":"http://mini.eastday.com/mobile/170410132355206.html"},{"author_name":"思维敏捷方","category":"国际","date":"2017-04-10 13:23","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170410/20170410_549130a30ac87a48acb12b5efd03bb02_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170410/20170410_f04c6adf350ad43c7f84324617f14f3a_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170410/20170410_64e1245757b3b2845b15c5438847e166_cover_mwpm_03200403.jpeg","title":" 镜头下：一夫多妻之国，干活卖力，穷的不行","uniquekey":"93d75ff23f6ae1ba1d94901a4008243f","url":"http://mini.eastday.com/mobile/170410132355114.html"},{"author_name":"育儿百科圈","category":"国际","date":"2017-04-10 13:22","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170410/20170410_59e2f5c3108350daffd4038df06a7a1e_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170410/20170410_d99d6738bc28ee921745c366f2b601c6_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170410/20170410_510c993520b1f859ffa86cad656a4c3a_cover_mwpm_03200403.jpeg","title":"狮子妈妈为保护幼狮向同类求救，却遭到了这样的待遇！","uniquekey":"aa001e73005ffc5d6bb3c981b257a184","url":"http://mini.eastday.com/mobile/170410132229099.html"},{"author_name":"玩转云南","category":"国际","date":"2017-04-10 13:22","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170410/20170410132210_44b3656d49d96b3b44ee5b6d42b3b3cc_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170410/20170410132210_44b3656d49d96b3b44ee5b6d42b3b3cc_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170410/20170410132210_44b3656d49d96b3b44ee5b6d42b3b3cc_3_mwpm_03200403.jpeg","title":"东南亚地区是这样过泼水节的！","uniquekey":"505802aa7fe36e383139636a0e218a99","url":"http://mini.eastday.com/mobile/170410132210095.html"},{"author_name":"玩转云南","category":"国际","date":"2017-04-10 13:22","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170410/20170410132207_22663479df8e4e5729cef67dc97868c5_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170410/20170410132207_22663479df8e4e5729cef67dc97868c5_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170410/20170410132207_22663479df8e4e5729cef67dc97868c5_3_mwpm_03200403.jpeg","title":"老挝\u201c千佛古都\u201d的泼水节，你要来一发吗？","uniquekey":"4e1b2f8e0598bbd508ab6183471a6208","url":"http://mini.eastday.com/mobile/170410132207977.html"},{"author_name":"北京时间","category":"国际","date":"2017-04-10 13:20","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170410/20170410132054_5bc8f58851100c56946cb55b2dccecbb_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170410/20170410132054_5bc8f58851100c56946cb55b2dccecbb_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170410/20170410132054_5bc8f58851100c56946cb55b2dccecbb_3_mwpm_03200403.jpeg","title":"被敌国占领, 他们不仅不驱逐侵略者, 却要效忠, 这个国家令人瞠目","uniquekey":"c1241ac162b4739d8db9fab2aa87fc10","url":"http://mini.eastday.com/mobile/170410132054376.html"},{"author_name":"中非工业论坛","category":"国际","date":"2017-04-10 13:20","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170410/20170410132052_fb132a0bf5b6bca521a8ed8f1ea49327_1_mwpm_03200403.png","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170410/20170410132052_fb132a0bf5b6bca521a8ed8f1ea49327_2_mwpm_03200403.png","title":"驻赞比亚使馆举办赞中资企业和华人华侨座谈会","uniquekey":"ee26c5d331506186d0e4f9464cbc0e43","url":"http://mini.eastday.com/mobile/170410132052021.html"},{"author_name":"知辨天下事","category":"国际","date":"2017-04-10 13:20","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170410/20170410_913ad242819d25c5e7e8a6cf8f715a39_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170410/20170410_1fb1d78baaf9d42d4524386163b94682_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170410/20170410_a9d2d5a47be77eb561eb8c92026a9dbb_cover_mwpm_03200403.jpeg","title":"双胞胎姐妹和孪生哥俩结婚二十多年，日常生活经常遭遇尴尬","uniquekey":"348dc306c4cb29465578b90a2f715a88","url":"http://mini.eastday.com/mobile/170410132010044.html"}]
         * stat : 1
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
             * author_name : 观察者网
             * category : 国际
             * date : 2017-04-21 21:30
             * thumbnail_pic_s : http://02.imgmini.eastday.com/mobile/20170421/20170421213010_40029e57cb37fef1a5a9e250c2c9d6f0_1_mwpm_03200403.jpeg
             * thumbnail_pic_s02 : http://02.imgmini.eastday.com/mobile/20170421/20170421213010_40029e57cb37fef1a5a9e250c2c9d6f0_2_mwpm_03200403.jpeg
             * thumbnail_pic_s03 : http://02.imgmini.eastday.com/mobile/20170421/20170421213010_40029e57cb37fef1a5a9e250c2c9d6f0_3_mwpm_03200403.jpeg
             * title : 6人14年1300万封口费 美国金牌主持人性丑闻缠身
             * uniquekey : 9737457f52c4e616f8a8fceb2b897c11
             * url : http://mini.eastday.com/mobile/170421213010474.html
             */

            private String author_name;
            private String category;
            private String date;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;
            private String title;
            private String uniquekey;
            private String url;

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
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

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
