/**
 * @desc 多工厂方法工厂模式
 *
 */
public class MutiFactoryMethodPattern {
    public static void main(String args[]) {
        SendFactory sendFactory = new SendFactory();
        Sender smsSender = sendFactory.produceSmsSender();
        Sender messageSender = sendFactory.produceMessageSender();
        smsSender.send();
        messageSender.send();
    }
}


class SendFactory {
    public Sender produceSmsSender() {
        return new SmsSender();
    }

    public Sender produceMessageSender() {
        return new MessageSender();
    }
}

