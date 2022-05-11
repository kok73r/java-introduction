package dream.team.classwork.lesson6;

public class Castle {
    public static void main(String[] args) {
        int start = 1000;
        int end = 1500;
        int shot = 1100;

        boolean result = haveWeHitCastle(start, end, shot);

        System.out.println("Have hit? - " + result);

        System.out.println("Have hit? - " + haveWeHitCastle2(600,1000, 1200));
        System.out.println("Have hit? - " + haveWeHitCastle2(600,1000, 800));
        System.out.println("Have hit? - " + haveWeHitCastle2(600,1000, 500));

        String answerForCastle = haveWeHitCastle2(start, end, shot) ?
                "You have hit Castle" : "You haven`t hit Castle";
        System.out.println(answerForCastle);


    }

    private static boolean haveWeHitCastle(int start, int end, int shot) {
        if (shot < start || shot > end) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean haveWeHitCastle2(int start, int end, int shot) {
        return shot >= start && shot <= end;
    }

}