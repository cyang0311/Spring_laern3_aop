package advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println();
        System.out.println();
        System.out.println("执行前置");
        System.out.println("切点方法对象："+method);
        if (objects!=null&&objects.length>0){
            System.out.println("切点方法的参数");
            System.out.println(objects[0]);
        }else {
            System.out.println("没有参数");
        }
        System.out.println("对象:"+o);
    }
}
