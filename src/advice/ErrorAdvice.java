package advice;

import org.springframework.aop.ThrowsAdvice;

public class ErrorAdvice {
    public void myError(Exception e){
        System.out.println("执行异常通知"+e.getMessage());
    }
}
