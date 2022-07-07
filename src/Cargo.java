import java.util.Scanner;

public class Cargo extends Land{
    private int loadCapacity;

    public Cargo() {
        this.loadCapacity = loadCapacity;
    }

    public Cargo(int horsePower, int maxSpeed, int weight, String brand, int wheelsAmount, int fuelConsumption, int loadCapacity) {
        super(horsePower, maxSpeed, weight, brand, wheelsAmount, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }


    @Override
    public String toString() {
        return super.toString() + "Cargo{" +
                "loadCapacity=" + loadCapacity +
                ", power=" + power + '}';
    }

    public void load(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the weight of your cargo");
        int cargo = scan.nextInt();

    }

}
