package dream.team.homework.lesson14.converter;

public class Fahrenheits implements Convertable {
    public int convert(int degree) {
        System.out.println("Converting: ");
        int degreeFahrenheits = ((degree * 9 / 5) + 32);
        System.out.println(degree + " degrees Celsius = " + degreeFahrenheits + " degrees Fahrenheits: ");
        return degreeFahrenheits;
    }
}
