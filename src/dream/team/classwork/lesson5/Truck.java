package dream.team.classwork.lesson5;

import java.util.Scanner;

public class Truck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input length, width, height");
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        int volume = calculateVolume(length, width, height);
        System.out.println("Volume truck = " + volume);

        System.out.println("Input max weight by 1 meter cubic =");
        int maxWeightByMeter = scanner.nextInt();
        System.out.println("Total weight = " + calculatetotalWeight(volume, maxWeightByMeter));

    }

    public static int calculateVolume(int length, int width, int heiht) {

        return (length * width * heiht);
    }

    public static int calculatetotalWeight(int volume, int maxWeightByMeter) {
        return volume * maxWeightByMeter;

    }

}
