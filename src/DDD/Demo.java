package DDD;

public class Demo {
    public void demo1(){
        System.out.println("demo1");
    }
    public int demo2(){
        System.out.println("切点方法demo2");
        return 22222222;
    }
    public void demo3(String name,int id){
        System.out.println("切点方法demo3 ");

        }
    public void demo4() throws Exception {
        System.out.println("切点方法demo4 ");
        throw new Exception(){};
    }
    public void demo5(){
        System.out.println("切点方法demo5");
    }
    @Override
    public String toString() {
        return "Demo{}";
    }
}
