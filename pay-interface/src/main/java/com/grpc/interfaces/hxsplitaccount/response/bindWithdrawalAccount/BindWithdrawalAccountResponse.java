package com.grpc.interfaces.hxsplitaccount.response.bindWithdrawalAccount;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName BindWithdrawalAccountResponse
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/4 13:53
 * @Version 1.0
 **/
@Data
public class BindWithdrawalAccountResponse implements Serializable {
    private static final long serialVersionUID = 3017262222577654990L;

    @XStreamAlias("MemBerCode")
    private String MemBerCode;
    @XStreamAlias("Remark1")
    private String Remark1;
    @XStreamAlias("Remark2")
    private String Remark2;

}
