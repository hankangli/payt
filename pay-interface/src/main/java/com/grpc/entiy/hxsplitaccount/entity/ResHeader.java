package com.grpc.entiy.hxsplitaccount.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName ResHeader
 * @Description 返回的请求头
 * @Author hankangli
 * @Date 2020/3/2 10:05
 * @Version 1.0
 **/
@Data
public class ResHeader implements Serializable {
    private static final long serialVersionUID = -1777660686087553092L;
    private String TransCodeId;
    private String TransCode;
    private Status Status;
}
