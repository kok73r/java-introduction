package dream.team.classwork.lesson6;

public class Sum {
    public static void main(String[] args) {

        int number1 = 1;
        int number2 = 2;
        double result = sum(number1, number2);

        System.out.println(sum(4, 5));

        System.out.println(sum(40000L, 50000L));

        System.out.println(sum(4, 5000.0));

        System.out.println(result);

    }
    public static double sum(int n1, int n2) {
        return n1 + n2;
    }
    public static long sum(long n1, long n2) {
        return n1 + n2;
    }
    public static double sum(double n1, double n2) {
        return n1 + n2;
    }

}

