package dream.team.homework.lesson14.converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public abstract class DegreesConverter {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Input degrees in Celsius: ");
        int degree = Integer.parseInt(READER.readLine());
        System.out.println("Enter KELVINS or FAHREINGHEIT: ");
        DegreeType type = inputType();

        Convertable convertable = createConverter(type);
        convertable.convert(degree);

    }

    public static DegreeType inputType() {
        try {
            return DegreeType.valueOf(READER.readLine());
        } catch (Exception exception) {
            System.out.println("Incorrect value: "+ exception.getMessage());
            System.out.println("Try more: ");
            return inputType();
        }
    }

    public static Convertable createConverter(DegreeType type) {
       return switch (type) {
            case FAHRENHEITS -> new Fahrengheits();
            case KELVINS -> new Kelvin();
        };
    }
}
