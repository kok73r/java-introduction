package dream.team.classwork.lesson12;

import dream.team.homework.lesson11.Cat;

public class Cats {
    String name;
    int age;
    int strength;
    int weight;

    public Cats(String name, int age, int strength, int weight) {
        this.name = name;
        this.age = age;
        this.strength = strength;
        this.weight = weight;
    }

    public boolean catsFight(Object obj) {
        if (obj instanceof Cats) {
            Cats cat = (Cats) obj;
            if (age < cat.age && weight < cat.weight && strength< cat.strength) {
                System.out.println("Cat is lose");
                return true;

            }
        }
        System.out.println("Cat is win");
        return false;
    }


    @Override
    public String toString() {
        return "name= '" + name + '\'' +
                ", age= " + age +
                ", strength= " + strength +
                ", weight= " + weight;
    }
}
