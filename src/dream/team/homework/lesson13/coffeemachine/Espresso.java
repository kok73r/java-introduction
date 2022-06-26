package dream.team.homework.lesson13.coffeemachine;

public class Espresso extends Drink {

    protected Espresso() {
        super(20, "Espresso");
    }

    @Override
    public String toString() {
        return "Espresso{ '" + drinkName + '\'' +
                ", price=" + price +
                '}';
    }
}
