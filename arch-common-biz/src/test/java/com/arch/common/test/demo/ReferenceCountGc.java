package com.arch.common.test.demo;

/**
 * Created by chenxiaobian on 16/8/21.
 */
public class ReferenceCountGC {

    public Object instance = null;

    private static final int memory = 1024*1024;

    private byte[] bigSize = new byte[2*memory];

    public static void testGC(){
        ReferenceCountGC objA = new ReferenceCountGC();
        ReferenceCountGC objB = new ReferenceCountGC();

        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        System.gc();

    }

    public static void main(String[] args) {
        testGC();
    }
}
