package dream.team.classwork.lesson8;

public class CatchNumber {
    public static void main(String[] args) {
        /*Реалізувати механізм підбору чотирицифрового коду. Вивести в консоль кількість ітерацій.

                Наприклад, ми маємо pin = 9407, за скільки ітерацій програма підбере код.

                Цикли, масиви, іфи і тд.*/
        int number = 9999;
        int units = number % 10;
        System.out.println(units);
        int dozens = (number / 10) % 10;
        System.out.println(dozens);
        int hundreds = (number / 100) % 10;
        System.out.println(hundreds);
        int thousend = (number / 1000) % 10;
        System.out.println(thousend);

        int[] numbers = {thousend, hundreds, dozens, units};
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <= 9; j++) {
                counter++;
                if (numbers[i] == j) {

                    System.out.println("your number: " + j);
                    break;
                }
            }
        }
        System.out.println(counter);


    }

}