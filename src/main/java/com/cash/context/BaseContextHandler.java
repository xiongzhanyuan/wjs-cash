package com.cash.context;



import com.cash.common.constant.CommonConstants;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class BaseContextHandler {
    private static ThreadLocal<Map<String, Object>> threadLocal = new ThreadLocal<>();

    private static void set(String key, Object value) {
        Map<String, Object> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<>();
            threadLocal.set(map);
        }
        map.put(key, value);
    }


    public static void setIP(String ip){set(CommonConstants.CONTEXT_KEY_IP, ip);}

    public static void setUserId(String userID){
        set(CommonConstants.CONTEXT_KEY_USER_ID,userID);
    }


    public static void setUserRole(String userRole){
        CommonConstants.UserRole role;
        try{
            role = CommonConstants.UserRole.valueOf(userRole);
        }catch(Exception e){
            log.warn("unrecognized user role :" + userRole, e);
            role = CommonConstants.UserRole.UNKNOWN;
        }
        set(CommonConstants.CONTEXT_KEY_USER_ROLE, role);
    }

    public static void setUserRole(CommonConstants.UserRole userRole){
        set(CommonConstants.CONTEXT_KEY_USER_ROLE, userRole);
    }

    private static Object get(String key){
        Map<String, Object> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<>();
            threadLocal.set(map);
        }
        return map.get(key);
    }

    public static String getIp(){
        return (String)get(CommonConstants.CONTEXT_KEY_IP);
    }

    public static String getUserId(){
        return (String)get(CommonConstants.CONTEXT_KEY_USER_ID);
    }

    public static CommonConstants.UserRole getUserRole(){
        return (CommonConstants.UserRole)get(CommonConstants.CONTEXT_KEY_USER_ROLE);
    }

    public static Map<String, Object> getAll(){
        Map<String, Object> map = threadLocal.get();
        return map == null ? new HashMap<>() : map;
    }

    public static void remove(){
        threadLocal.remove();
    }

}
