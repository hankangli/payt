package com.grpc.interfaces.hxsplitaccount.response.bindWithdrawalAccountQuery;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName Cycles
 * @Description 子账户个数
 * @Author hankangli
 * @Date 2020/3/4 11:40
 * @Version 1.0
 **/
@Data
@XStreamAlias("Cycles")
public class Cycles implements Serializable {
    private static final long serialVersionUID = 5516111296564375025L;
    @XStreamImplicit(itemFieldName="Cycle")
    private List<Cycle> Cycle;

}
