package com.grpc.interfaces.hxsplitaccount.response.createSonAccount;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName CPMB2B
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/2 10:17
 * @Version 1.0
 **/
@Data
public class CreateSonAccountCpmB2BResponse implements Serializable {
    private static final long serialVersionUID = -2029277694398178271L;
    private CreateSonAccountDataResponse MessageData;

}
