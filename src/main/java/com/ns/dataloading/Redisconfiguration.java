package com.ns.dataloading;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.util.StringUtils;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

//@EnableRedisRepositories
@Configuration
public class Redisconfiguration {

    @Bean
    public JedisConnectionFactory jedisConnectionFactory(){

        return new JedisConnectionFactory();
    }
    @Bean
    public StringRedisSerializer stringRedisSerializer() {
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        return stringRedisSerializer;
    }


    @Bean
    public RedisTemplate redisTemplate() {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
      //  redisTemplate.setKeySerializer(stringRedisSerializer());
      //  redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
        //redisTemplate.afterPropertiesSet();

//   	 redisTemplate.setKeySerializer(new StringRedisSerializer());
//   	 redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
       redisTemplate.setHashKeySerializer(new StringRedisSerializer());
   // redisTemplate.setHashValueSerializer(new StringRedisSerializer());
        return redisTemplate;
    }
    JedisPool pool = new JedisPool(new JedisPoolConfig(), "localhost");
    }
