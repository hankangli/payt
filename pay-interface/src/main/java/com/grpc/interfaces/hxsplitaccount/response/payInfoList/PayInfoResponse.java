package com.grpc.interfaces.hxsplitaccount.response.payInfoList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName PayInfoResponse
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/5 10:34
 * @Version 1.0
 **/
@Data
public class PayInfoResponse implements Serializable {
    private static final long serialVersionUID = 824954956830861448L;
    @XStreamAlias("Count")
    private String Count;
    @XStreamAlias("Cycles")
    private Cycles Cycles;
    @XStreamAlias("Remark1")
    private String Remark1;
    @XStreamAlias("Remark2")
    private String Remark2;

}
