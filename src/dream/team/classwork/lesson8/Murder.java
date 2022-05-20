package dream.team.classwork.lesson8;

public class Murder {
    public static void main(String[] args) {

        int[] values = {20, 56, 67, 88, 40, 25, 1, 29, 78};

        int index = 0;
        int maxValue = values[index];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
                index = i;
            }
        }
        System.out.println(index + " murder " + maxValue);
    }

}

