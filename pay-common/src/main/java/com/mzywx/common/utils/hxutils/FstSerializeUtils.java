package com.mzywx.common.utils.hxutils;


import org.nustaq.serialization.FSTConfiguration;


/**
 * ProtoStuff 序列化/反序列化工具
 */
public class FstSerializeUtils {

    static FSTConfiguration conf = FSTConfiguration.createDefaultConfiguration();


//    public static GrpcCommonRequest deserialize(CommonRequest request) {
//
//        GrpcCommonRequest grpcCommonRequest = (GrpcCommonRequest) conf.asObject(request.getRequest().toByteArray());
//
//        return grpcCommonRequest;
//    }
//
//    public static GrpcCommonResponse deserialize(CommonResponse response) {
//
//        GrpcCommonResponse grpcCommonResponse = (GrpcCommonResponse) conf
//                .asObject(response.getResponse().toByteArray());
//
//        return grpcCommonResponse;
//    }
//
//    public static ByteString serialize(GrpcCommonResponse response) {
//        return ByteString.copyFrom(conf.asByteArray(response));
//    }
//
//    public static ByteString serialize(GrpcCommonRequest request) {
//        return ByteString.copyFrom(conf.asByteArray(request));
//    }

}
