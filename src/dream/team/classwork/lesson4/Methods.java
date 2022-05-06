package dream.team.classwork.lesson4;

public class Methods {


    public static void main(String[] args) {

        //тут методы не создаём
        printMessage("Teh");

        int number = generateRandom();
        System.out.println(number);

        int randomInt = generateRandom(18, 50);
        System.out.println(randomInt);


    }

    public static void printMessage() {
        System.out.println("message");
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static int generateRandom() {
        return (int) (Math.random() * 100);
    }

    public static int generateRandom(int min, int max) {
        printMessage();
        return (int) (Math.random() * (max - min) + min);
    }
}

//тут методы не создаём
