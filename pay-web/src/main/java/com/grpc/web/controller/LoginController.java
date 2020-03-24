package com.grpc.web.controller;

import com.grpc.interfaces.returndata.ReturnDatas;
import com.grpc.interfaces.user.User;
import com.grpc.web.config.jwt.JWTUtil;
import com.grpc.web.grpcservice.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * @ClassName LoginController
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/15 11:51
 * @Version 1.0
 **/
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserClientService userClientService;


    @PostMapping("/userInfo")
    public ReturnDatas<User> getUserInfo(@RequestParam("username") String username,
                                         @RequestParam("password") String password, HttpServletResponse response) throws UnsupportedEncodingException {

        User user = userClientService.getUser(username);
        if (user.getPassword().equals(password)) {

            String token = JWTUtil.sign(username, password);
            response.setHeader("token", token);
            return new ReturnDatas(200,"登录成功",token);
        }else {
            return new ReturnDatas(200,"登录失败",null);
        }

    }
}
