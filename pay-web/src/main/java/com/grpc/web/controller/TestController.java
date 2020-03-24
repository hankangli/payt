package com.grpc.web.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.grpc.common.returndata.ReturnDatas;
import com.grpc.entity.test.Test;
import com.grpc.interfaces.test.TestIntefaces;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/24 21:17
 * @Version 1.0
 **/
@RestController
@RequestMapping("/test")
public class TestController{

    @Resource
    private  TestIntefaces testIntefaces;

    @PostMapping("/test")
    public ReturnDatas test(){
        ReturnDatas returnDatas = ReturnDatas.getSuccessReturnDatas();
        Page<Test> page = new Page<>();
        page.setPages(1);
        page.setSize(5);
        //  TODO QueryWrapper<Test> wrapper = new QueryWrapper<>();

        List<Test> tests = testIntefaces.selectAll(page);
        returnDatas.setData(tests);
        return returnDatas;
    }
}
