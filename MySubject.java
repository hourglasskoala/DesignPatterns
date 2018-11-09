public class MySubject extends AbtractSubject {
    public void operation() {
        notifyObservers();
    }

    public static void main(String args[]) {
        Subject subject = new MySubject();
        subject.add(new Observer1());
        subject.add(new Observer2());
        subject.operation();
    }
}
