/**
 * @desc 静态工厂方法模式
 */
public class StaticMethodFactoryPattern {
    public static void main(String args[]) {
        StaticSendFactory.produceMessageSender().send();
        StaticSendFactory.produceSmsSender().send();
    }
}

class StaticSendFactory {
    public static Sender produceSmsSender() {
        return new SmsSender();
    }

    public static Sender produceMessageSender() {
        return new MessageSender();
    }
}
