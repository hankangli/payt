package com.grpc.interfaces.hxsplitaccount.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName WithdrawalRequest
 * @Description 本行出金
 * @Author hankangli
 * @Date 2020/3/4 15:48
 * @Version 1.0
 **/
@Data
public class WithdrawalRequest implements Serializable {

    private static final long serialVersionUID = 735585800196534461L;
    private String subAccount;//
    private String tradeMemCode;//
    private String outComeMoney;//
    private String channelNo;//
    private String sumSubMoney;//
    private String otherBankCost;//
    private String cusPayMoney;//
    private String merOtherPayMoney;//
    private String outComeAccountType;//
    private String outAccount;//
    private String outAccountName;//
    private String tradeAbstract;//
}
