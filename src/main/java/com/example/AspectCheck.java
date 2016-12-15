package com.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by akarui on 2016/12/14.
 */
@Aspect
@Order(5)
@Component
public class AspectCheck {

    @After("execution(* check(..))")
    public void checkResiponsibility(JoinPoint joinPoint) {
        Handler next = null;
        boolean isNeedNext = false;
        try {
            List<String> targetList = (List<String>) joinPoint.getArgs()[0];
            Class<Handler> classType = joinPoint.getSignature().getDeclaringType();
            Method getNext = classType.getMethod("getNext", new Class[] {});
            next = (Handler) getNext.invoke(joinPoint.getThis(), new Object[] {});
            Method getIsNeedNext = classType.getMethod("isNeedNext", new Class[] {});
            isNeedNext = (Boolean) getIsNeedNext.invoke(joinPoint.getThis(), new Object[] {});
            if(null != next && isNeedNext){
                next.check(targetList);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
