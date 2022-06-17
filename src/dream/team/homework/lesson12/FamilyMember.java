package dream.team.homework.lesson12;

public class FamilyMember {

    private final String name;
    FamilyMember mother;
    FamilyMember father;

    public FamilyMember(String name, FamilyMember mother, FamilyMember father) {

        this.name = name;
        this.mother = mother;
        this.father = father;
    }

    @Override
    public String toString() {
        return
                " name = '" + name + '\'' +
                        ", mother = " + mother +
                        ", father = " + father;
    }
}
