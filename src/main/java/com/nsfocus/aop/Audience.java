package com.nsfocus.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    @Pointcut("execution(** com.nsfocus.aop.Performance.perform(..))")
    public void performance(){}

    @Before("performance")
    public void silenceCellPhones(){
        System.out.println("silencing cell phones");
    }

    @Before("performance")
    public void taskeSeats(){
        System.out.println("take seats");
    }

    @AfterReturning("performance")
    public void applause(){
        System.out.println("CLAP CLAP CLAP");
    }

    @AfterThrowing("performance")
    public void demandRefund(){
        System.out.println("demanding a refund");
    }

    @Around("performance")
    public void watchPerformance(ProceedingJoinPoint proceedingJoinPoint){
        try{
            System.out.println("silencing cell phones");
            System.out.println("taking seats");
            proceedingJoinPoint.proceed();
            System.out.println("CLAP");
        }catch (Throwable e){
            System.out.println("Demanding a refund");
        }
    }
}
