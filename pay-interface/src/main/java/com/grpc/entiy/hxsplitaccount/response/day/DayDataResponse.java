package com.grpc.entiy.hxsplitaccount.response.day;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName DayDataResponse
 * @Description 日切
 * @Author hankangli
 * @Date 2020/3/4 11:02
 * @Version 1.0
 **/
@Data
public class DayDataResponse implements Serializable {
    private static final long serialVersionUID = 1323046880534236909L;
    private com.grpc.entiy.hxsplitaccount.entity.Base Base;
    private com.grpc.entiy.hxsplitaccount.entity.ResHeader ResHeader;
    private DayResponse DataBody;
}
