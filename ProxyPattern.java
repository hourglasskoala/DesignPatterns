public class ProxyPattern {
}

interface Sourceable {
    void method();
}

class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("i am sourceable");
    }
}

class Proxy implements Sourceable {
    private Source source;

    Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    public void before() {
        System.out.println("==========before======");
    }

    public void after() {
        System.out.println("==========after========");
    }
}
