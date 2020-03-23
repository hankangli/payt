package com.grpc.web.config.exception;

import com.grpc.entiy.returndata.ReturnDatas;
import org.apache.shiro.authc.AuthenticationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ClassName GlobalExceptionHandler
 * @Description 全局异常统一处理
 * @Author hankangli
 * @Date 2020/3/15 13:55
 * @Version 1.0
 **/
@RestControllerAdvice
public class GlobalExceptionHandler {

    protected static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(AuthenticationException.class)
    public ReturnDatas handleException(AuthenticationException e) {
        logger.error("token is error ：" + e.getMessage(), e);
        return new ReturnDatas(500, "token 错误", null);
    }


}
