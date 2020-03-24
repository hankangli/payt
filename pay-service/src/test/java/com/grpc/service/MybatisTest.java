package com.grpc.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.grpc.interfaces.test.TestIntefaces;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @ClassName JWTTest
 * @Description jwt加密解密测试
 * @Author hankangli
 * @Date 2020/3/15 13:18
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = GrpcServiceApplication.class)
public class MybatisTest {


    @Autowired
    private TestIntefaces testIntefaces;

    @Test
    public void test01() throws Exception{
        com.grpc.entity.test.Test test = new com.grpc.entity.test.Test();
//        test.setId();
        test.setUserName("hankangli");
        boolean bol = testIntefaces.save(test);
        System.err.println(test.getId());
    }

    @Test
    public void test02() throws Exception{
        Page<com.grpc.entity.test.Test> page = new Page<>();
        page.setPages(1);
        page.setSize(5);
        List<com.grpc.entity.test.Test> lists = testIntefaces.selectAll(page);
        lists.forEach(f -> {
            System.err.println(f);
        });
    }
}
