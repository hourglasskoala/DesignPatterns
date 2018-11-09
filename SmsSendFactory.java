public class SmsSendFactory implements SendProduceFactory {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
