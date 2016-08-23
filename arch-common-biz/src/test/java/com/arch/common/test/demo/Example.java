package com.arch.common.test.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by chenxiaobian on 16/8/19.
 */
public class Example {

    public void testOptional(){
        Optional<String> optional = Optional.of("chen");
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
        System.out.println(optional.orElse("false"));
        optional.ifPresent((s)-> System.out.println(s.charAt(0)));

    }

    public void testStream(){
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        List<String> filterList = stringCollection.stream().filter(c->c.startsWith("a")).collect(Collectors.toList());
        System.out.println(filterList);

        //升序
        List<String> sortedList = stringCollection.stream().sorted().filter(c->c.startsWith("a")).collect(Collectors.toList());
        System.out.println(sortedList);

        //降序
        List<String> descSortedList = stringCollection.stream().sorted((a,b)->b.compareTo(a)).filter(c->c.startsWith("a")).collect(Collectors.toList());;
        System.out.println(descSortedList);
    }


    public static void main(String[] args) {
//        Example example = new Example();
//        example.testOptional();
//        example.testStream();

          //产生OutOfMemoryError
          int len = Integer.MAX_VALUE-4;
          int[] a = new int[len];
          System.out.println(a);
    }
}
