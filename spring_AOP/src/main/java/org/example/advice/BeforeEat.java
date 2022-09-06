package org.example.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName BeforeEat
 * @Description TODO
 * @Author YinLiangTao Email:1517535831@qq.com
 * @Date 2022/9/6 9:36
 * @Version 1.0
 */
public class BeforeEat implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("方法名"+method.getName());
        System.out.println("target is " + target);
    }
}
