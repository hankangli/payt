package com.grpc.entiy.hxsplitaccount.response.bindWithdrawalAccount;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName BindWithdrawalAccountDataResponse
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/4 13:53
 * @Version 1.0
 **/
@Data
public class BindWithdrawalAccountDataResponse implements Serializable {
    private static final long serialVersionUID = -6133792799385549126L;
    @XStreamAlias("Base")
    private com.grpc.entiy.hxsplitaccount.entity.Base Base;
    @XStreamAlias("ResHeader")
    private com.grpc.entiy.hxsplitaccount.entity.ResHeader ResHeader;
    @XStreamAlias("DataBody")
    private BindWithdrawalAccountResponse DataBody;

}
