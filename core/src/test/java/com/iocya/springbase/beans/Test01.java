package com.iocya.springbase.beans;

import com.iocya.springbase.beans.bean.Instrumentalist;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    private ApplicationContext ctx;

    @Before
    public void init() {
        ctx = new ClassPathXmlApplicationContext("spring-01-annotation.xml");
    }

    @Test
    public void componentTest() {
        System.out.println(ctx.getBean("saxophone"));
    }

    @Test
    public void autowiredTest() {
        System.out.println(ctx.getBean(Instrumentalist.class));
    }
}
