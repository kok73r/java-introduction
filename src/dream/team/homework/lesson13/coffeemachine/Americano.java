package dream.team.homework.lesson13.coffeemachine;

public class Americano extends Drink {

    protected Americano() {

        super(20, "espresso");

    }

    public void cooking() {
        System.out.println("Add coffee");
        System.out.println("Add water");
    }

    @Override
    public String toString() {
        return "Americano{ '" + drinkType + '\'' +
                ", price=" + price +
                '}';
    }
}
