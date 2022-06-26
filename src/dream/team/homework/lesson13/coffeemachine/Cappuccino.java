package dream.team.homework.lesson13.coffeemachine;

public class Cappuccino extends Drink {

    protected Cappuccino() {
        super(25, "cappuccino");

    }

    public void cooking() {
        System.out.println("Add milk");
        System.out.println("Add coffee");
    }

    @Override
    public String toString() {
        return "Cappuccino{ '" + drinkType + '\'' +
                ", price=" + price +
                '}';
    }
}
