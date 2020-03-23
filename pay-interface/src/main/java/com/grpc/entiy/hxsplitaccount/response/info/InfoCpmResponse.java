package com.grpc.entiy.hxsplitaccount.response.info;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName InfoCpmResponse
 * @Description 商户信息查询
 * @Author hankangli
 * @Date 2020/3/5 10:11
 * @Version 1.0
 **/
@Data
@XStreamAlias("CPMB2B")
public class InfoCpmResponse implements Serializable {

    private static final long serialVersionUID = 2036381356660005168L;
    @XStreamAlias("MessageData")
    private InfoDataResponse MessageData;//
}
