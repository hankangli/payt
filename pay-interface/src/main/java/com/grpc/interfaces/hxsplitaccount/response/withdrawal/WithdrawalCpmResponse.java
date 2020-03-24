package com.grpc.interfaces.hxsplitaccount.response.withdrawal;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName WithdrawalCpmResponse
 * @Description 本行出金
 * @Author hankangli
 * @Date 2020/3/4 16:04
 * @Version 1.0
 **/
@Data
@XStreamAlias("CPMB2B")
public class WithdrawalCpmResponse implements Serializable {
    private static final long serialVersionUID = -3639304674902716865L;

    @XStreamAlias("MessageData")
    private WithdrawalDataResponse MessageData;//
}
