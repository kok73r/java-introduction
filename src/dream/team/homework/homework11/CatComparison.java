package dream.team.homework.homework11;

public class CatComparison {
    public static void main(String[] args) {

        Cat cat = new Cat("Justyn", 4, 5, "British");
        Cat cat2 = new Cat("Wruffle", 4, 7, "Scottish");
        Cat cat3 = new Cat("Any", 4, 5, "Sphinx");
        Cat cat4 = new Cat("Bumble", 3);

        System.out.println(cat3);
        System.out.println(cat.equals(cat3));
        System.out.println(cat.equals(cat2));
    }

}
