package dream.team.homework.lesson13.coffeemachine;

public class Tea extends Drink {

    protected Tea(String type) {
        super(15, type);


    }

    public void cooking() {
        System.out.println("Add water");
        System.out.println("Add tea");
    }

    @Override
    public String toString() {
        return "Tea{ '" + drinkType + '\'' +
                ", price=" + price +
                '}';
    }
}
