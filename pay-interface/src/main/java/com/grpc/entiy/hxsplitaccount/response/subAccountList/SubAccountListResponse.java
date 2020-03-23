package com.grpc.entiy.hxsplitaccount.response.subAccountList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName SubAccountListResponse
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/4 11:33
 * @Version 1.0
 **/
@Data
public class SubAccountListResponse implements Serializable {
    private static final long serialVersionUID = 8601948843395691650L;
    @XStreamAlias("Count")
    private String Count;
    @XStreamAlias("Cycles")
    private Cycles Cycles;
    @XStreamAlias("Remark1")
    private String Remark1;
    @XStreamAlias("Remark2")
    private String Remark2;
}
