package dream.team.homework.lesson14.converter;

public class Kelvin implements Convertable {
    public int convert(int degree) {
        System.out.println("Converting: ");
        int degreeKelvins = (degree + 273);
        System.out.println(degree + "degrees Celsius = " + degreeKelvins + " degrees Kelvins: ");
        return degreeKelvins;
    }
}
