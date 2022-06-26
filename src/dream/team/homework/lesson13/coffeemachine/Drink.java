package dream.team.homework.lesson13.coffeemachine;

public class Drink {

    protected String drinkType;
    protected int price;


    public Drink(int price, String drinkType) {
        this.price = price;
        this.drinkType = drinkType;
    }

    public void cooking() {
        System.out.println("Add coffee");
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "price=" + price +
                '}';
    }

}
