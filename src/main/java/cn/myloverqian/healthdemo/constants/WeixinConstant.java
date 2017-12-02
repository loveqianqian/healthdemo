package cn.myloverqian.healthdemo.constants;

/**
 * cn.myloveqian.weipay
 *
 * @author zhiwei
 * @create 2017-10-31 23:03.
 * @github {@https://github.com/loveqianqian}
 */
public class WeixinConstant {
    public enum SignType {
        MD5, HMACSHA256
    }

    public static final String FIELD_SIGN = "sign";

    public static final String FIELD_SIGN_TYPE = "sign_type";

    public static final String FAIL     = "FAIL";

    public static final String SUCCESS  = "SUCCESS";

    public static final String appId = "wxc6a325a114e9dd40";

    public static final String mchId = "1490390862";

    public static final String appSecret="57fcbbe5499d35852f3f6dedc86fa8ee";

    public static final String apiKey="ilwWIwSoWEeyhhzFMgKSHd88lqtZgfBI";

    //public static final String localPath=System.getProperty("apiclient_cert.p12");

//    public static final String localPath="/home/zhiwei/cert/apiclient_cert.p12";
    public static final String localPath="C:/data/apiclient_cert.p12";
//    public static final String localPath="C:/apiclient_cert.p12";


    /**
     * 申请退款
     */
    public static final String refund="https://api.mch.weixin.qq.com/secapi/pay/refund";

    /**
     * 查询退款
     */
    public static final String refundquery="https://api.mch.weixin.qq.com/pay/refundquery";

    /**
     * 下载对账单
     */
    public static final String downloadbill="https://api.mch.weixin.qq.com/pay/downloadbill";

    /**
     * 提交刷卡支付
     */
    public static final String micropay="https://api.mch.weixin.qq.com/pay/micropay";

    /**
     * 查询订单
     */
    public static final String orderquery="https://api.mch.weixin.qq.com/pay/orderquery";

    /**
     * 撤销订单
     */
    public static final String reverse="https://api.mch.weixin.qq.com/secapi/pay/reverse";

    /**
     * 交易保障
     */
    public static final String report="https://api.mch.weixin.qq.com/payitil/report";

    /**
     * 转换短链接
     */
    public static final String shorturl="https://api.mch.weixin.qq.com/tools/shorturl";

    /**
     * 授权码查询openid
     */
    public static final String authcodetoopenid="https://api.mch.weixin.qq.com/tools/authcodetoopenid";

    /**
     * 退款结果通知
     */
    public static final String noticeUrl="";
}
