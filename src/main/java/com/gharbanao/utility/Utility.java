package com.gharbanao.utility;

import java.util.List;
import java.util.Map;

public class Utility {
    public static boolean isNull(Object obj) {
        return obj == null ? true : false;
    }

    public static boolean isNullOrBlank(List<?> list) {
        return list == null || list.isEmpty();
    }

    public static boolean isNullOrBlank(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    public static boolean isNotNull(Object obj) {
        return obj != null ? true : false;
    }

    public static boolean isNotNullOrBlank(List<?> list) {
        return list != null && !list.isEmpty();
    }

    public static boolean isNotNullOrBlank(Map<?, ?> map) {
        return map != null && !map.isEmpty();
    }

}
