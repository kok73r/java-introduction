package dream.team.homework.lesson2;

public class ValueExchange {
    //task1
    public static void main(String[] args) {
        int a = 3;
        System.out.println("a = " + a);
        int b = 8;
        System.out.println("b = " + b);

        int c = a;
        a = b;
        b = c;

        System.out.println();
        System.out.println("a= " + a);
        System.out.println("b= " + b);


    }

}