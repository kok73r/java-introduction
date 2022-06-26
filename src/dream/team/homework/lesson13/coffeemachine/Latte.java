package dream.team.homework.lesson13.coffeemachine;

public class Latte extends Drink {

    protected Latte() {
        super(30, "latte");

    }

    public void cooking() {
        System.out.println("Add milk");
        System.out.println("Add coffee");
        System.out.println("Add foam");
    }

    @Override
    public String toString() {
        return "Latte{ '" + drinkType + '\'' +
                ", price=" + price +
                '}';
    }
}
