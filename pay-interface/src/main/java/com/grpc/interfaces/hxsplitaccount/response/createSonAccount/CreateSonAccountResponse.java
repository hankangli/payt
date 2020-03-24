package com.grpc.interfaces.hxsplitaccount.response.createSonAccount;

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
    private String MemBerCode;//交易会员代码
    private String Remark1;//备注
    private String Remark2;//备注

}
