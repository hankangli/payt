package com.mzywx.common.utils.hxutils;

import lombok.Data;

import java.io.Serializable;

/**
 * 返回对象的封装
 *
 * @author caomei
 */
@Data

public class ReturnDatas<T> implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public static final String SUCCESS = "success";
    public static final String ERROR = "error";
    public static final String WARNING = "warning";
    private String statusCode = "200";
    private String status;
    private String message;
    private T data;

    public ReturnDatas() {

    }

    public static ReturnDatas getSuccessReturnDatas() {
        return new ReturnDatas(ReturnDatas.SUCCESS);
    }

    public static ReturnDatas getErrorReturnDatas() {
        return new ReturnDatas(ReturnDatas.ERROR);
    }

    public static ReturnDatas getWarningReturnDatas() {
        return new ReturnDatas(ReturnDatas.WARNING);
    }

    public ReturnDatas(String status) {
        this.status = status;
    }

    public ReturnDatas(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public ReturnDatas(String status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

}
