import java.util.ArrayList;

public class Car {
    private static int numberOfCars;
    private static ArrayList<String> brandsOfCars = new ArrayList<String>();

    static {
        brandsOfCars.add("Toyota");
        brandsOfCars.add("Audi");
        brandsOfCars.add("Lexus");
    }
    private String model;
    private String engine;

    public Car(String model, String engine) {
        this.model = model;
        this.engine = engine;
        numberOfCars++;
    }

    public static int getNumberOfCars() {

        return numberOfCars;
    }

    public static ArrayList<String> getBrandsOfCars() {

        return brandsOfCars;
    }
}
