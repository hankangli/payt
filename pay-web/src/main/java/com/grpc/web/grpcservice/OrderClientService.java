package com.grpc.web.grpcservice;

import com.grpc.base.lib.Order;
import com.grpc.base.lib.OrderServiceGrpc;
import io.grpc.Channel;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
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
public class OrderClientService {

    @GrpcClient("grpc-base-provider")
    private Channel serverChannel;


    public Map<String, Object> getOrderInfo() {

        Map<String, Object> resMap = new HashMap<>();
        OrderServiceGrpc.OrderServiceBlockingStub stub = OrderServiceGrpc.newBlockingStub(serverChannel);
        Order.OrderInfo orderInfo = stub.getOrderInfo(Order.OrderRequest.newBuilder().setId("88888").build());
        resMap.put("id", orderInfo.getId());
        resMap.put("name", orderInfo.getName());
        resMap.put("age", orderInfo.getAge());
        return resMap;
    }
}
