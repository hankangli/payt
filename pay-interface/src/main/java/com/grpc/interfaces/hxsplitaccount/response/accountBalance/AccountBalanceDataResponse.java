package com.grpc.interfaces.hxsplitaccount.response.accountBalance;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName AccountBalanceDataResponse
 * @Description 华夏返回的信息
 * @Author hankangli
 * @Date 2020/3/4 14:49
 * @Version 1.0
 **/
@Data
public class AccountBalanceDataResponse implements Serializable {
    private static final long serialVersionUID = -1112326117475183509L;
    @XStreamAlias("Base")
    private com.grpc.interfaces.hxsplitaccount.entity.Base Base;
    @XStreamAlias("ResHeader")
    private com.grpc.interfaces.hxsplitaccount.entity.ResHeader ResHeader;
    @XStreamAlias("DataBody")
    private AccountBalanceResponse DataBody;
}

