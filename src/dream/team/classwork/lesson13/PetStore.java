package dream.team.classwork.lesson13;

import java.util.ArrayList;
import java.util.List;

public class PetStore {
    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal cat2 = new Cat();


        //Animal[] animals1 = new Animal[2];
        List<Animal> animals = new ArrayList<>();

        animals.add(cat);
        animals.add(dog);
        animals.add(cat2);
        animals.add(new Rat());

        for (Animal animal : animals) {
            animal.speak();
        }

    }
}
