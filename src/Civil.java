public class Civil extends Air{
    private int passengersAmount;
    boolean businessClass;


    public Civil(int horsePower, int maxSpeed, int weight, String brand, int wingspan, int minRunaway, int passengersAmount, boolean businessClass) {
        super(horsePower, maxSpeed, weight, brand, wingspan, minRunaway);
        this.passengersAmount = passengersAmount;
        this.businessClass = businessClass;
    }

    public int getPassengersAmount() {
        return passengersAmount;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }


    @Override
    public String toString() {
        return super.toString() + "Civil{" +
                "passengersAmount=" + passengersAmount +
                ", businessClass=" + businessClass +
                ", power=" + power + '}';
    }

}
