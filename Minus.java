/**
 * @desc 策略模式
 */
public class Minus implements ICalculator {
    @Override
    public int calculator(int a, int b) {
        return a - b;
    }

    public static void main(String args[]) {
        ICalculator iCalculator1 = new Minus();
        ICalculator iCalculator2 = new Plus();
        iCalculator1.calculator(3, 1);
        iCalculator2.calculator(3, 1);
    }

}
