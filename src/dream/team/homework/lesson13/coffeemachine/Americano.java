package dream.team.homework.lesson13.coffeemachine;

public class Americano extends Drink {

    protected Americano() {

        super(20, "Americano");
    }

    public void cooking() {
        System.out.print("Add coffee, ");
        System.out.print("add water ");
        System.out.println("- your Americano is ready");
    }

    @Override
    public String toString() {
        return "Americano{ '" + drinkName + '\'' +
                ", price=" + price +
                '}';
    }
}
