package com.grpc.common.enums.hxenums;

/**
 * @ClassName TransCodeEnum
 * @Description 华夏分账枚举类
 * @Author hankangli
 * @Date 2020/2/12 9:15
 * @Version 1.0
 **/
public enum TransCodeEnum {

    //账户资金类
    T_100000("100000","获取商户公钥"),
    T_101010("101010","子账户开户"),
    T_101020("101020","子账户信息查询"),
    T_101030("101030","子账户批量开户"),
    T_101040("101040","客户签约信息查询"),
    T_101050("101050","子账户信息变更"),
    T_101060("101060","子账户状态变更"),
    T_101070("101070","绑定出入金账户"),
    T_101080("101080","子账户绑定出入金结果查询"),
    T_101090("101090","商户信息查询"),
    //资金支付类
    T_102010("102010","支付交易"),
    T_102020("102020","批量支付"),
    T_102030("102030","批量支付结果查询"),
    T_102040("102040","资金冻结"),
    T_102050("102050","资金解冻"),
    T_102060("102060","交易会员批量结息"),
    T_102070("102070","批量结息结果查询"),

    //联机交易
    T_103010("103010","本行出金"),
    T_103020("103020","本行入金"),


    //其他功能类
    T_104010("104010","日切"),
    T_104020("104020","账户余额"),
    T_104030("104030","子账户交易明细"),
    ;

    private String code;//交易吗
    private String content;//交易说明

    public String getCode() {
        return code;
    }

    public String getContent() {
        return content;
    }

    private TransCodeEnum(String code, String content) {
        this.code = code;
        this.content = content;
    }

}
