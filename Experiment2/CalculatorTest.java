public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println("Num1: "+c1.num1+", Num2: "+c1.num2);

        Calculator c2 = new Calculator(3, 4);
        System.out.println("Num1: "+c2.num1+", Num2: "+c2.num2);

        c1.add(2, 5);
        c2.add(2.5, 4.5);
    }
}
