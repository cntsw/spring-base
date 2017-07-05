package com.iocya.springbase.beans;

import com.iocya.springbase.beans.bean.Performer;
import com.iocya.springbase.beans.bean.Stage;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoreTest {
    @Test
    public void test1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring-01-bean.xml");
        Performer performer = ctx.getBean("duke", Performer.class);
        performer.perform();
    }

    @Test
    public void test2() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring-02-constructor.xml");
        Performer performer = ctx.getBean("poeticDuke", Performer.class);
        performer.perform();
    }

    @Test
    public void test3() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring-03-factory.xml");
        Stage stage = ctx.getBean("theStage", Stage.class);
        System.out.println(stage);
    }

    @Test
    public void test4() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring-04-scoping.xml"
        );
        System.out.println(ctx.getBean("singletonJuggler"));
        System.out.println(ctx.getBean("singletonJuggler"));
        System.out.println(ctx.getBean("prototypeJuggler"));
        System.out.println(ctx.getBean("prototypeJuggler"));
    }

    @Test
    public void test5() {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring-05-init-destory.xml"
        );

        ctx.close();
    }

    @Test
    public void test10() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring-10-di.xml"
        );
        ctx.getBean("kenny", Performer.class).perform();
        ctx.getBean("kenny2", Performer.class).perform();
        System.out.println("----------------");
        ctx.getBean("oneManBand", Performer.class).perform();

    }

    @Test
    public void test11() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring-11-SpEL.xml"
        );
        ctx.getBean("carl", Performer.class).perform();
        ctx.getBean("carl2", Performer.class).perform();

    }

    @Test
    public void test20() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring-20-autowire.xml"
        );
        ctx.getBean("kenny", Performer.class).perform();
        System.out.println("---");
        ctx.getBean("duke", Performer.class).perform();
    }
}
