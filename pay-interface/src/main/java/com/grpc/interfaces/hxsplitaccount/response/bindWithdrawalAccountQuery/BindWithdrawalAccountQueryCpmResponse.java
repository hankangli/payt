package com.grpc.interfaces.hxsplitaccount.response.bindWithdrawalAccountQuery;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName BindWithdrawalAccountQueryCpmResponse
 * @Description 查询出入金绑定信息
 * @Author hankangli
 * @Date 2020/3/4 14:27
 * @Version 1.0
 **/
@Data
@XStreamAlias("CPMB2B")
public class BindWithdrawalAccountQueryCpmResponse implements Serializable {
    private static final long serialVersionUID = -1201805381210386503L;
    @XStreamAlias("MessageData")
    private BindWithdrawalAccountQueryDataResponse MessageData;

}
