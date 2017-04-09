package cn.redis.core;

import redis.clients.jedis.Jedis;

public class RedisClient {

	public static final String HOST = "192.168.0.105";
	public static final int PORT = 6379;
	
	private static Jedis jedis;
	
	public static Jedis getRedisClient(){
		if(null == jedis){
			jedis = new Jedis(HOST, PORT);
		}
		return jedis;
	}
	
}
