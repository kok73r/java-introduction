package dream.team.classwork.lesson4;

public class MethodTest {

    public static void main(String[] args) {

        printInfo();
        printInfo();

        int result = sum(1, 2);
        System.out.println("result " + result);

        int result2 = sum(result, 10);
        System.out.println(result2);

        int evenNumber = 17;
        boolean even = isEven(evenNumber);
        System.out.println("even " + even);

        double bigger = 100;
        double smaller = 5;

        double d = divide(bigger, smaller);
        System.out.println(d);
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void printInfo() {
        System.out.println("Some Info");
    }

    public static int sum(int number1, int number2) {
        int sum = number1 + number2;
        return sum;

    }

    public static double divide(double n1, double n2) {
        return n1 / n2;
    }
}
