package toys;

/**
 * The RCBoat class with its variables and methods.
 */
public class RCBoat extends BatteryPowered {
    /** The starting speed of RCBoat */
    public final static int STARTING_SPEED = 10;
    /** The speed increase of RCBoat */
    public final static int SPEED_INCREASE = 5;
    /** The product code of RCBoat */
    private static int productCode = 300;
    /** The speed of RCBoat */
    private int speed;

    /**
     * The constructor method for RCBoat which takes in
     * name and numBatteries. The product code is increased
     * by 1.
     * @param name The name of the RCBoat
     * @param numBatteries The number of batteries that the RCBoat has
     */
    protected RCBoat(String name, int numBatteries) {
        super(productCode, name, numBatteries);
        speed = STARTING_SPEED;
        productCode++;
    }

    /**
     * The getter method for speed.
     * @return The speed of the RCBoat
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Prints out a unique message which includes the name and speed
     * for RCBoat. The batteries are used by the amount of minutes and
     * the wear is increased by speed. Speed is then increased by
     * SPEED_INCREASE.
     * @param minutes The amount of minutes that the RCBoat is played with
     */
    @Override
    protected void specialPlay(int minutes) {
        System.out.println("\t" + getName() + " races around at " + speed + " knots!");
        useBatteries(minutes);
        increaseWear(speed);
        speed += SPEED_INCREASE;
    }

    /**
     * Adds on to the string representation of the super objects with
     * RCBoat's speed.
     * @return String representation of RCBoat object
     */
    @Override
    public String toString() {
        return super.toString() + ", RCBoat{S:" + speed + "}";
    }
}
