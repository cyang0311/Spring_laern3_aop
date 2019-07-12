package advice;

public class Advice {
    public void before(String name,int id){
        System.out.println("");
        System.out.println("前置"+name+"   "+id);
        System.out.println("");
    }

    public void after(String name){
        System.out.println("");
        System.out.println("后置");
        System.out.println("");
    }

    public void before2(){
        System.out.println("无参前置方法");
    }
}
