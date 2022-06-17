package dream.team.classwork.lesson13;

public class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("gav");
        action();
    }

    private void action() {
        System.out.println("wags its tail");
    }
}
