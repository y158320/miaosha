package com.miaoshaproject.service;

//分装本地缓存操作类
public interface CacheService {

    //存方法
    public void setCommonCache(String key,Object value);
    //取方法
    public Object getFromCommonCache(String ket);
}
