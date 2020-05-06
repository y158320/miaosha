package com.miaoshaproject.error;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@Component
public class MyErrorAttributes extends DefaultErrorAttributes {
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> map =  super.getErrorAttributes(webRequest, includeStackTrace);
        map.put("code",1);
        map.put("msg","自定义错误");
        return map;
    }
}