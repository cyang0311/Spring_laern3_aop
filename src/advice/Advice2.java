package advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Aspect
public class Advice2 {
    @Before("DDD.Demo2.demo21(String,int)")
    public void before(JoinPoint jp){
        System.out.println("前置");
        String name = jp.getSignature().getName();
        List<Object> args = Arrays.asList(jp.getArgs());
        System.out.println("Method:"+name+"    "+args);
    }

    @After("execution(* DDD.Demo2.demo21(..))")
    public void after(){
        System.out.println("后置");
    }
}
