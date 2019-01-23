package com.cb.itoken.service.redis.service;

public interface RedisService {

    /**
     * put
     * @param key
     * @param value
     * @param seconds 超时时间
     */
    public void put(String key, Object value, long seconds);

    /**
     * get
     * @param key
     * @return
     */
    public Object get(String key);
}
