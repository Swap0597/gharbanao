package com.gharbanao.utility;

public class StringUtility {

    public static boolean isNotNull(String str){
        return str!=null?true:false;
    }

    public static boolean isNullOrBlank(String str) {
        return str == null || str.trim().length() == 0 ? true : false;
    }

    public static boolean isnotNullOrBlank(String str) {
        return str != null && str.trim().length() != 0 ? true : false;
    }
}
