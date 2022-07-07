public class Main1 {
    public static void main(String[] args) {

        Passenger car = new Passenger(180, 140, 2200, "Ford", 4, 10, "sedan", 4);
        car.power();
        System.out.println(car.toString());
        car.distance();
        car.fuel();

        System.out.println("--------------------------------------------------------------------------------");

        Cargo truck = new Cargo(300, 110, 5000, "MAN", 8, 16, 5000);
        truck.power();
        System.out.println(truck.toString());
        truck.load();

        System.out.println("--------------------------------------------------------------------------------");

        Civil airplane = new Civil(3000, 900, 8000, "Airbus", 20, 4000, 300, true);
        airplane.power();
        System.out.println(airplane.toString());
        airplane.load();

        System.out.println("--------------------------------------------------------------------------------");

        Military destroyer = new Military(3000, 1100, 4000, "Eurofighter", 10, 1500, false, 4);
        destroyer.power();
        System.out.println(destroyer.toString());
        destroyer.fire();
        destroyer.catapultGo();
    }
}
