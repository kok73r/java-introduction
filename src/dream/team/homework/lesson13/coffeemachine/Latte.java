package dream.team.homework.lesson13.coffeemachine;

public class Latte extends Drink {

    protected Latte() {
        super(30, "Latte");
    }

    public void cooking() {
        System.out.print("Add milk, ");
        System.out.print("add coffee, ");
        System.out.println("add foam - your Latte is ready");
    }

    @Override
    public String toString() {
        return "Latte{ '" + drinkName + '\'' +
                ", price=" + price +
                '}';
    }
}
