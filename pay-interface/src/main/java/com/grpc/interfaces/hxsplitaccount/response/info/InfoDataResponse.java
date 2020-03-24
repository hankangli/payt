package com.grpc.interfaces.hxsplitaccount.response.info;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName InfoDataResponse
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/5 10:12
 * @Version 1.0
 **/
@Data
public class InfoDataResponse implements Serializable {
    private static final long serialVersionUID = -3424202882809095553L;
    @XStreamAlias("Base")
    private com.grpc.interfaces.hxsplitaccount.entity.Base Base;
    @XStreamAlias("ResHeader")
    private com.grpc.interfaces.hxsplitaccount.entity.ResHeader ResHeader;
    @XStreamAlias("DataBody")
    private InfoResponse DataBody;
}
