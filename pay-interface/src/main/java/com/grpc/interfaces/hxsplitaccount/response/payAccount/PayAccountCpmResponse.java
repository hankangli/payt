package com.grpc.interfaces.hxsplitaccount.response.payAccount;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName PayAccountCpmResponse
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/4 15:06
 * @Version 1.0
 **/
@Data
@XStreamAlias("CPMB2B")
public class PayAccountCpmResponse implements Serializable {
    private static final long serialVersionUID = 7414795126115705398L;
    @XStreamAlias("MessageData")
    private PayAccountDataResponse MessageData;//
}
