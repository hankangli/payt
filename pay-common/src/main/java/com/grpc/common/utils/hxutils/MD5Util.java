package com.grpc.common.utils.hxutils;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.DigestUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/**
 * MD5加密
 */
public class MD5Util {

    private static Logger logger = LoggerFactory.getLogger(MD5Util.class);

    /**
     * 签名属性名 sign
     **/
    private static final String SIGN_KEY = "sign";

    /**
     * 密钥属性名key
     **/
    private static final String SECRET_KEY = "key";

    /**
     * 计算签名
     *
     * @param map    要参与签名的map数据
     * @param md5Key 密钥
     * @return 签名
     */
    public static String getSign(Map<String, ?> map, String md5Key) {
        ArrayList<String> list = new ArrayList<String>();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            if (entry.getKey().equals(SIGN_KEY)) {
                continue;
            }
            if (entry.getValue() != null && !"".equals(entry.getValue())) {
                list.add(entry.getKey() + "=" + entry.getValue() + "&");
            }
        }
        int size = list.size();
        String[] arrayToSort = list.toArray(new String[size]);
        Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(arrayToSort[i]);
        }
        sb.append(SECRET_KEY).append("=").append(md5Key);
        String str2Sign = sb.toString();
        String result = DigestUtils.md5DigestAsHex(str2Sign.getBytes()).toUpperCase();
        logger.info("MD5签名原始串：{}，签名结果：{}", new Object[]{str2Sign, result});
        return result;
    }

    /**
     * 计算签名
     *
     * @param jsonObject 要参与签名的json数据
     * @param md5Key     密钥
     * @return 签名
     */
    public static String getSign(JSONObject jsonObject, String md5Key) {
        ArrayList<String> list = new ArrayList<String>();
        for (Map.Entry<String, Object> entry : jsonObject.entrySet()) {
            if (entry.getKey().equals(SIGN_KEY)) {
                continue;
            }
            if (entry.getValue() != null && !"".equals(entry.getValue())) {
                list.add(entry.getKey() + "=" + entry.getValue() + "&");
            }
        }
        int size = list.size();
        String[] arrayToSort = list.toArray(new String[size]);
        Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(arrayToSort[i]);
        }
        sb.append(SECRET_KEY).append("=").append(md5Key);
        String str2Sign = sb.toString();
        String result = DigestUtils.md5DigestAsHex(str2Sign.getBytes()).toUpperCase();
        logger.info("MD5签名原始串：{}，签名结果：{}", new Object[]{str2Sign, result});
        return result;
    }

    /**
     * 验证签名
     *
     * @param map    要参与签名的map数据
     * @param md5Key 密钥
     * @param sign   签名
     * @return
     */
    public static boolean verifySign(Map<String, ?> map, String md5Key, String sign) {
        String md5Text = getSign(map, md5Key);
        return md5Text.equalsIgnoreCase(sign);
    }

    /**
     * 验证签名
     *
     * @param jsonObject 要参与签名的json数据
     * @param md5Key     密钥
     * @param sign       签名
     * @return
     */
    public static boolean verifySign(JSONObject jsonObject, String md5Key, String sign) {
        String md5Text = getSign(jsonObject, md5Key);
        return md5Text.equalsIgnoreCase(sign);
    }

}
