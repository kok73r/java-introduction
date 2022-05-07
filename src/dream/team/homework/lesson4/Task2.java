package dream.team.homework.lesson4;

public class Task2 {
    public static void main(String[] args) {

        int dogs = 24;
        int cats = 8;
        int portionOfFood = 50;
        int coastOfFood = 2;
        int amountOfFeeding = 3;
        int days = 30;

        int eatInDay = resultEatInDay(portionOfFood,amountOfFeeding);
        int coastShelterInMonth = moneyForTheShelter((eatAnimalssInMonth(dogs,eatInDay,days)),eatAnimalssInMonth(cats,eatInDay,days), coastOfFood);

        System.out.println("EatDogsInMonth " + eatAnimalssInMonth(dogs, eatInDay, days));
        System.out.println("EatCatsInMonth " + eatAnimalssInMonth(cats, eatInDay, days));
        System.out.println("Coast shelter in month = " + coastShelterInMonth);


    }
    public static int resultEatInDay(int portionOfFood, int amountOfFeeding) {

        return portionOfFood * amountOfFeeding;

    }
      public static int eatAnimalssInMonth(int animals, int eatInDay, int days){
        int eatAnimalssInMonth = animals * eatInDay * days;
        return eatAnimalssInMonth;
    }

    public static int moneyForTheShelter (int eatDogsInMonth, int eatCatsInMonth, int coastOfFood){
       return  (eatDogsInMonth + eatCatsInMonth) * coastOfFood;

    }
}
