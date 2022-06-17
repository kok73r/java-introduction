package dream.team.classwork.lesson12;

import dream.team.homework.lesson11.Cat;

public class CatsFight {
    public static void main(String[] args) {
        Cats cat = new Cats("Jonny", 6, 6, 5);
        Cats cat2 = new Cats("Rose", 7, 7, 6);


        System.out.println(cat.catsFight(cat2));

    }



}
