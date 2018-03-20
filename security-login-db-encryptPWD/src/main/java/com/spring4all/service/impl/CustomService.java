package com.spring4all.service.impl;

import com.spring4all.entity.CustomEntity;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Company
 * @Discription
 * @Author guoxiaojing
 * @CreateDate 2018/3/20 16:10
 * @Version 1.0
 */
@Service
public class CustomService {
    // simulate database
    private static Map<String, CustomEntity> users  = new ConcurrentHashMap<String, CustomEntity>();

    static {
        CustomEntity admin = new CustomEntity();
        admin.setUsername("admin");
        admin.setPassword("pwd");
        admin.setRoles("ADMIN");
        admin.setPermissions("Read", "Write", "Delete");

        CustomEntity sales = new CustomEntity();
        sales.setUsername("sales");
        sales.setPassword("pwd");
        sales.setRoles("SALES_REP");
        sales.setPermissions("Read");

        CustomEntity order = new CustomEntity();
        order.setUsername("order");
        order.setPassword("pwd");
        order.setRoles("ORDER_REP");
        order.setPermissions("Read", "Write");

        users.put(admin.getUsername(), admin);
        users.put(sales.getUsername(), sales);
        users.put(order.getUsername(), order);
    }

    /**
     * Get user info by username
     */
    public CustomEntity getByUsername(String username){
        return users.get(username);
    }

}
