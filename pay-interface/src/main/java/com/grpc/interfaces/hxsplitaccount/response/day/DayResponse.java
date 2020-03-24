package com.grpc.interfaces.hxsplitaccount.response.day;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName DayResponse
 * @Description 日切
 * @Author hankangli
 * @Date 2020/3/4 11:02
 * @Version 1.0
 **/
@Data
public class DayResponse implements Serializable {
    private static final long serialVersionUID = 6387959334545328654L;
    private String EndDay;
    private String Remark1;
    private String Remark2;
}
