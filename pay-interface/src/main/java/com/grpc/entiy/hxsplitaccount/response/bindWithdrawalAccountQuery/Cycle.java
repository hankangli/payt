package com.grpc.entiy.hxsplitaccount.response.bindWithdrawalAccountQuery;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName Cycle
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/4 14:32
 * @Version 1.0
 **/
@Data
public class Cycle implements Serializable {
    private static final long serialVersionUID = -2615999445021500561L;
    private String Order;//
    private String SubAccount;//
    private String TradeMemCode;//
    private String MerchantNo;//
    private String OutComeAccountType;//
    private String IsOther;//
    private String AccountSign;//
    private String IsOtherBank;//
    private String SettleAccountName;//
    private String SettleAccount;//
    private String PayBank;//
    private String BankName;//
    private String ModifyDate;//
    private String OuathEndTimes;//
    private String LinkState;//
    private String OuathWay;//
    private String Remark1;//
    private String Remark2;//

}
