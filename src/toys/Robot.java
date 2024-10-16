package toys;

/**
 * The Robot class with its variables and methods.
 */
public class Robot extends BatteryPowered {
    /** The fly speed of Robot */
    public final static int FLY_SPEED = 25;
    /** The run speed of Robot */
    public final static int RUN_SPEED = 10;
    /** The initial speed of Robot */
    public final static int INITIAL_SPEED = 0;
    /** The product code of Robot */
    private static int productCode = 400;
    /** States if the Robot can fly */
    private boolean flying;
    /** The distance that the Robot has traveled */
    private int distance;

    /**
     * The constructor method for Robot which takes in
     * name, numBatteries, and flying. The product code is increased
     * by 1 and the distance is set to INITIAL_SPEED.
     * @param name The name of the Robot
     * @param numBatteries The number of batteries that the Robot has
     * @param flying States if the Robot can fly
     */
    protected Robot(String name, int numBatteries, boolean flying) {
        super(productCode, name, numBatteries);
        this.flying = flying;
        productCode++;
        distance = INITIAL_SPEED;
    }

    /**
     * The getter method of flying.
     * @return States if the Robot can fly
     */
    public boolean isFlying() {
        return flying;
    }

    /**
     * The getter method of distance
     * @return The distance that the Robot has traveled
     */
    public int getDistance() {
        return distance;
    }

    /**
     * Based on if the Robot can fly, it will increase the distance by
     * time multiplied by either FLY_SPEED or RUN_SPEED. It will then
     * print out a unique message which includes its name and distance
     * traveled. Wear will also increase by either FLY_SPEED or RUN_SPEED
     * and batteries is used by the time.
     * @param time The time that the Robot is played with
     */
    @Override
    protected void specialPlay(int time) {
        if (flying) {
            distance += time * FLY_SPEED;
            System.out.println("\t" + getName() + " is flying around with total distance: " + distance);
            increaseWear(FLY_SPEED);
        }
        else {
            distance += time * RUN_SPEED;
            System.out.println("\t" + getName() + " is running around with total distance: " + distance);
            increaseWear(RUN_SPEED);
        }
        useBatteries(time);
    }

    /**
     * Adds on to the string representation of the super objects with
     * Robot's flying and distance.
     * @return String representation of Robot object
     */
    @Override
    public String toString() {
        return super.toString() + ", Robot{F:" + flying + ", D:" + distance + "}";
    }
}
