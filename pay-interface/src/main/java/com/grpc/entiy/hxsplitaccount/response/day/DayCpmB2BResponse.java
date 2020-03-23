package com.grpc.entiy.hxsplitaccount.response.day;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName DayResponse
 * @Description 日切
 * @Author hankangli
 * @Date 2020/3/4 11:01
 * @Version 1.0
 **/
@Data
public class DayCpmB2BResponse implements Serializable {
    private static final long serialVersionUID = 7858162653458130900L;
    private DayDataResponse MessageData;

}
