package com.Demo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

    @Before("execution(* com.Demo.ShoppingCart.checkOut(..))")
    public  void beforeLogger(JoinPoint data)
    {
        System.out.println("before logger "+data.getArgs()[0]);
    }

    @After("execution(* com.Demo.ShoppingCart.checkOut(..))")
    public  void afterLogger()
    {
        System.out.println("after logger");
    }

    @Pointcut("execution(* com.Demo.ShoppingCart.quantity())")
    public  void  afterReturningPointCut()
    {

    }

    @AfterReturning(pointcut = "afterReturningPointCut()",returning = "val")
    public  void  afterReturning(int val)
    {
        System.out.println("returned "+val);
    }
}
