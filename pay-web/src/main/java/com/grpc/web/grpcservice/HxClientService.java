package com.grpc.web.grpcservice;

import com.grpc.entiy.hxsplitaccount.request.PayAccountRequest;
import com.grpc.entiy.hxsplitaccount.response.createSonAccount.CreateSonAccountCpmB2BResponse;
import com.grpc.entiy.hxsplitaccount.response.createSonAccount.CreateSonAccountDataResponse;
import com.grpc.entiy.hxsplitaccount.response.payAccount.PayAccountCpmResponse;
import com.grpc.hx.lib.HxServiceGrpc;
import com.grpc.hx.lib.Hxpay;
import io.grpc.Channel;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.apache.commons.beanutils.BeanUtils;
import org.nustaq.serialization.FSTConfiguration;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName HxClientService
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/16 15:07
 * @Version 1.0
 **/
@Service
public class HxClientService {

    @GrpcClient("grpc-pay-provider")
    private Channel serverChannel;


    public Map<String, Object> createSonAccount() {
        HxServiceGrpc.HxServiceBlockingStub stub = HxServiceGrpc.newBlockingStub(serverChannel);
        Hxpay.CreateSonAccountCpmB2BResponse account = stub.createSonAccount(Hxpay.CreateSonAccountRequest.newBuilder().setBusinessName("hahah").build());
//        CreateSonAccountDataResponse co = account.getMessageData();
        //
        System.err.println(account);
        return new HashMap<>();
    }

    public Map<String, Object> payAccount(PayAccountRequest request) {
        HxServiceGrpc.HxServiceBlockingStub stub = HxServiceGrpc.newBlockingStub(serverChannel);
//        Hxpay.PayAccountRequest payAccountRequest = Hxpay.PayAccountRequest.newBuilder()
//                .setPayCode(request.getPayCode())
//                .setPaySubAccount(request.getPaySubAccount())
//                .setTradeMemCode(request.getTradeMemCode())
//                .setPayeesSubAccount(request.getPayeesSubAccount())
//                .setTradeAccount(request.getTradeAccount())
//                .setTradeCurrency(request.getTradeCurrency())
//                .setTradeAbstract(request.getTradeAbstract())
//                .build();
        Hxpay.PayAccountCpmResponse account = stub.payAccount(Hxpay.PayAccountRequest.newBuilder().build());

//        PayAccountCpmResponse payAccountCpmResponse = new PayAccountCpmResponse();

        FSTConfiguration configuration = FSTConfiguration.createDefaultConfiguration();
        configuration.asJsonString(account);
        PayAccountCpmResponse payAccountCpmResponse = (PayAccountCpmResponse) configuration.asObject(account.toByteArray());
        System.err.println(payAccountCpmResponse);
        return new HashMap<>();
    }
}
