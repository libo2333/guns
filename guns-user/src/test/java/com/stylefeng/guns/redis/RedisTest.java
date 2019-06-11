package com.stylefeng.guns.redis;

import redis.clients.jedis.Jedis;

public class RedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis();

        Long lpush = jedis.lpush("user1", "1","2","3","9");
        String user1 = jedis.lpop("user1");
        System.out.println(user1);

    }
}
