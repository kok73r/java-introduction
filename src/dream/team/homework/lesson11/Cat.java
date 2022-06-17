package dream.team.homework.lesson11;

public class Cat {
    String name;
    int age;
    int weight;
    String breed;

    public Cat(String name, int age, int weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;

    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;
            if (age == cat.age && weight == cat.weight) {
                System.out.println("These cats are the same");
                return true;

            }
        }
        System.out.println("These cats are different");
        return false;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                '}';
    }

}
