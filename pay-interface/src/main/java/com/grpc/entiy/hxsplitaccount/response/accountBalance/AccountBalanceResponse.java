package com.grpc.entiy.hxsplitaccount.response.accountBalance;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName AccountBalanceResponse
 * @Description 账户余额
 * @Author hankangli
 * @Date 2020/3/4 14:49
 * @Version 1.0
 **/
@Data
public class AccountBalanceResponse implements Serializable {
    private static final long serialVersionUID = 3805357053406631498L;
    private String Account;//
    private String AccountName;//
    private String SubAccountMoney;//
    private String FreezeMoney;//
    private String Remark1;//
    private String Remark2;//

}
