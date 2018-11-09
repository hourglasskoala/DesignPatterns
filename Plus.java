/**
 *  @desc 策略模式
 */
public class Plus implements ICalculator {
    @Override
    public int calculator(int a, int b) {
        return a + b;
    }
}
