package com.grpc.interfaces.hxsplitaccount.response.withdrawal;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName WithdrawalDataResponse
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/4 16:04
 * @Version 1.0
 **/
@Data
public class WithdrawalDataResponse implements Serializable {
    private static final long serialVersionUID = 8233693628438767297L;

    @XStreamAlias("Base")
    private com.grpc.interfaces.hxsplitaccount.entity.Base Base;
    @XStreamAlias("ResHeader")
    private com.grpc.interfaces.hxsplitaccount.entity.ResHeader ResHeader;
    @XStreamAlias("DataBody")
    private WithdrawalResponse DataBody;
}
