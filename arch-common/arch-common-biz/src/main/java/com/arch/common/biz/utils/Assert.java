package com.arch.common.biz.utils;


/**
 * Created by chenxiaobian on 16/7/1.
 */
public class Assert {

    public static void assertEquals(Object actual, Object expected, String msg, Object... args) {
        if (expected != null || actual != null) {
            if (expected == null || !expected.equals(actual)) {
                fail(msg, args);
            }
        }
    }

    public static void assertTrue(boolean b, String msg, Object... args) {
        if (!b) {
            fail(msg, args);
        }
    }

    public static void assertFalse(boolean b, String msg, Object... args) {
        if (b) {
            fail(msg, args);
        }
    }


    public static void assertNull(Object b, String msg, Object... args) {
        if (b != null) {
            fail(msg, args);
        }
    }

    public static void assertNotNull(Object b, String msg, Object... args) {
        if (b == null) {
            fail(msg, args);
        }
    }


    public static void fail(String msg, Object... args) {
        throw new RuntimeException(String.format(msg, args));
    }


}
