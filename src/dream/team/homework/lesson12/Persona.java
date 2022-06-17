package dream.team.homework.lesson12;

public class Persona {

    private final String name;
    private final String surname;
    public int age;
    public int weight;
    private final int height;

    public Persona(String name, String surname, int age,int weight,int height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;

    }
    @Override
    public String toString() {
        return "Persona " +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", age = " + age +
                ", weight = " + weight +
                ", height = " + height;
    }
}
