package com.grpc.entiy.hxsplitaccount.response.withdrawal;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName WithdrawalResponse
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/4 16:04
 * @Version 1.0
 **/
@Data
public class WithdrawalResponse implements Serializable {

    private static final long serialVersionUID = 8630110914854036337L;
    private String PayCode;//
    private String SubAccountMoney;//
    private String FreezeMoney;//
    private String Remark1;//
    private String Remark2;//
    private String Remark3;//
    private String Remark4;//
    private String Remark5;//
}
