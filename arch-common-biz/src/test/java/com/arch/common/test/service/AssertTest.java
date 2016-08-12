package com.arch.common.test.service;

import com.arch.common.biz.utils.Assert;
import com.arch.common.test.AbstractSpringContextTest;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by chenxiaobian on 16/8/9.
 */
public class AssertTest extends AbstractSpringContextTest {

    @Test
    public void testAssertEquals(){
        Assert.assertEquals(1,1,"数值不相等");
    }

    @Test
    public void testAssertFalse(){
        List<Integer> lists = Arrays.asList(2,3);
        Assert.assertFalse(lists.isEmpty(),"数据不能为空");
    }

    @Test
    public void testAssertNotNull(){
        List<Integer> lists = null;
        Assert.assertNotNull(lists,"数据不能为空");
    }





}
