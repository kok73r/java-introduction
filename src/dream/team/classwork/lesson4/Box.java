package dream.team.classwork.lesson4;

import java.util.Scanner;

public class Box {

    public static void main(String[] args) {


        //Рассчитать обьем коробки width, height, depth

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input width, height, depth");
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int depth = scanner.nextInt();

        int volume = calcVolume(width, height, depth);
        System.out.println(volume);

        System.out.println(calcVolume(345, 666, 344));
    }

    public static int calcVolume(int width, int heiht, int depth) {

        return (width * heiht * depth);
    }
}
