package com.grpc.interfaces.hxsplitaccount.response.createSonAccount;

import com.mzywx.common.anno.ProtoField;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName CreateSonAccountResponse
 * @Description 创建账户
 * @Author hankangli
 * @Date 2020/3/3 17:25
 * @Version 1.0
 **/
@Data
public class CreateSonAccountResponse implements Serializable {
    private static final long serialVersionUID = -5006537012118202864L;
    @ProtoField(Ignore = false)
    private String MemBerCode;//交易会员代码
    @ProtoField(Ignore = false)
    private String Remark1;//备注
    @ProtoField(Ignore = false)
    private String Remark2;//备注

}
