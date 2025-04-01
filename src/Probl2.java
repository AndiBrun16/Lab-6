package src;
import src.altpachet.NewIntCalculator;
import src.altpachet.DoubleCalculator;

public class Probl2 {
    public static void main(String[] args) {
        NewIntCalculator intCalc = new NewIntCalculator();
        intCalc.init(10);
        int intResult = (Integer) intCalc.add(5).subtract(3).multiply(2).result();
        System.out.println("(10 + 5 - 3) * 2 = " + intResult);

        DoubleCalculator doubleCalc = new DoubleCalculator();
        doubleCalc.init(10.0);
        double doubleResult = (Double) doubleCalc.add(5.0).subtract(3.3).multiply(2.2).result();
        System.out.println("(10 + 5 - 3.3) * 2.2 = " + doubleResult);
    }
}