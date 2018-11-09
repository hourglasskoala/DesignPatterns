/**
 * @desc 普通工厂模式
 *
 */
public class CommonFactoryPattern {
    public static void main(String args[]) {
        CommonFactory commonFactory = new CommonFactory();
        commonFactory.produce("SmsSender").send();
        commonFactory.produce("MessageSender").send();
    }
}


class CommonFactory {
    public Sender produce(String type) {
        if ("SmsSender".equals(type)) {
            return new SmsSender();
        } else if ("MessageSender".equals(type)) {
            return new MessageSender();
        }
        return null;
    }
}