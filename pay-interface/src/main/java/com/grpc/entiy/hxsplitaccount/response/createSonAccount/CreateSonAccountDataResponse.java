package com.grpc.entiy.hxsplitaccount.response.createSonAccount;


import com.grpc.hx.lib.Hxpay;
import com.mzywx.common.anno.ProtoField;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName MessageData
 * @Description 返回值
 * @Author hankangli
 * @Date 2020/3/2 10:04
 * @Version 1.0
 **/
@Data
public class CreateSonAccountDataResponse implements Serializable {
    private static final long serialVersionUID = -5802264686644978548L;
    @ProtoField(TargetClass = Hxpay.Base.class)
    private com.grpc.entiy.hxsplitaccount.entity.Base Base;
    @ProtoField(TargetClass = Hxpay.ResHeader.class)
    private com.grpc.entiy.hxsplitaccount.entity.ResHeader ResHeader;
    @ProtoField(TargetClass = Hxpay.CreateSonAccountResponse.class)
    private CreateSonAccountResponse DataBody;

}
