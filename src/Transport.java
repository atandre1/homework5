public class Transport {
    public int horsePower;
    public int maxSpeed;
    public int weight;
    public String brand;
    public double power;

    public Transport() {
    }

    public Transport(int horsePower, int maxSpeed, int weight, String brand) {
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "horsePower='" + horsePower + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand +
                ", power=" + power + '\'' +
                '}';
    }

    public double power(){
        power = horsePower * 0.74;
        return power;
    }
}
