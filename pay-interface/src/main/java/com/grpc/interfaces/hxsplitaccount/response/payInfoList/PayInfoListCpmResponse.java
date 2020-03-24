package com.grpc.interfaces.hxsplitaccount.response.payInfoList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName PayInfoListCpmResponse
 * @Description 账户交易明细
 * @Author hankangli
 * @Date 2020/3/5 10:34
 * @Version 1.0
 **/
@Data
@XStreamAlias("CPMB2B")
public class PayInfoListCpmResponse implements Serializable {

    private static final long serialVersionUID = 601486421198968645L;

    @XStreamAlias("MessageData")
    private PayInfoListDataResponse MessageData;
}
