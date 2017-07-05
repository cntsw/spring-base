package com.iocya.springbase.beans;

import com.iocya.springbase.beans.bean.Performer;
import com.iocya.springbase.configuration.SpringConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test20JavaBasedConfig {
    private ApplicationContext ctx;

    @Before
    public void init() {
        ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);
    }

    @Test
    public void scanFilterTest() {
        ctx.getBean("duke", Performer.class).perform();
        ctx.getBean("duke15", Performer.class).perform();
        ctx.getBean("kenny", Performer.class).perform();

        System.out.println("---");
        System.out.println(ctx.getBean("kenny", Performer.class));
        System.out.println("---");

        String beanNames[] = ctx.getBeanDefinitionNames();
        for (String name : beanNames) {
            String className = ctx.getBean(name).getClass().getName();
            if (className.startsWith("com.iocya")) {
                System.out.println(name);
            }
        }
    }

}
