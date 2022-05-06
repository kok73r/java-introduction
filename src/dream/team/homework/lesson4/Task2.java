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
        int coastShelterInMonth = moneyForTheShelter((eatDogsInMonth(dogs,eatInDay,days)),eatCatsInMonth(cats,eatInDay,days), coastOfFood);

        System.out.println("EatDogsInMonth " + eatDogsInMonth(dogs, eatInDay, days));
        System.out.println("EatCatsInMonth " + eatCatsInMonth(cats, eatInDay, days));
        System.out.println("Coast shelter in month = " + coastShelterInMonth);


    }
    public static int resultEatInDay(int portionOfFood, int amountOfFeeding) {

        return portionOfFood * amountOfFeeding;

    }
    public static int eatDogsInMonth(int dogs, int eatInDay, int days){
        int eatDogsInMonth = dogs * eatInDay * days;
        return eatDogsInMonth;
    }
    public static int eatCatsInMonth(int cats, int eatInDay, int days){
        int eatCatsInMonth = cats * eatInDay * days;
        return eatCatsInMonth;
    }

    public static int moneyForTheShelter (int eatDogsInMonth, int eatCatsInMonth, int coastOfFood){
       return  (eatDogsInMonth + eatCatsInMonth) * coastOfFood;

    }
}
