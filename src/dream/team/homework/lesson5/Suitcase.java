package dream.team.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Suitcase {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Insert size value of your suitcase(lenght, width, height): ");

        int length = Integer.parseInt(reader.readLine());
        int width = Integer.parseInt(reader.readLine());
        int height = Integer.parseInt(reader.readLine());

        /*int volume = calculateVolume(length, width, height);
        System.out.println("Volume bag or suitcase = " + volume);
*/
        if (length > 55 && width > 20 && height > 40) {
            System.out.println("Your suitcase does not fit");
        }else if(length <= 55 && width <= 20 && height <= 40){
            System.out.println("Your suitcase is the right size");
        }/*else {
            System.out.println("Wrong value.");
        }*/

        if (length > 40 && width > 22 && height > 53) {
            System.out.println("Your suitcase does not fit");
        }else if(length <= 40 && width <= 22 && height <= 53){
            System.out.println("Your suitcase is the right size");
        }else {
            System.out.println("Your suitcase does not fit");
        }

        }

    }

   /* public static int calculateVolume(int length, int width, int heiht) {
        return (length * width * heiht);
    }*/

