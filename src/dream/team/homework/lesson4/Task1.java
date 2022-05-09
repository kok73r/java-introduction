package dream.team.homework.lesson4;

public class Task1 {
    public static void main(String[] args) {

        printAirplaneInfo("Jet", "F-22 Raptor");
        printAirplaneInfo("Airliner", "Aerobus 737", "120");
        printAirplaneInfo("Airliner", "Boeing 777", "180", "28");


    }

    public static void printAirplaneInfo(String name, String type) {
        System.out.println("Type of aircraft: " + name + ", Model: " + type);

    }

    public static void printAirplaneInfo(String name, String type, String numberOfEconomClassSeats) {
        System.out.println("Type of aircraft: " + name + ", Model: " + type + ", number of economy class seats " + numberOfEconomClassSeats);

    }

    public static void printAirplaneInfo(String name, String type, String numberOfEconomClassSeats,
                                         String numberOfbusinessClassSeats) {
        System.out.println("Type of aircraft: " + name + ", Model: " + type + ", number of economy class seats "
                + numberOfEconomClassSeats + ", number of business class seats " + numberOfbusinessClassSeats);

    }


}
