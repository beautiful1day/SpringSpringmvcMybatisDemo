package com.aaa.ssm.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;
@Component
public class JedisUtilImpl implements JedisUtil{

   /* @Autowired
    private JedisPool jedisPool;*/
    @Autowired
    private JedisCluster jedisCluster;
    @Override
    public void putObject(Object key, Object value) {
        jedisCluster.set(SerializeUtil.serialize(key),SerializeUtil.serialize(value));
        //jedisCluster.
        // JedisCluster.close();
    }

    @Override
    public Object removeObject(Object arg0) {
        return jedisCluster.expire(SerializeUtil.serialize(arg0),1);
    }

    @Override
    public Object getObject(Object arg0) {
        byte[] bytes = jedisCluster.get(SerializeUtil.serialize(arg0));
        return SerializeUtil.unserialize(bytes);
    }
   /* @Override
    public void putObject(Object key, Object value) {
        // TODO Auto-generated method stub
        Jedis resource = jedisPool.getResource();
        resource.set(SerializeUtil.serialize(key.toString()),
                SerializeUtil.serialize(value));
        resource.close();
    }
    @Override
    public Object removeObject(Object arg0) {
        // TODO Auto-generated method stub
        Jedis resource = jedisPool.getResource();
        Object expire = resource.expire(
                SerializeUtil.serialize(arg0.toString()), 0);
        resource.close();
        return expire;
    }
    @Override
    public Object getObject(Object arg0) {
        // TODO Auto-generated method stub
        Jedis resource = jedisPool.getResource();
        Object value = SerializeUtil.unserialize(resource.get(
                SerializeUtil.serialize(arg0.toString())));

        resource.close();
        return value;
    }*/
}
