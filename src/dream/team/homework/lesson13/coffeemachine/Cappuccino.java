package dream.team.homework.lesson13.coffeemachine;

public class Cappuccino extends Drink {

    protected Cappuccino() {
        super(25, "cappuccino");

    }

    public void cooking() {
        System.out.print("Add milk, ");
        System.out.print("add coffee ");
        System.out.println(" - your Cappuccino is ready");
    }

    @Override
    public String toString() {
        return "Cappuccino{ '" + drinkType + '\'' +
                ", price=" + price +
                '}';
    }
}
