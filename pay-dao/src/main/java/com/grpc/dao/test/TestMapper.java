package com.grpc.dao.test;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.grpc.entity.test.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName TestMapper
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/24 20:48
 * @Version 1.0
 **/
@Mapper
public interface TestMapper extends BaseMapper<Test> {
    List<Test> selectAll(Page<Test> page);
}
