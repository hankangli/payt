package com.grpc.interfaces.hxsplitaccount.response.payInfoList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName PayInfoListDataResponse
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/5 10:34
 * @Version 1.0
 **/
@Data
public class PayInfoListDataResponse implements Serializable {
    private static final long serialVersionUID = 5466983371755062542L;
    @XStreamAlias("Base")
    private com.grpc.interfaces.hxsplitaccount.entity.Base Base;
    @XStreamAlias("ResHeader")
    private com.grpc.interfaces.hxsplitaccount.entity.ResHeader ResHeader;
    @XStreamAlias("DataBody")
    private PayInfoResponse DataBody;
}
