package dream.team.homework.lesson12;

public class FamilyMain {
    public static void main(String[] args) {
        Family grandMother = new Family("Sofia", null, null);
        Family grandFather = new Family("Augustin", null, null);
        Family mothersGrandMother = new Family("Olga", null, null);
        Family mothersGrandFather = new Family("Memphis", null, null);

        Family mother = new Family("Any", mothersGrandMother, mothersGrandFather);
        Family father = new Family("Nick", grandMother, grandFather);
        Family fatherSister = new Family("Olivia", grandMother, grandFather);

        Family son = new Family("Jon", mother, father);



        System.out.println(mother);
        System.out.println(father);
        System.out.println(son);
        System.out.println(fatherSister);
    }
}
