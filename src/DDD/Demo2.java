package DDD;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component(value = "Demo2")
public class Demo2 {
    @Pointcut("execution(* DDD.Demo2.demo21(String,int))&&args(name,id)")
    public void demo21(String name,int id){
        System.out.println("demo21方法");
    }
}
