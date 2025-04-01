

public class Problema1 {
    public static void main(String[] args) {
        // a) Testarea IntCalculator
        IntCalculator calculator = new IntCalculator(10);
        int resultA = calculator.add(5).subtract(3).multiply(2).result();
        System.out.println("a) " + resultA);

        // b) Testarea AdvancedCalculator
        AdvancedCalculator advancedCalculator = new AdvancedCalculator(10);
        double resultB = advancedCalculator.divide(2).power(4).result();
        System.out.println("b) [(10/2)^4] = " + resultB);

        AdvancedCalculator advancedCalculator2 = new AdvancedCalculator(16);
        double resultRoot = advancedCalculator2.root(2).result();
        System.out.println("Radical din 16 de ordin 2: " + resultRoot);
    }
}