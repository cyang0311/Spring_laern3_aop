package advice;
import org.springframework.aop.ThrowsAdvice;
import java.lang.reflect.Method;

public class ErrorAdvice2 implements ThrowsAdvice {
    public void afterThrowing(Exception e) throws Throwable{
        System.out.println("执行异常通知：schema-base方式");
    }

}
