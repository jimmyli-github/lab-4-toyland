package toys;

/**
 * The BatteryPowered class with its variables and methods.
 */
public abstract class BatteryPowered extends Toy{
    /** The charge of a fully charged BatteryPowered Toy */
    public final static int FULLY_CHARGED = 100;
    /** The charge of a depleted BatteryPowered Toy */
    public final static int DEPLETED = 0;
    /** The number of batteries that the BatteryPowered Toy has */
    private int numBatteries;
    /** The current battery level of the BatteryPowered Toy */
    private int batteryLevel;

    /**
     * The constructor of a BatteryPowered Toy which takes
     * the productCode, name, and number of batteries.
     * The batteryLevel is set to FULLY_CHARGED.
     * @param productCode The product code of the BatteryPowered Toy.
     * @param name The name of the BatteryPowered Toy.
     * @param numBatteries The number of batteries that the BatteryPowered Toy has.
     */
    public BatteryPowered(int productCode, String name, int numBatteries) {
        super(productCode, name);
        this.numBatteries = numBatteries;
        batteryLevel = FULLY_CHARGED;
    }

    /**
     * The getter method for batteryLevel.
     * @return The battery level of the BatteryPowered Toy.
     */
    public int getBatteryLevel() {
        return batteryLevel;
    }

    /**
     * The getter method for the numBatteries.
     * @return The number of batteries that the BatteryPowered Toy has.
     */
    public int getNumBatteries() {
        return numBatteries;
    }

    /**
     * Uses the battery which lowers the battery level by the time + number of batteries.
     * If the battery level reaches depleted, 0, or lower, then battery level is set to 0.
     * It will print a message saying the toy is depleted and charge it back up to 100
     * with a following message, stating it is recharged.
     * @param time The time that the BatteryPowered Toy is played with.
     */
    public void useBatteries(int time) {
        batteryLevel -= time + numBatteries;
        if (batteryLevel <= DEPLETED) {
            batteryLevel = DEPLETED;
            System.out.println("\tDEPLETED:" + toString());
            batteryLevel = FULLY_CHARGED;
            System.out.println("\tRECHARGED:" + toString());
        }
    }

    /**
     * Adds on to the string representation of the super objects with
     * BatteryPowered's batteryLevel and numBatteries.
     * @return String representation of BatteryPowered object
     */
    @Override
    public String toString() {
        return super.toString() + ", BatteryPowered{BL:" + batteryLevel + ", NB:" + numBatteries + "}";
    }
}
