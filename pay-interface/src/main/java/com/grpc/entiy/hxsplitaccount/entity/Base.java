package com.grpc.entiy.hxsplitaccount.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName Base
 * @Description 版本信息
 * @Author hankangli
 * @Date 2020/3/2 10:04
 * @Version 1.0
 **/
@Data
public class Base implements Serializable {
    private static final long serialVersionUID = -2016014340502589708L;
    private String Version;
    private String SignFlag;
    private String SeverModel;
}
