/**
 * @desc 一般接口需要实现全部的抽象方法，比较浪费。所以需要来个抽象类实现接口方法，然后对象去继承该抽象类
 */
public class ImplementsAdapter extends ImplementsAbtractAdapter {
    public void method1(){
        System.out.println("i am implements adapter method1");
    }
    public static void main(String args[]){
        new ImplementsAdapter().method1();
    }
}
