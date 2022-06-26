package dream.team.homework.lesson13.coffeemachine;

public class Tea extends Drink {



    protected Tea(String drinkName) {

        super(15, drinkName);
    }

    public void cooking() {
        System.out.print("Add water, ");
        System.out.print("add tea ");
        System.out.println("- your tea is ready");
    }

    @Override
    public String toString() {
        return "Tea{ '" + drinkName + '\'' +
                ", price=" + price +
                '}';
    }
}
