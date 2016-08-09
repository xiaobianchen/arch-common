package com.arch.common.biz.utils;

import java.util.Random;

/**
 * Created by chenxiaobian on 16/6/6.
 */
public class PasswordUtils {

    /**
     * 随机生成字母和数字的组合
     *
     * @param length 长度
     */
    public static String generateRandom(int length) {
        String val = "";
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
            //输出字母还是数字
            if ("char".equalsIgnoreCase(charOrNum)) {
                //输出是大写字母还是小写字母
                int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;
                val += (char) (random.nextInt(26) + temp);
            } else if ("num".equalsIgnoreCase(charOrNum)) {
                val += String.valueOf(random.nextInt(10));
            }
        }
        return val;
    }

    public static void main(String[] args) {
        System.out.println(generateRandom(8));
    }
}
