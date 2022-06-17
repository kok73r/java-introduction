package dream.team.homework.lesson12;

public class Family {

    private final String name;
    Family mother;
    Family father;

    public Family(String name, Family mother, Family father) {

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
