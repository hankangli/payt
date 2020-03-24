package com.grpc.interfaces.hxsplitaccount.response.bindWithdrawalAccountQuery;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName BindWithdrawalAccountQueryDataResponse
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/4 14:28
 * @Version 1.0
 **/
@Data
public class BindWithdrawalAccountQueryDataResponse implements Serializable {
    private static final long serialVersionUID = -6526332875242686963L;
    @XStreamAlias("Base")
    private com.grpc.interfaces.hxsplitaccount.entity.Base Base;
    @XStreamAlias("ResHeader")
    private com.grpc.interfaces.hxsplitaccount.entity.ResHeader ResHeader;
    @XStreamAlias("DataBody")
    private BindWithdrawalAccountQueryResponse DataBody;
}
