package com.iocya.springbase.beans;

import com.iocya.springbase.beans.bean.Instrumentalist;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test10 {
    private ApplicationContext ctx;

    @Before
    public void init() {
        ctx = new ClassPathXmlApplicationContext("spring-10-component-scan-filter.xml");
    }

    @Test
    public void scanFilterTest() {
        String beanNames[] = ctx.getBeanDefinitionNames();
        for (String name : beanNames) {
            String className = ctx.getBean(name).getClass().getName();
            if (className.startsWith("com.iocya")) {
                System.out.println(name);
            }
        }
    }

}
