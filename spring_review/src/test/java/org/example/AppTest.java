package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test(){
        String path = "user.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
        Object user = context.getBean("user");
        System.out.println(user);
    }
}
