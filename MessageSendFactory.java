public class MessageSendFactory implements SendProduceFactory {
    @Override
    public Sender produce() {
        return new MessageSender();
    }

    public static void main(String args[]) {
        MessageSendFactory messageSendFactory = new MessageSendFactory();
        messageSendFactory.produce().send();
    }
}
