package com.grpc.interfaces.test;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.grpc.entity.test.Test;

import java.util.List;

public interface TestIntefaces extends IService<Test> {
    //列表查询
    List<Test> selectAll(Page<Test> page);
}
