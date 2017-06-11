package com.iocya.springbase.beans;

import com.iocya.springbase.beans.bean.Performer;
import com.iocya.springbase.beans.bean.Stage;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Euler on 2017/6/11.
 */
public class XmlTypeTest {


    @Test
    public void test1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring-01.xml");
        Performer performer = ctx.getBean("duke", Performer.class);
        performer.perform();
    }

    @Test
    public void test2() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring-02.xml");
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
}
