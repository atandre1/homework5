import java.util.Scanner;

public class Land extends Transport {
    private int wheelsAmount;
    public int fuelConsumption;


    public Land() {
    }

    public Land(int horsePower, int maxSpeed, int weight, String brand, int wheelsAmount, int fuelConsumption) {
        super(horsePower, maxSpeed, weight, brand);
        this.wheelsAmount = wheelsAmount;
        this.fuelConsumption = fuelConsumption;
    }


    @Override
    public String toString() {
        return super.toString() + "Land{" +
                "wheelsAmount='" + wheelsAmount + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", power=" + power + '}';
    }


}
