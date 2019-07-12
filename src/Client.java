import DDD.Demo;

import DDD.Demo2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Demo demo = ac.getBean("demo",Demo.class);
        demo.demo3("姓名",777);


//        Demo2 demo2 = (Demo2) ac.getBean("Demo2");
//        demo2.demo21("cc",123);


    }
}
