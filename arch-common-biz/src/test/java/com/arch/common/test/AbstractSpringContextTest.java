package com.arch.common.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zhangxinyu on 16/6/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
        "classpath*:config/spring/common/appcontext-*.xml",
        "classpath*:config/spring/local/appcontext-*.xml"
})
@Transactional
public abstract class AbstractSpringContextTest {
}
