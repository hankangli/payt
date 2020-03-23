package com.grpc.entiy.hxsplitaccount.response.subAccountList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName SubAccountListCpmResponse
 * @Description 子账户信息
 * @Author hankangli
 * @Date 2020/3/4 11:33
 * @Version 1.0
 **/
@Data
@XStreamAlias("CPMB2B")
public class SubAccountListCpmResponse implements Serializable {
    private static final long serialVersionUID = -338667191089141062L;
    @XStreamAlias("MessageData")
    private SubAccountListDataResponse MessageData;

}
