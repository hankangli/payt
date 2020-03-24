package com.grpc.interfaces.hxsplitaccount.response.subAccountList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
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
    @XStreamAlias("Orders")
    private String Orders;//
    @XStreamAlias("SubAccount")
    private String SubAccount;//
    private String TradeMemBerName;//
    private String MemBerCode;//
    private String TradeMemBerGrade;//
    private String GradeCode;//
    private String MerchantNo;//
    private String SubAccountTime;//
    private String SubAccountState;//
    private String Contact;//
    private String ContactPhone;//
    private String Phone;//
    private String ContactAddr;//
    private String BusinessName;//
    private String PapersType;//
    private String PapersCode;//
    private String IsMessager;//
    private String MessagePhone;//
    private String Email;//
    private String Remark1;//
    private String Remark2;//
    private String Remark3;//
    private String Remark4;//
    private String Remark5;//
}
