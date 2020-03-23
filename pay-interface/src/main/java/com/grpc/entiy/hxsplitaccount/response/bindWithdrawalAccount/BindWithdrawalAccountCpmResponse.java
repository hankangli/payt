package com.grpc.entiy.hxsplitaccount.response.bindWithdrawalAccount;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName BindWithdrawalAccountCpmResponse
 * @Description 绑定出入金
 * @Author hankangli
 * @Date 2020/3/4 13:52
 * @Version 1.0
 **/
@Data
@XStreamAlias("CPMB2B")
public class BindWithdrawalAccountCpmResponse implements Serializable {
    private static final long serialVersionUID = -1318764212875718060L;

    @XStreamAlias("MessageData")
    private BindWithdrawalAccountDataResponse MessageData;

    }
