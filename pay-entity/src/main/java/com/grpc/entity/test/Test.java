package com.grpc.entity.test;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

/**
 * @ClassName Test
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/24 20:37
 * @Version 1.0
 **/
@Data
@TableName(value = "t_test")
@ToString
public class Test {

    @TableId(value = "id",type = IdType.UUID)
    private String id;
    private String userName;
}
