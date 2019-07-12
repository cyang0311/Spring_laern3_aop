package advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行后置");
        if (o!=null){
            System.out.println("返回值"+o);
        }
        System.out.println("调用对象"+o1);
        System.out.println();
        System.out.println();
    }
}
