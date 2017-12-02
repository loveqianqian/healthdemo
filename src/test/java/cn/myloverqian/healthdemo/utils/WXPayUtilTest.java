package cn.myloverqian.healthdemo.utils;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * cn.myloverqian.healthdemo.utils
 *
 * @author zhiwei
 * @create 2017-12-03 1:39.
 * @github {@https://github.com/loveqianqian}
 */
public class WXPayUtilTest {
    @Test
    public void xmlToMap() throws Exception {
    }

    @Test
    public void mapToXml() throws Exception {
    }

    @Test
    public void generateSignedXml() throws Exception {
    }

    @Test
    public void generateSignedXml1() throws Exception {
        Map<String, String> result = new HashMap<>();
        result.put("appid", "wxc6a325a114e9dd40");
        result.put("sign", "C5E07A2C3CF572D850B092C248E8044BF365FBFD3A1CA2624DDB5DE3F8E1B84F");
        boolean wxc6a325a114e9dd40 = WXPayUtil.isSignatureValid(result, "wxc6a325a114e9dd40");
        System.out.println(wxc6a325a114e9dd40);
    }

    @Test
    public void isSignatureValid() throws Exception {
        String stringA = "appid=wxc6a325a114e9dd40&body=腾讯充值中心-QQ会员充值&device_info=&mch_id=1490390862&nonce_str=5620b945bec4499e947f20a832d22d27";
        String stringSignTemp = stringA + "&key=57fcbbe5499d35852f3f6dedc86fa8ee"; //注：key为商户平台设置的密钥key
        String sign = WXPayUtil.MD5(stringSignTemp).toUpperCase();
        System.out.println(sign);
    }

    @Test
    public void isSignatureValid1() throws Exception {
    }

    @Test
    public void isSignatureValid2() throws Exception {
    }

    @Test
    public void generateSignature() throws Exception {
    }

    @Test
    public void generateSignature1() throws Exception {
    }

}