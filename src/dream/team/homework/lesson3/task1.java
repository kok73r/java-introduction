package dream.team.homework.lesson3;

public class task1 {

    public static void main(String[] args) {

        //Snowman parameters
        float rHead = 1f;
        System.out.println("Radius of the first ball = " + rHead);

        float rBody = 0.5f;
        System.out.println("Radius of the second ball = " + rBody);

        float rLegs = 0.2f;
        System.out.println("Radius of the third ball = " + rLegs);

        // "p"
        float density = 0.7f;
        System.out.println("Ball Density = - " + density);

        float volumeHead = (float) (4 / 3 * Math.PI * Math.pow(rHead, 3));
        float volumeBody = (float) (4 / 3 * Math.PI * Math.pow(rBody, 3));
        float volumeLegs = (float) (4 / 3 * Math.PI * Math.pow(rLegs, 3));

        float weihgt = density * volumeHead + density * volumeBody + density * volumeLegs;
        System.out.println();
        System.out.println("SnowMan weight = " + weihgt);






    }
}
