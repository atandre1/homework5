public class Air extends Transport {
    private int wingspan;
    private int minRunaway;

    public Air() {
    }

    public Air(int horsePower, int maxSpeed, int weight, String brand, int wingspan, int minRunaway) {
        super(horsePower, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minRunaway = minRunaway;
    }

    public int getWingspan() {
        return wingspan;
    }

    public int getMinRunaway() {
        return minRunaway;
    }

    @Override
    public String toString() {
        return super.toString() + "Air{" +
                "wingspan=" + wingspan +
                ", minRunaway=" + minRunaway +
                ", power=" + power + '}';
    }

}
