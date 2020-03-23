package com.grpc.entiy.hxsplitaccount.response.subAccountList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName SubAccountListDataResponse
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/4 11:33
 * @Version 1.0
 **/
@Data
public class SubAccountListDataResponse implements Serializable {
    private static final long serialVersionUID = -1014099404920331036L;
    @XStreamAlias("Base")
    private com.grpc.entiy.hxsplitaccount.entity.Base Base;
    @XStreamAlias("ResHeader")
    private com.grpc.entiy.hxsplitaccount.entity.ResHeader ResHeader;
    @XStreamAlias("DataBody")
    private SubAccountListResponse DataBody;
}
