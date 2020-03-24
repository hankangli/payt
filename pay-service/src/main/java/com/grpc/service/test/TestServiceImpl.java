package com.grpc.service.test;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.grpc.dao.test.TestMapper;
import com.grpc.entity.test.Test;
import com.grpc.interfaces.test.TestIntefaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName TestServiceImpl
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/24 20:45
 * @Version 1.0
 **/
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestIntefaces {

    @Autowired
    private TestMapper testMapper;
    /**
     * @Author hankangli
     * @Description 测试列表查询
     * @Date  2020/3/24 21:11
     * @Param [page]
     * @return java.util.List<com.grpc.entity.test.Test>
     **/
    @Override
    public List<Test> selectAll(Page<Test> page) {
        return testMapper.selectAll(page);
    }
}
