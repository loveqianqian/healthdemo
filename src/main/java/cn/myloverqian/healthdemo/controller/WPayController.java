package cn.myloverqian.healthdemo.controller;

import cn.myloverqian.healthdemo.constants.WeixinConstant;
import cn.myloverqian.healthdemo.utils.WXPayUtil;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedOutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * cn.myloverqian.healthdemo.controller
 *
 * @author zhiwei
 * @create 2017-12-02 10:53.
 * @github {@https://github.com/loveqianqian}
 */
@Controller
@RequestMapping("/wpay")
public class WPayController {

    @RequestMapping(value = "/notify", method = {RequestMethod.POST}, produces = MediaType.APPLICATION_XML_VALUE)
    public
    @ResponseBody
    Map<String, Object>
    weixin_notify(@RequestBody String originalMsg) throws Exception {
        System.out.println("receive : " + originalMsg);
        Map<String, Object> resultMap = new HashMap<>();
        //解析xml成map
        Map<String, String> parseMap = WXPayUtil.xmlToMap(originalMsg);
        // 账号信息
        String key = WeixinConstant.appId; // key
        //判断签名是否正确
        if (WXPayUtil.isSignatureValid(parseMap, key)) {
            //------------------------------
            //处理业务开始
            //------------------------------
            String resXml;
            if ("SUCCESS".equals(parseMap.get("result_code"))) {
                // 这里是支付成功
                //////////执行自己的业务逻辑////////////////
                String mch_id = parseMap.get("mch_id");
                String openid = parseMap.get("openid");
                String is_subscribe = parseMap.get("is_subscribe");
                String out_trade_no = parseMap.get("out_trade_no");
                String total_fee = parseMap.get("total_fee");
                System.out.println(String.format("mch_id: %s ,openid: %s ,is_subscribe: %s ,out_trade_no: %s , total_fee: %s", mch_id, openid, is_subscribe, out_trade_no, total_fee));
                //////////执行自己的业务逻辑////////////////
                System.out.println("支付成功");
                //通知微信.异步确认成功.必写.不然会一直通知后台.八次之后就认为交易失败了.
                resultMap.put("return_code", "SUCCESS");
                resultMap.put("return_msg", "OK");
//                resXml = "<xml><return_code><![CDATA[SUCCESS]]></return_code><return_msg><![CDATA[OK]]></return_msg></xml> ";
            } else {
                System.out.println("支付失败,错误信息：" + parseMap.get("err_code"));
                resultMap.put("return_msg", "报文为空");
                resultMap.put("return_msg", "FAIL");
//                resXml = "<xml><return_msg><![CDATA[报文为空]]></return_msg><return_code><![CDATA[FAIL]]></return_code></xml>";
            }
            //------------------------------
            //处理业务完毕
            //------------------------------
//            BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
//            out.write(resXml.getBytes());
//            out.flush();
//            out.close();
        } else {
            System.out.println("通知签名验证失败");
        }
        return resultMap;
    }
}
