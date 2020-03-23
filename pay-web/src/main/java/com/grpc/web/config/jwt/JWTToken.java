package com.grpc.web.config.jwt;
import org.apache.shiro.authc.AuthenticationToken;
/**
 * @ClassName JWTToken
 * @Description JWTToken
 * @Author hankangli
 * @Date 2020/3/15 10:32
 * @Version 1.0
 **/
public class JWTToken implements AuthenticationToken{

    private static final long serialVersionUID = 1L;
    // 秘钥
    private String token;


    public JWTToken(String token) {
        this.token = token;
    }



    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
