package com.wx.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class AppController {
	
	@Autowired
    private StringRedisTemplate redisTemplate;
	
	private Map<Long, String> dataMap = new HashMap<>();  
    
    /** 
     * 初始化 
     */  
    @PostConstruct  
    public void init() {  
        dataMap.put(1L, "张三");  
        dataMap.put(2L, "李四");  
        dataMap.put(3L, "王五");  
    } 
	
	@RequestMapping("/put/{id}")
	@Cacheable(value="guavaDemo" ,key="#id + 'dataMap'")  
    public String query(@PathVariable("id") Long id) {  
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        System.out.println(sdf.format(new Date()) + " : query id is " + id);  
        return dataMap.get(id);  
    }
	
	@RequestMapping("/del/{id}")
	@CacheEvict(value="guavaDemo" , key="#id + 'dataMap'") 
	public void remove(@PathVariable("id")Long id) {  
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        System.out.println(sdf.format(new Date()) + " : remove id is "+ id + " data");  
        dataMap.remove(id);  
    }
	
	@RequestMapping("/get")
	public String get() {  
		new Thread(() -> {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();
        return UUID.randomUUID().toString();
    }

}
