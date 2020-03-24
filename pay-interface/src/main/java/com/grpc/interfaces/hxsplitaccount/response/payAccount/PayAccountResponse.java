package com.grpc.interfaces.hxsplitaccount.response.payAccount;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName PayAccountResponse
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/4 15:07
 * @Version 1.0
 **/
@Data
public class PayAccountResponse implements Serializable {
    private static final long serialVersionUID = 6553095186099411618L;
    private String PayCode;//
    private String SubAccountMoney;//
    private String FreezeMoney;//
    private String Remark1;//
    private String Remark2;//
    private String Remark3;//
    private String Remark4;//
    private String Remark5;//
}
