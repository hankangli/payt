package com.grpc.web.grpcservice;

import com.grpc.lib.Student;
import com.grpc.lib.StudentServiceGrpc;
import io.grpc.Channel;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName StudentClientService
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/14 16:14
 * @Version 1.0
 **/
@Service
public class StudentClientService {

    @GrpcClient("grpc-pay-provider")
    private Channel serverChannel;

    @Autowired
    private OrderClientService orderClientService;

    public Map<String,Object> getStudentInfo(){
        Map<String, Object> orderInfo1 = orderClientService.getOrderInfo();
        System.err.println("数据："+orderInfo1);
        Map<String,Object> resMap = new HashMap<>();
        StudentServiceGrpc.StudentServiceBlockingStub stub = StudentServiceGrpc.newBlockingStub(serverChannel);
        Student.StudentInfo studentInfo = stub.getStudentInfo(Student.StudentRequest.newBuilder().setId("88888").build());
        resMap.put("id",studentInfo.getId());
        resMap.put("name",studentInfo.getName());
        resMap.put("age",studentInfo.getAge());
        return resMap;
    }


}
