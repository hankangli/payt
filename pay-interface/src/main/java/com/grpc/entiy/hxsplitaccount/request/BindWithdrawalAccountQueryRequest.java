package com.grpc.entiy.hxsplitaccount.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName BindWithdrawalAccountQuery
 * @Description 查询出入金绑定信息
 * @Author hankangli
 * @Date 2020/3/4 14:13
 * @Version 1.0
 **/
@Data
public class BindWithdrawalAccountQueryRequest implements Serializable {
    private static final long serialVersionUID = 8489093367248225108L;
    private String subAccount;//
    private String tradeMemCode;//
    private String outComeAccountType;//
}
