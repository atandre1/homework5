public class Military extends Air {
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

    public void fire() {
        for (int a = 0; a < rockets; a++) {
            System.out.println("The rocket is fired!");
        }
        rockets = 0;
        System.out.println("Out of ammo!");
        System.out.println();

    }

    public void catapultGo() {
        if (catapult == true) System.out.println("The ejection was successful!");
        else System.out.println("You don't have catapult system!");
    }
}
