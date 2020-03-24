package com.grpc.interfaces.hxsplitaccount.response.createSonAccount;


import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName MessageData
 * @Description 返回值
 * @Author hankangli
 * @Date 2020/3/2 10:04
 * @Version 1.0
 **/
@Data
public class CreateSonAccountDataResponse implements Serializable {
    private static final long serialVersionUID = -5802264686644978548L;
    private com.grpc.interfaces.hxsplitaccount.entity.Base Base;
    private com.grpc.interfaces.hxsplitaccount.entity.ResHeader ResHeader;
    private CreateSonAccountResponse DataBody;

}
