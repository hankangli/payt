package com.grpc.web.controller;

import com.grpc.interfaces.hxsplitaccount.request.PayAccountRequest;
import com.grpc.web.grpcservice.HxClientService;
import com.grpc.web.grpcservice.OrderClientService;
import com.grpc.web.grpcservice.StudentClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @ClassName StudentController
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/14 16:13
 * @Version 1.0
 **/
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentClientService studentClientService;

    @Autowired
    private OrderClientService orderClientService;


    @Autowired
    private HxClientService hxClientService;

    @PostMapping("/info")
    public Map<String, Object> getStudentInfo() {
        Map<String, Object> resMap = studentClientService.getStudentInfo();
        return resMap;
    }


    @PostMapping("/orderInfo")
    public Map<String, Object> getOrderInfo() {
        Map<String, Object> resMap = orderClientService.getOrderInfo();
        return resMap;
    }

    @PostMapping("/createInfo")
    public Map<String, Object> createInfo() {
        Map<String, Object> resMap = hxClientService.createSonAccount();
        return resMap;
    }

    @PostMapping("/payInfo")
    public Map<String, Object> payInfo(PayAccountRequest request) {
        Map<String, Object> resMap = hxClientService.payAccount(request);
        return resMap;
    }
}
