package dream.team.homework.lesson13.coffeemachine;

public class Tea extends Drink {

    protected Tea(String type) {
        super(15, type);


    }

    public void cooking() {
        System.out.print("Add water, ");
        System.out.print("add tea ");
        System.out.println("- your tea is ready");
    }

    @Override
    public String toString() {
        return "Tea{ '" + drinkType + '\'' +
                ", price=" + price +
                '}';
    }
}
