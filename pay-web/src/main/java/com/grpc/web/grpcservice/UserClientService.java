package com.grpc.web.grpcservice;

import com.grpc.interfaces.user.User;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserClientService
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/15 11:08
 * @Version 1.0
 **/
@Service
public class UserClientService {

    public User getUser(String userName){
        if(userName.equals("hankangli")){
            User user = new User();
            user.setName(userName);
            user.setPassword("123456");
            user.setRole("a");
            user.setPerms("b");
            user.setUserId("123345345");
            return user;
        }else {
            return null;
        }

    }
}
