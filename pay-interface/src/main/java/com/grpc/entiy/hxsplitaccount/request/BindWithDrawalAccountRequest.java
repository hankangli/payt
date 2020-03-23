package com.grpc.entiy.hxsplitaccount.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName BindWithDrawalAccountRequest
 * @Description 绑定出入金账户
 * @Author hankangli
 * @Date 2020/3/4 13:39
 * @Version 1.0
 **/
@Data
public class BindWithDrawalAccountRequest implements Serializable {
    private static final long serialVersionUID = 8941056689740143460L;
    private String operType;//
    private String subAccount;//
    private String tradeMemCode;//
    private String linkAccountType;//
    private String isOther;//
    private String accountSign;//
    private String isOtherBank;//
    private String settleAccountName;//
    private String settleAccount;//
    private String isSecondAcc;//
    private String payBank;//
    private String bankName;//
    private String papersType;//
    private String papersCode;//
    private String strideValidate;//
    private String currCode;//

}
