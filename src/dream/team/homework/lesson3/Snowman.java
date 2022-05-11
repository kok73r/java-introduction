package dream.team.homework.lesson3;

public class Snowman {

    public static void main(String[] args) {

        //Snowman parameters
        float rHead = 1f;
        System.out.println("Radius of the head = " + rHead);

        float rBody = 0.5f;
        System.out.println("Radius of the body = " + rBody);

        float rLegs = 0.2f;
        System.out.println("Radius of the legs = " + rLegs);

        float density = 0.7f;
        System.out.println("Ball Density = - " + density);

        float volumeHead = (float) (4 / 3 * Math.PI * Math.pow(rHead, 3));
        float volumeBody = (float) (4 / 3 * Math.PI * Math.pow(rBody, 3));
        float volumeLegs = (float) (4 / 3 * Math.PI * Math.pow(rLegs, 3));

        float weihgt = density * (volumeHead + volumeBody + volumeLegs);
        System.out.println();
        System.out.println("SnowMan weight = " + weihgt);


    }
}
