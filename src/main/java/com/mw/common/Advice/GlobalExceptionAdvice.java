package com.mw.common.Advice;


import com.mw.common.Vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常捕获
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = Exception.class)
    public CommonResponse<String> handlerAdException(HttpServletRequest req,
                                                     Exception ex) {
        CommonResponse<String> response = new CommonResponse<>(-1,
                "error");
        response.setData(ex.getMessage());
        return response;
    }
}
