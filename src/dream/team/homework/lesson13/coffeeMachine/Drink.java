package dream.team.homework.lesson13.coffeeMachine;

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
    public Drink createDrink (CoffeeMachineMain.DrinkType type) {
        Drink drink = null;

        switch (type) {
            case AMERICANO:
                drink = new Americano();
                break;
            case ESPRESSO:
                drink = new Espresso();
                break;
            case CAPPUCCINO:
                drink = new Cappuccino();
                break;
            case LATTE:
                drink = new Latte();
                break;
            case TEA_BLACK:
                drink = new Tea("BlackTea");
                break;
            case TEA_GREEN:
                drink = new Tea("GreenTea");
                break;
        }

        return drink;
    }
    @Override
    public String toString() {
        return "CoffeeMachineDrinks{" +
                "price=" + price +
                '}';
    }
}
