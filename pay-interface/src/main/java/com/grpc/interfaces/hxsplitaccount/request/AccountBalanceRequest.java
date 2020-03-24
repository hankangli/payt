package com.grpc.interfaces.hxsplitaccount.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName AccountBalanceRequest
 * @Description 账户余额
 * @Author hankangli
 * @Date 2020/3/4 14:43
 * @Version 1.0
 **/
@Data
public class AccountBalanceRequest implements Serializable {
    private static final long serialVersionUID = 2846353191985132143L;
    private String account;//
    private String memBerCode;//
    private String accountType;//
    private String remark1;//
    private String remark2;//
}
