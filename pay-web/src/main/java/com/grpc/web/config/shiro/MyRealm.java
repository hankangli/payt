package com.grpc.web.config.shiro;


import com.grpc.interfaces.user.User;
import com.grpc.web.config.jwt.JWTToken;
import com.grpc.web.config.jwt.JWTUtil;
import com.grpc.web.grpcservice.UserClientService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName MyRealm
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/15 10:34
 * @Version 1.0
 **/
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private UserClientService userService;

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JWTToken;
    }


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username = JWTUtil.getUsername(principals.toString());
        User user = userService.getUser(username);
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addRole(user.getRole());
        Set<String> permission = new HashSet<String>(Arrays.asList(user.getPerms().split(",")));
        simpleAuthorizationInfo.addStringPermissions(permission);

        return simpleAuthorizationInfo;
    }

    /**
     * 默认使用此方法进行用户正确与否验证，错误抛出异常即可
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String token = (String) authenticationToken.getCredentials();
        // 解密获得username，用于和数据库进行对比
        String username = JWTUtil.getUsername(token);
        if (username == null) {
            throw new AuthenticationException("token 无效！");
        }
        User user = userService.getUser(username);
        if (user == null) {
            throw new AuthenticationException("用户" + username + "不存在");
        }

        if (!JWTUtil.verify(token, username, user.getPassword())) {
            throw new AuthenticationException("账户密码错误!");
        }
        return new SimpleAuthenticationInfo(token, token, "my_realm");
    }
}
