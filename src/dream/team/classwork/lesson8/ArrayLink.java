package dream.team.classwork.lesson8;

public class ArrayLink {
    public static void main(String[] args) {

        String[] strings = new String[3];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = "str" + i;
        }
        fillArray(strings);

        printArray(strings);

        System.out.println("strings link" + strings);

        String[] anotherString = strings;
        System.out.println("another strings link" + anotherString);


        anotherString[0] = "new text";

        System.out.println(strings[0]);
        System.out.println(anotherString[0]);

        String[] newStrings = createAndFill(10);
        printArray(newStrings);
    }

    public static void printArray(String[] strings) {
        for (String string : strings) {
            System.out.println(string);

        }
    }

    public static void fillArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "str" + i;
        }
    }

    public static String[] createAndFill(int size) {
        String[] strings = new String[size];
        fillArray(strings);
        return strings;
    }
}
