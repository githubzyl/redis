package cn.redis.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import cn.redis.core.RedisClient;
import redis.clients.jedis.Jedis;

public class Test {

	@org.junit.Test
	public void testClient(){
		Jedis jedis = RedisClient.getRedisClient();
		System.out.println(jedis.ping());
	}
	
	@org.junit.Test
	public void testSetValue(){
		Jedis jedis = RedisClient.getRedisClient();
		jedis.set("k1","v1");
		jedis.set("k2","v2");
		jedis.set("k3","v3");
		System.out.println(jedis.get("k3"));
		
		Set<String> sets = jedis.keys("*");
		System.out.println(sets.size());
	}
	
	@org.junit.Test
	public void testList(){
		List<?> list = Collections.synchronizedList(new ArrayList<>());
		System.out.println(list.size());
	}

}
