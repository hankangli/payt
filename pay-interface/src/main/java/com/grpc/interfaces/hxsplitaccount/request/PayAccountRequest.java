package com.grpc.interfaces.hxsplitaccount.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName PayAccountRequest
 * @Description 账户之间的转账
 * @Author hankangli
 * @Date 2020/3/4 14:59
 * @Version 1.0
 **/
@Data
public class PayAccountRequest implements Serializable {

    private static final long serialVersionUID = 6179510911084769388L;
    private String payCode;//
    private String paySubAccount;//
    private String tradeMemCode;//
    private String payeesSubAccount;//
    private String tradeAccount;//
    private String tradeCurrency;//
    private String tradeAbstract;//

}
