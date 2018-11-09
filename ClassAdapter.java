/**
 * @desc 类适配器:有个Source类，拥有一个方法，待适配,目标接口AdapterTargetable1
 * 通过适配类ClassAdapter拥有Source类的method1()
 */

public class ClassAdapter extends AdapterSource implements AdapterTargetable1 {
    @Override
    public void method2() {
        System.out.println("i am class adapter method2");
    }

    public static void main(String args[]){
        AdapterTargetable1 adapterTargetable1 = new ClassAdapter();
        adapterTargetable1.method1();
        adapterTargetable1.method2();
    }
}
