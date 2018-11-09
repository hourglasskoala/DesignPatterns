/**
 * @desc 在类适配的基础修改适配器持有Source对象，已达到兼容的目的
 */
public class ObjectAdapter implements AdapterTargetable1 {
    private Source source;

    ObjectAdapter(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method();
    }

    @Override
    public void method2() {
        System.out.println("object adapter method2");
    }

    public static void main(String args[]){
        AdapterTargetable1 adapterTargetable1 = new ObjectAdapter(new Source());
        adapterTargetable1.method2();
        adapterTargetable1.method1();
    }
}
