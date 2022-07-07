import java.util.Scanner;

public class Passenger extends Land {
    String carBody;
    int passengers;
    private double distance;
    private double fuel;

    public Passenger(int horsePower, int maxSpeed, int weight, String brand, int wheelsAmount, int fuelConsumption, String carBody, int passengers) {
        super(horsePower, maxSpeed, weight, brand, wheelsAmount, fuelConsumption);
        this.carBody = carBody;
        this.passengers = passengers;
    }

    public Passenger(String carBody, int passengers) {
        this.carBody = carBody;
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return super.toString() + "Passenger{" +
                "carBody='" + carBody + '\'' +
                ", passengers=" + passengers +
                ", power=" + power + '}';
    }

    public double distance() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter travel time in hours");
        double time = input.nextInt();
        distance = time * maxSpeed;
        System.out.print("In " + time + " hours car " + brand + " driving maximum speed " + maxSpeed + " km/hour will pass " + distance + " km and will consume ");
        return distance;

    }

    public double fuel() { // не понимаю условия сделать этот метод приватным. Тогда из main не запускается.
        double fuel = this.distance / 100 * fuelConsumption;
        System.out.println(fuel + " liters of fuel.");
        return fuel;
    }
}
