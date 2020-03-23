package com.grpc.entiy.hxsplitaccount.entity;

import java.io.Serializable;

/**
 * @ClassName Status
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/2 10:07
 * @Version 1.0
 **/
public class Status implements Serializable {
    private static final long serialVersionUID = -6660035729606558621L;
    private String Code;
    private String Message;

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
