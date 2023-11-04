public class CalculatorSimple {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return (a + b + c);
    }

    public static void main(String[] args) {
        CalculatorSimple calculatorSimple = new CalculatorSimple();
        System.out.println(calculatorSimple.add(5,2));
        System.out.println(calculatorSimple.add(5,8 , 2));
    }

}
