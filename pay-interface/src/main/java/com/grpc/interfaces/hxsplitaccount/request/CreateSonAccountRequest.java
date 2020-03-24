package com.grpc.interfaces.hxsplitaccount.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName CreateSonAccountRequest
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/3 16:28
 * @Version 1.0
 **/
@Data
public class CreateSonAccountRequest implements Serializable {
    private static final long serialVersionUID = -2617346319093687716L;
    private String tradeMemBerName;//交易会员名称
    private String currency;//币种
    private String subAcc;//子帐号
    private String boothNo;//摊位号
    private String tradeMemBerGrade;//交易会员级别
    private String tradeMemberProperty;//交易会员性质
    private String contact;//联系人
    private String contactPhone;//联系电话
    private String phone;//手机号码
    private String contactAddr;//联系地址
    private String businessName;//法人姓名
    //证件类型  12 军官证 19 外国护照  13 士兵证 20 其他 17 组织机构代码证 11 护照 14 回乡证 10 身份证 15 户口本 16营业执照
    private String papersType;
    private String papersCode;//证件代码
    private String isMessager;//是否需要短信通知 1-需要 2-不需要
    private String messagePhone;//短信通知手机号码 isMessager为1时必填
    private String email;//邮箱


}
