package dream.team.classwork.lesson4;

public class Salary {
    public static void main(String[] args) {

        int worker1 = 3000;
        int worker2 = 4500;
        int worker3 = 5800;
        int amount = 3;

        int month = 12;
        int year = 10;

        int salary1 = worker1 * month * year;
        System.out.println("Salary1 10 years - " + salary1);

        int salary2 = worker2 * month * year;
        System.out.println("Salary2 10 years - " + salary2);

        int salary3 = worker3 * month * year;
        System.out.println("Salary3 10 years - " + salary3);

        // percent tax in year
        int nds1 = ((salary1 / 100) * 5);
        int nds2 = ((salary2 / 100) * 5);
        int nds3 = ((salary3 / 100) * 5);

        int snds1 = (salary1 - nds1);
        System.out.println("Salary1 with NDS - " + snds1);
        int snds2 = (salary2 - nds2);
        System.out.println("Salary2 with NDS - " + snds2);
        int snds3 = (salary3 - nds3);
        System.out.println("Salary3 with NDS - " + snds3);


        int avr = (snds1 + snds2 + snds3) / amount;
        System.out.println("Average salary = " + avr);


    }
}
