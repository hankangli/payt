package com.grpc.entiy.hxsplitaccount.response.payAccount;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName PayAccountDataResponse
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/4 15:07
 * @Version 1.0
 **/
@Data
public class PayAccountDataResponse implements Serializable {
    private static final long serialVersionUID = 801380615660673087L;
    @XStreamAlias("Base")
    private com.grpc.entiy.hxsplitaccount.entity.Base Base;
    @XStreamAlias("ResHeader")
    private com.grpc.entiy.hxsplitaccount.entity.ResHeader ResHeader;
    @XStreamAlias("DataBody")
    private PayAccountResponse DataBody;
}
