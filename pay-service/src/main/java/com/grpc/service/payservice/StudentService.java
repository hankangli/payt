package com.grpc.service.payservice;

import com.grpc.lib.Student;
import com.grpc.lib.StudentServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;

/**
 * @ClassName StudentService
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/14 16:00
 * @Version 1.0
 **/
@Slf4j
@GrpcService(Student.class)
public class StudentService extends StudentServiceGrpc.StudentServiceImplBase {

    /**
     * @Author hankangli
     * @Description 获取学生信息
     * @Date  2020/3/14 16:12
     * @Param [request, responseObserver]
     * @return void
     **/
    public void getStudentInfo(Student.StudentRequest request, StreamObserver<Student.StudentInfo> responseObserver){
        String id = request.getId();
        System.err.println("服务被发现了，值："+id);
        Student.StudentInfo studentInfo = Student.StudentInfo.newBuilder().setName("hankangli").setAge("18").setId("3333").build();
        responseObserver.onNext(studentInfo);
        responseObserver.onCompleted();
    }
}
