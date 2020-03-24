package com.grpc.interfaces.hxsplitaccount.response.accountBalance;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName AccountBalanceCpmResponse
 * @Description 账户余额
 * @Author hankangli
 * @Date 2020/3/4 14:49
 * @Version 1.0
 **/
@Data
@XStreamAlias("CPMB2B")
public class AccountBalanceCpmResponse implements Serializable {
    private static final long serialVersionUID = -3895446457823893243L;
    @XStreamAlias("MessageData")
    private AccountBalanceDataResponse MessageData;//
}
