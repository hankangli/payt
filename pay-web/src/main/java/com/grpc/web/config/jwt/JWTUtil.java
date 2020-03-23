package com.grpc.web.config.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName JWTUtil
 * @Description JWTUtil
 * @Author hankangli
 * @Date 2020/3/15 10:36
 * @Version 1.0
 **/
public class JWTUtil {

    // 过期时间24小时
    private static final long EXPRIE_TIME = 24 * 60 * 60 * 1000;

    public static boolean verify(String token, String username, String secret) {
        try {
            Algorithm algorithm = Algorithm.HMAC512(secret);
            JWTVerifier verifier = JWT.require(algorithm)
                    .withClaim("username", username)
                    .build();
            DecodedJWT verify = verifier.verify(token);
            Map<String, Claim> claims = verify.getClaims();
            claims.forEach((k,v) -> {
                System.err.println(k + "== > "+v);
            });
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * @param token
     * @return
     * @Title: getUsername
     * @Description: 获取token中的信息无需secret解密也能获得
     * @Author 刘仁
     * @DateTime 2019年4月1日 下午4:42:39
     */
    public static String getUsername(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            String username = jwt.getClaim("username").asString();
            return username;
        } catch (JWTDecodeException e) {
            return null;
        }
    }

    public static String sign(String username, String secret) throws UnsupportedEncodingException {
        Date date = new Date(System.currentTimeMillis() + EXPRIE_TIME);
        Algorithm algorithm = Algorithm.HMAC512(secret);
        // 附带username信息
        String sign = JWT.create()
                .withClaim("username", username)
                .withExpiresAt(date)
                .sign(algorithm);
        return sign;
    }


}
