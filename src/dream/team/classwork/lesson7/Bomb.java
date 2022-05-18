package dream.team.classwork.lesson7;

public class Bomb {
    public static void main(String[] args) throws InterruptedException {

        int i = 10;
        do {
            System.out.println("To detonate bomb " + i + " sec");
            Thread.sleep(1000);
            i--;

            if (i == 5){
                break;
            }

        } while (i >= 0);
        if (i==0) {
            System.out.println("Bomb detonated!");
        }else {
            System.out.println("Bomb recover");
        }
    }
}


