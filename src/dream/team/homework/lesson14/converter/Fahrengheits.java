package dream.team.homework.lesson14.converter;

public class Fahrengheits implements Convertable {
    public int convert(int degree) {
        System.out.println("Converting: ");
        int degreeFahrengheits = ((degree * 9 / 5) + 32);
        System.out.println("Degrees Celsius " + degree + " = degrees Fahrengheits: " + degreeFahrengheits);
        return degreeFahrengheits;
    }
}
