package com.grpc.entiy.hxsplitaccount.response.payInfoList;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName Cycle
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/4 11:41
 * @Version 1.0
 **/
@Data
public class Cycle implements Serializable {
    private static final long serialVersionUID = 5704496680167654639L;
    private String SubAccount;//
    private String Orders;//
    private String TransCode;//
    private String OtherSubAccount;//
    private String CreMoney;//
    private String PayPayeeSign;//
    private String SubAccountMoney;//
    private String TransCodeId;//
    private String TradeTimes;//
}
