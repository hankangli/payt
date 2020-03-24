package com.grpc.interfaces.hxsplitaccount.request;

import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;

/**
 * @ClassName PayInfoListRequest
 * @Description 交易明细
 * @Author hankangli
 * @Date 2020/3/5 10:22
 * @Version 1.0
 **/
@Data
public class PayInfoListRequest implements Serializable {
    private static final long serialVersionUID = 6146460015533701285L;
    private String subAccount;//
    private String tradeMemCode;//
    private String otherSubAccount;//
    @NonNull
    private String startTimes;//
    @NonNull
    private String endTimes;//

}
