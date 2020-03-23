package com.grpc.entiy.hxsplitaccount.response.bindWithdrawalAccountQuery;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName BindWithdrawalAccountQueryResponse
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/4 14:28
 * @Version 1.0
 **/
@Data
public class BindWithdrawalAccountQueryResponse implements Serializable {

    private static final long serialVersionUID = -8653138483496279132L;
    @XStreamAlias("Count")
    private String Count;//
    @XStreamAlias("Cycles")
    private Cycles cycles; ;//
    @XStreamAlias("Remark1")
    private String Remark1;//
    @XStreamAlias("Remark2")
    private String Remark2;//
    @XStreamAlias("Remark3")
    private String Remark3;//
    @XStreamAlias("Remark4")
    private String Remark4;//
    @XStreamAlias("Remark5")
    private String Remark5;//
}
