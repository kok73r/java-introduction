package dream.team.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apples {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert count of apples");
        int applesWeHarwest = Integer.parseInt(reader.readLine());
        int applesInBigJar = 5;
        int applesInMediumJar = 3;
        int applesInSmallJar = 1;

        int bigJars = countBigJars(applesWeHarwest, applesInBigJar);
        System.out.println("Big jars = " + bigJars);
        int mediumJars = countMediumJars(applesWeHarwest, applesInBigJar, applesInMediumJar);
        System.out.println("Medium jars = " + mediumJars);
        int smallJars = countSmallJars(applesWeHarwest, applesInBigJar, applesInMediumJar, applesInSmallJar);
        System.out.println("Small jars = " + smallJars);
    }

    public static int countBigJars(int applesWeHarwest, int applesInJar) {
        return applesWeHarwest / applesInJar;
    }

    public static int countMediumJars(int applesWeHarwest, int applesInBigJar,
                                      int applesInMediumJar) {
       int remainderApples = applesWeHarwest % applesInBigJar;
        return remainderApples/applesInMediumJar;
    }

    public static int countSmallJars(int applesWeHarwest, int applesInBigJar,
                                     int applesInMediumJar, int applesInSmallJar) {
        int remainderApples =applesWeHarwest % applesInBigJar;
        int remainderApplesSmall = remainderApples%applesInMediumJar;
        return remainderApplesSmall/applesInSmallJar;
    }

}
