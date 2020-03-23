package com.grpc.entiy.hxsplitaccount.response.payInfoList;

import com.grpc.entiy.hxsplitaccount.entity.Base;
import com.grpc.entiy.hxsplitaccount.entity.ResHeader;
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
    private com.grpc.entiy.hxsplitaccount.entity.Base Base;
    @XStreamAlias("ResHeader")
    private com.grpc.entiy.hxsplitaccount.entity.ResHeader ResHeader;
    @XStreamAlias("DataBody")
    private PayInfoResponse DataBody;
}
