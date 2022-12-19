public class App {

    public static void main(String[] args) {
//        Animal animal = new Animal("Marzie");
//        animal.greeting();
//
//        Cat cat = new Cat("Momo", 9);
//        cat.greeting();
        Car honda = new Car("Honda", "V6");
        System.out.println("The number of cars we have made is: " + Car.getNumberOfCars());
        System.out.println("Our car types are: " + Car.getBrandsOfCars());
        Car hyundai = new Car("Hyundai", "V6");
        System.out.println("The number of cars we have made is: " + Car.getNumberOfCars());
        System.out.println("Our car types are: " + Car.getBrandsOfCars());


    }

}
