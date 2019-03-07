package com.aaa.ssm.util;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import javax.xml.ws.Holder;
import java.util.HashSet;
import java.util.Set;

public class TestRedisClusterConnect {
    public static void main(String[] args) {
        Set<HostAndPort> hps=new HashSet();
       hps.add(new HostAndPort("192.168.254.22",8001));
        hps.add(new HostAndPort("192.168.254.22",8002));
        hps.add(new HostAndPort("192.168.254.22",8003));
        hps.add(new HostAndPort("192.168.254.21",8004));
        hps.add(new HostAndPort("192.168.254.21",8005));
        hps.add(new HostAndPort("192.168.254.21",8006));

        JedisCluster jedisCluster=new JedisCluster(hps);
        jedisCluster.set("bbb","444");
        String bbb=jedisCluster.get("bbb");
        System.out.print(bbb);
     }
}
