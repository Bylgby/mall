/**
 * created date 2020/6/19 10:27
 *
 * @author maxiaowei
 */
public class TestDemo {

    public static void main(String[] args) {
        String str = "    `advertiser_id` STRING COMMENT '广告主id',\n" +
                "    `main_id` STRING COMMENT '管家账户id',\n" +
                "    `campaign_id` STRING COMMENT '广告组id',\n" +
                "    `campaign_name` STRING COMMENT '广告组名称',\n" +
                "    `ad_id` STRING COMMENT '计划id',\n" +
                "    `ad_name` STRING COMMENT '计划名称',\n" +
                "    `creative_id` STRING COMMENT '创意id',\n" +
                "    `show` STRING COMMENT '展示',\n" +
                "    `click` STRING COMMENT '点击',\n" +
                "    `cost` STRING COMMENT '花费',\n" +
                "    `next_day_open_rate` STRING COMMENT '应用下载广告数据-次留率（未对回)',\n" +
                "    `pre_loan_credit_cost` STRING COMMENT '应用下载广告数据-预授信成本',\n" +
                "    `follow` STRING COMMENT '互动数据-新增关注数',\n" +
                "    `valid_play_rate` STRING COMMENT '视频数据-有效播放率',\n" +
                "    `redirect` STRING COMMENT '落地页转化数据-页面跳转',\n" +
                "    `valid_play` STRING COMMENT '视频数据-有效播放数',\n" +
                "    `in_app_uv` STRING COMMENT '应用下载广告数据-APP内访问',\n" +
                "    `active_register_cost` STRING COMMENT '应用下载广告数据-注册成本',\n" +
                "    `loan_credit` STRING COMMENT '应用下载广告数据-授信数',\n" +
                "    `total_play` STRING COMMENT '视频数据-播放数',\n" +
                "    `loan_credit_rate` STRING COMMENT '应用下载广告数据-授信率',\n" +
                "    `home_visited` STRING COMMENT '互动数据-主页访问量',\n" +
                "    `qq` STRING COMMENT '落地页转化数据-QQ咨询',\n" +
                "    `like` STRING COMMENT '互动数据-点赞数',\n" +
                "    `active_cost` STRING COMMENT '应用下载广告数据-激活成本',\n" +
                "    `button` STRING COMMENT '落地页转化数据-按钮button',\n" +
                "    `loan_completion_cost` STRING COMMENT '应用下载广告数据-完件成本',\n" +
                "    `avg_show_cost` STRING COMMENT '展现数据-平均千次展现费用',\n" +
                "    `attribution_deep_convert_cost` STRING COMMENT '转化数据（计费时间）-深度转化成本（计费时间）',\n" +
                "    `attribution_deep_convert` STRING COMMENT '转化数据（计费时间）-深度转化数（计费时间）',\n" +
                "    `next_day_open` STRING COMMENT '应用下载广告数据-次留（未对回）',\n" +
                "    `view` STRING COMMENT '落地页转化数据-关键页面浏览',\n" +
                "    `download_finish_cost` STRING COMMENT '应用下载广告数据-安卓下载完成成本',\n" +
                "    `game_addiction_cost` STRING COMMENT '应用下载广告数据-关键行为成本',\n" +
                "    `active_rate` STRING COMMENT '应用下载广告数据-激活率',\n" +
                "    `advanced_creative_coupon_addition` STRING COMMENT '附加创意-附加创意卡券领取',\n" +
                "    `active_pay_cost` STRING COMMENT '应用下载广告数据-付费成本',\n" +
                "    `loan_completion` STRING COMMENT '应用下载广告数据-完件数',\n" +
                "    `download` STRING COMMENT '落地页转化数据-下载开始',\n" +
                "    `install_finish_rate` STRING COMMENT '应用下载广告数据-安卓安装完成率',\n" +
                "    `play_75_feed_break` STRING COMMENT '视频数据-75%进度播放数',\n" +
                "    `play_25_feed_break` STRING COMMENT '视频数据-25%进度播放数',\n" +
                "    `download_start_cost` STRING COMMENT '应用下载广告数据-安卓下载开始成本',\n" +
                "    `pay_count` STRING COMMENT '应用下载广告数据-付费数',\n" +
                "    `install_finish_cost` STRING COMMENT '应用下载广告数据-安卓安装完成成本',\n" +
                "    `play_duration_sum` STRING COMMENT '视频数据-播放时长，单位ms',\n" +
                "    `attribution_next_day_open_cost` STRING COMMENT '应用下载广告数据-次留成本',\n" +
                "    `play_over_rate` STRING COMMENT '视频数据-播完率',\n" +
                "    `play_50_feed_break` STRING COMMENT '视频数据-50%进度播放数',\n" +
                "    `ies_challenge_click` STRING COMMENT '互动数据-挑战赛查看数',\n" +
                "    `active` STRING COMMENT '应用下载广告数据-激活数',\n" +
                "    `attribution_next_day_open_cnt` STRING COMMENT '应用下载广告数据-次留数',\n" +
                "    `loan_completion_rate` STRING COMMENT '应用下载广告数据-完件率',\n" +
                "    `wifi_play` STRING COMMENT '视频数据-WiFi播放量',\n" +
                "    `convert` STRING COMMENT '转化数据-转化数',\n" +
                "    `ctr` STRING COMMENT '展现数据-点击率',\n" +
                "    `avg_click_cost` STRING COMMENT '展现数据-平均点击单价',\n" +
                "    `deep_convert_cost` STRING COMMENT '转化数据-深度转化成本',\n" +
                "    `phone_confirm` STRING COMMENT '落地页转化数据-智能电话-确认拨打',\n" +
                "    `install_finish` STRING COMMENT '应用下载广告数据-安卓安装完成数',\n" +
                "    `attribution_convert_cost` STRING COMMENT '转化数据（计费时间）-转化成本（计费时间）',\n" +
                "    `consult_effective` STRING COMMENT '落地页转化数据-有效咨询',\n" +
                "    `comment` STRING COMMENT '互动数据-评论数',\n" +
                "    `coupon` STRING COMMENT '落地页转化数据-建站卡券领取',\n" +
                "    `convert_rate` STRING COMMENT '转化数据-转化率',\n" +
                "    `active_register_rate` STRING COMMENT '应用下载广告数据-注册率',\n" +
                "    `game_addiction` STRING COMMENT '应用下载广告数据-关键行为数',\n" +
                "    `vote` STRING COMMENT '落地页转化数据-投票',\n" +
                "    `message` STRING COMMENT '落地页转化数据-短信咨询',\n" +
                "    `interact_per_cost` STRING,\n" +
                "    `lottery` STRING COMMENT '落地页转化数据-抽奖',\n" +
                "    `download_finish_rate` STRING COMMENT '应用下载广告数据-安卓下载完成率',\n" +
                "    `loan_credit_cost` STRING COMMENT '应用下载广告数据-授信成本',\n" +
                "    `deep_convert_rate` STRING COMMENT '转化数据-深度转化率',\n" +
                "    `convert_cost` STRING COMMENT '转化数据-转化成本',\n" +
                "    `shopping` STRING COMMENT '落地页转化数据-商品购买',\n" +
                "    `form` STRING COMMENT '落地页转化数据-表单提交',\n" +
                "    `advanced_creative_phone_click` STRING COMMENT '附加创意-附加创意电话按钮点击',\n" +
                "    `location_click` STRING COMMENT '互动数据-POI点击数',\n" +
                "    `phone` STRING COMMENT '落地页转化数据-点击电话按钮',\n" +
                "    `wifi_play_rate` STRING COMMENT '视频数据-WiFi播放占比',\n" +
                "    `consult` STRING COMMENT '落地页转化数据-在线咨询',\n" +
                "    `game_addiction_rate` STRING COMMENT '应用下载广告数据-关键行为率',\n" +
                "    `active_pay_rate` STRING COMMENT '应用下载广告数据-付费率',\n" +
                "    `download_start` STRING COMMENT '应用下载广告数据-安卓下载开始数',\n" +
                "    `map_search` STRING COMMENT '落地页转化数据-地图搜索',\n" +
                "    `in_app_order` STRING COMMENT '应用下载广告数据-APP内下单',\n" +
                "    `attribution_convert` STRING COMMENT '转化数据（计费时间）-转化数（计费时间）',\n" +
                "    `pre_loan_credit` STRING COMMENT '应用下载广告数据-预授信数',\n" +
                "    `share` STRING COMMENT '互动数据-分享数',\n" +
                "    `click_install` STRING COMMENT '应用下载广告数据-点击安装数',\n" +
                "    `deep_convert` STRING COMMENT '转化数据-深度转化数',\n" +
                "    `phone_connect` STRING COMMENT '落地页转化数据-智能电话-确认接通',\n" +
                "    `ies_music_click` STRING COMMENT '互动数据-音乐查看数',\n" +
                "    `play_100_feed_break` STRING COMMENT '视频数据-99%进度播放数',\n" +
                "    `coupon_single_page` STRING COMMENT '落地页转化数据-卡券页领取',\n" +
                "    `valid_play_cost` STRING COMMENT '视频数据-有效播放成本',\n" +
                "    `download_start_rate` STRING COMMENT '应用下载广告数据-安卓下载开始率',\n" +
                "    `attribution_next_day_open_rate` STRING COMMENT '应用下载广告数据-次留率',\n" +
                "    `download_finish` STRING COMMENT '应用下载广告数据-安卓下载完成数',\n" +
                "    `stat_datetime` STRING COMMENT '数据起始时间',\n" +
                "    `inventory` STRING COMMENT '广告位置',\n" +
                "    `advanced_creative_counsel_click` STRING COMMENT '附加创意-附加创意在线咨询点击',\n" +
                "    `in_app_cart` STRING COMMENT '应用下载广告数据-APP内加入购物车',\n" +
                "    `in_app_detail_uv` STRING COMMENT '应用下载广告数据-APP内访问详情页',\n" +
                "    `average_play_time_per_play` STRING COMMENT '视频数据-平均单次播放时长',\n" +
                "    `wechat` STRING COMMENT '落地页转化数据-微信复制',\n" +
                "    `register` STRING COMMENT '应用下载广告数据-注册数',\n" +
                "    `in_app_pay` STRING COMMENT '应用下载广告数据-APP内付费',\n" +
                "    `next_day_open_cost` STRING COMMENT '应用下载广告数据-次留成本（未对回）',\n" +
                "    `advanced_creative_form_click` STRING COMMENT '附加创意-附加创意表单按钮点击'";

        String str1 = "\"advertiser_name\": \"\\u4e50\\u672a\\u6765-\\u4ebf\\u739b-\\u5934\\u6761-37\",\n" +
                "    \"show\": 11,\n" +
                "    \"next_day_open_rate\": 0.0,\n" +
                "    \"pre_loan_credit_cost\": 0.0,\n" +
                "    \"gender\": \"GENDER_FEMALE\",\n" +
                "    \"follow\": 0,\n" +
                "    \"valid_play_rate\": 0.0,\n" +
                "    \"redirect\": 0,\n" +
                "    \"title\": \"\\u3010\\u552e\\u5b8c\\u4e0b\\u67b6\\u3011\\uff01\\u539f\\u4ef7499\\uff0c\\u73b0\\u57289\\u514313\\u8bfe\\u65f6\\uff0c{\\u533a\\u53bf}\\u62a5\\u6ee1\\u622a\\u6b62\\uff01\",\n" +
                "    \"valid_play\": 0,\n" +
                "    \"in_app_uv\": 0,\n" +
                "    \"creative_modify_time\": \"2020-06-15 21:49:18\",\n" +
                "    \"active_register_cost\": 0.0,\n" +
                "    \"loan_credit\": 0,\n" +
                "    \"total_play\": 0,\n" +
                "    \"auto_extend_enabled\": 1,\n" +
                "    \"advertiser_id\": 1648268071452676,\n" +
                "    \"loan_credit_rate\": 0.0,\n" +
                "    \"ad_name\": \"0609-\\u4f189-\\u6570-\\u65871-\\u56fe\\u7247ymsmd29-M14-\\u5973-\\u6392\\u504f\\u8fdc-\\u667a\\u80fd\\u63a8\\u8350-\\u4e5037-24_49-\\u5934\\u6761-\\u624b\",\n" +
                "    \"home_visited\": 0,\n" +
                "    \"qq\": 0,\n" +
                "    \"like\": 0,\n" +
                "    \"active_cost\": 0.0,\n" +
                "    \"button\": 0,\n" +
                "    \"loan_completion_cost\": 0.0,\n" +
                "    \"avg_show_cost\": 4.55,\n" +
                "    \"attribution_deep_convert_cost\": 0.0,\n" +
                "    \"attribution_deep_convert\": 0,\n" +
                "    \"next_day_open\": 0,\n" +
                "    \"install_finish\": 0,\n" +
                "    \"download_finish_cost\": 0.0,\n" +
                "    \"creative_id_status\": \"CREATIVE_STATUS_AD_DISABLE\",\n" +
                "    \"game_addiction_cost\": 0.0,\n" +
                "    \"active_rate\": 0.0,\n" +
                "    \"campaign_id\": 1666375550142483,\n" +
                "    \"advanced_creative_coupon_addition\": 0,\n" +
                "    \"active_pay_cost\": 0.0,\n" +
                "    \"cost\": 0.05,\n" +
                "    \"loan_completion\": 0,\n" +
                "    \"pricing\": \"PRICING_OCPM\",\n" +
                "    \"download\": 0,\n" +
                "    \"click\": 0,\n" +
                "    \"install_finish_rate\": 0.0,\n" +
                "    \"play_75_feed_break\": 0,\n" +
                "    \"play_25_feed_break\": 0,\n" +
                "    \"creative_id\": 1669573067800621,\n" +
                "    \"download_start_cost\": 0.0,\n" +
                "    \"pay_count\": 0,\n" +
                "    \"install_finish_cost\": 0.0,\n" +
                "    \"image_ids\": [\"web.business.image/202006155d0d25393130e4f045a794d9\"],\n" +
                "    \"play_duration_sum\": 0,\n" +
                "    \"attribution_next_day_open_cost\": 0.0,\n" +
                "    \"play_over_rate\": 0.0,\n" +
                "    \"play_50_feed_break\": 0,\n" +
                "    \"ad_id\": 1669569332415547,\n" +
                "    \"retargeting_tags_exclude\": [306257264, 306254353, 306254350],\n" +
                "    \"learning_phase\": \"LEARNING\",\n" +
                "    \"ies_challenge_click\": 0,\n" +
                "    \"active\": 0,\n" +
                "    \"lottery\": 0,\n" +
                "    \"loan_completion_rate\": 0.0,\n" +
                "    \"wifi_play\": 0,\n" +
                "    \"convert\": 0,\n" +
                "    \"ctr\": 0.0,\n" +
                "    \"image_id\": null,\n" +
                "    \"avg_click_cost\": 0.0,\n" +
                "    \"video_id\": null,\n" +
                "    \"deep_convert_cost\": 0.0,\n" +
                "    \"wechat\": 0,\n" +
                "    \"view\": 0,\n" +
                "    \"campaign_status\": \"CAMPAIGN_STATUS_ENABLE\",\n" +
                "    \"attribution_convert_cost\": 0.0,\n" +
                "    \"consult_effective\": 0,\n" +
                "    \"comment\": 0,\n" +
                "    \"coupon\": 0,\n" +
                "    \"convert_rate\": 0.0,\n" +
                "    \"active_register_rate\": 0.0,\n" +
                "    \"main_id\": 3592857808279277,\n" +
                "    \"game_addiction\": 0,\n" +
                "    \"vote\": 0,\n" +
                "    \"campaign_name\": \"9\\u5143\\u6570\\u5b66-0511-\\u89c6\\u9891\",\n" +
                "    \"message\": 0,\n" +
                "    \"interact_per_cost\": 0.0,\n" +
                "    \"attribution_next_day_open_cnt\": 0,\n" +
                "    \"auto_extend_targets\": [\"REGION\", \"GENDER\", \"INTEREST_ACTION\", \"AGE\"],\n" +
                "    \"download_finish_rate\": 0.0,\n" +
                "    \"smart_bid_type\": \"SMART_BID_CUSTOM\",\n" +
                "    \"loan_credit_cost\": 0.0,\n" +
                "    \"deep_convert_rate\": 0.0,\n" +
                "    \"convert_cost\": 0.0,\n" +
                "    \"shopping\": 0,\n" +
                "    \"form\": 0,\n" +
                "    \"advanced_creative_phone_click\": 0,\n" +
                "    \"location_click\": 0,\n" +
                "    \"phone\": 0,\n" +
                "    \"wifi_play_rate\": 0.0,\n" +
                "    \"consult\": 0,\n" +
                "    \"game_addiction_rate\": 0.0,\n" +
                "    \"active_pay_rate\": 0.0,\n" +
                "    \"download_start\": 0,\n" +
                "    \"delivery_range\": \"DEFAULT\",\n" +
                "    \"map_search\": 0,\n" +
                "    \"budget\": 0.0,\n" +
                "    \"in_app_order\": 0,\n" +
                "    \"external_url\": \"https://www.xueersi.com/xes.php?source=278446501&site_id=1004&adsite_id=3982804&adid=__AID__&creativeid=__CID__&creativetype=__CTYPE__&clickid=__CLICKID__\",\n" +
                "    \"attribution_convert\": 0,\n" +
                "    \"pre_loan_credit\": 0,\n" +
                "    \"share\": 0,\n" +
                "    \"click_install\": 0,\n" +
                "    \"image_mode\": \"CREATIVE_IMAGE_MODE_SMALL\",\n" +
                "    \"deep_convert\": 0,\n" +
                "    \"phone_connect\": 0,\n" +
                "    \"download_start_rate\": 0.0,\n" +
                "    \"ies_music_click\": 0,\n" +
                "    \"play_100_feed_break\": 0,\n" +
                "    \"coupon_single_page\": 0,\n" +
                "    \"valid_play_cost\": 0.0,\n" +
                "    \"attribution_next_day_open_rate\": 0.0,\n" +
                "    \"download_finish\": 0,\n" +
                "    \"stat_datetime\": null,\n" +
                "    \"inventory\": null,\n" +
                "    \"advanced_creative_counsel_click\": 0,\n" +
                "    \"in_app_cart\": 0,\n" +
                "    \"creative_create_time\": \"2020-06-15 21:49:15\",\n" +
                "    \"in_app_detail_uv\": 0,\n" +
                "    \"status\": \"AD_STATUS_DISABLE\",\n" +
                "    \"average_play_time_per_play\": 0.0,\n" +
                "    \"phone_confirm\": 0,\n" +
                "    \"retargeting_tags_include\": [],\n" +
                "    \"landing_type\": \"LINK\",\n" +
                "    \"age\": [\"AGE_BETWEEN_24_30\", \"AGE_BETWEEN_31_40\", \"AGE_BETWEEN_41_49\"],\n" +
                "    \"register\": 0,\n" +
                "    \"in_app_pay\": 0,\n" +
                "    \"next_day_open_cost\": 0.0,\n" +
                "    \"advanced_creative_form_click\": 0";

        String[] arr = str.split("\n");
        String[] arr1 = str1.split("\n");

        for (String s1 : arr1) {
            boolean flag = false;
            String kkk = s1.substring(s1.indexOf("\"")+1, s1.indexOf(":") - 1);
            for (String s : arr) {
                String key = s.substring(s.indexOf("`")+1, s.lastIndexOf("`"));
                if ( key.equals(kkk) ) {
                    flag = true;
                    break;
                }
            }
            if ( !flag ) {
                System.out.print(kkk+ ",") ;
            }
        }
    }
}
