package com.cash.common.constant;

/**
 * @program: tms-cloud
 * @description:
 * @author: xiongzy
 * @create: 2018-08-09 11:39
 **/
public class CommonConstants {

    public enum ResponseStatus {
        SUCCESS, FAIL, ERROR, UNAUTH, NOT_FOUND
    }

    public enum UserRole{
        CUSTOMER,
        ORGNIZATION,
        UNKNOWN
    }

    public static final String CONTEXT_KEY_USER_ID = "currentUserId";
    public static final String CONTEXT_KEY_IP = "currentIp";
    public static final String CONTEXT_KEY_USER_ROLE = "currentUserRole";

}
