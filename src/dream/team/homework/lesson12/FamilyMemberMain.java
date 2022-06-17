package dream.team.homework.lesson12;

public class FamilyMemberMain {
    public static void main(String[] args) {
        FamilyMember grandMother = new FamilyMember("Sofia", null, null);
        FamilyMember grandFather = new FamilyMember("Augustin", null, null);
        FamilyMember mothersGrandMother = new FamilyMember("Olga", null, null);
        FamilyMember mothersGrandFather = new FamilyMember("Memphis", null, null);

        FamilyMember mother = new FamilyMember("Any", mothersGrandMother, mothersGrandFather);
        FamilyMember father = new FamilyMember("Nick", grandMother, grandFather);
        FamilyMember fatherSister = new FamilyMember("Olivia", grandMother, grandFather);

        FamilyMember son = new FamilyMember("Jon", mother, father);

        System.out.println(mother);
        System.out.println(father);
        System.out.println(son);
        System.out.println(fatherSister);
    }
}
