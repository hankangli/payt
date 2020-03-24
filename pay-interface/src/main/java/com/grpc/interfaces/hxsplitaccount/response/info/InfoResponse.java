package com.grpc.interfaces.hxsplitaccount.response.info;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName InfoResponse
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/5 10:13
 * @Version 1.0
 **/
@Data
public class InfoResponse implements Serializable {
    private static final long serialVersionUID = -9039770543150829777L;
    private String MerchantNo;
    private String CompanyProperty;
    private String CreadScope;
    private String BusinesLicence;
    private String CommercialAddr;
    private String ChinaCode;
    private String CommercialUrl;
    private String LegalBusinessName;
    private String LegalPapersType;
    private String LegalPapersCode;
    private String Contact;
    private String ContactPhone;
    private String FaxCode;
    private String EmailAddr;
    private String BusinessIp;
    private String State;
    private String CommercialEndDay;
    private String InterUrl;
    private String CusManagerCode;
    private String CusManagerArea;
    private String CusManagerName;
    private String IsMessagerSever;
    private String TradeMessagerPhone;
    private String IsStopOutMoney;
    private String IsStopInMoney;
    private String IsMoneyModifyState;
    private String LinkWay;
    private String SettleAccountRatio;
    private String SettleMemoRatio;
    private String InOutOuathSign;
    private String SubAccount;
    private String OutComeAccount;
    private String OutComeAccountName;
    private String OutComeAccountBank;
    private String OutComeAccountIDType;
    private String OutComeAccountIDCode;
}
