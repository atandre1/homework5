public class Military extends Air{
    private boolean catapult;
    int rockets;


    public Military(int horsePower, int maxSpeed, int weight, String brand, int wingspan, int minRunaway, boolean catapult, int rockets) {
        super(horsePower, maxSpeed, weight, brand, wingspan, minRunaway);
        this.catapult = catapult;
        this.rockets = rockets;
    }


    @Override
    public String toString() {
        return super.toString() + "Military{" +
                "catapult=" + catapult +
                ", rockets=" + rockets +
                ", power=" + power + '}';
    }
}
