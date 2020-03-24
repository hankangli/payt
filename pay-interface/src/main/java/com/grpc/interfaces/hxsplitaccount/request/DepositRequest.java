package com.grpc.interfaces.hxsplitaccount.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName DepositRequest
 * @Description 入金
 * @Author hankangli
 * @Date 2020/3/4 16:25
 * @Version 1.0
 **/
@Data
public class DepositRequest implements Serializable {
    private static final long serialVersionUID = 3822273062945570873L;
    private String subAccount;//
    private String tradeMemCode;//
    private String inMoney;//
    private String tradeAbstract;//

}
