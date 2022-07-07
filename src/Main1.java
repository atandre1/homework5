public class Main1 {
    public static void main(String[] args) {

//        Passenger car = new Passenger(200, 220, 2200, "Ford", 4, 10, "sedan", 5);
//        System.out.println(car.toString());
//
//        Cargo truck = new Cargo(300, 120, 5000, "MAN", 10, 30, 20000);
//        System.out.println(truck.toString());
//
//        Civil boeing = new Civil(5000, 1000, 14000, "Boeing", 35, 5000, 400, true);
//        System.out.println(boeing.toString());
//
//            Transport transport = new Transport(200, 140, 2200, "Ford");
//            transport.power();
//            System.out.println(transport.toString());
//
        Passenger car = new Passenger(180, 140, 2200, "Ford", 4, 10, "sedan", 4);
        car.power();
        System.out.println(car.toString());
        car.distance();
        car.fuel();
//
//            Military destroyer = new Military(700, 550, 5000, "F15", 20, 2000, true, 10);
//            destroyer.power();
//            System.out.println(destroyer.toString());
    }
}
