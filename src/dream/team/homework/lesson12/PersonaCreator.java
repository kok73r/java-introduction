package dream.team.homework.lesson12;

public class PersonaCreator {

    static String[] NAMES = {"Jack", "Ivan", "Anton", "Helen", "Jane"};
    static String[] SURNAMES = {"Ovdienko", "Danilko", "Rybalko", "Oleshko", "Funfun"};


    public static void main(String[] args) {
        int size = 100;
        Persona[] persons = createAndFillPersons(size);
        print(persons);
    }

    public static Persona[] createAndFillPersons(int size) {
        Persona[] persons = new Persona[size];
        for (int i = 0; i < persons.length; i++) {
            String name = randomString(NAMES);
            String surname = randomString(SURNAMES);
            int age = randomInt(20, 60);
            int weight = randomInt(60, 80);
            int height = randomInt(160, 195);
            Persona person = new Persona(name, surname, age, weight, height);
            persons[i] = person;
        }
        return persons;
    }

    public static String randomString(String[] str) {
        int index = (int) (Math.random() * str.length);
        return str[index];
    }

    public static int randomInt(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static void print(Persona[] persons) {
        for (Persona person : persons) {
            System.out.println(person);
        }
    }
}
