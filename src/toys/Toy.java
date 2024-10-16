package toys;

/**
 * The Toy class with its variables and methods.
 */
public abstract class Toy implements IToy{
    /** The initial happiness of Toy */
    public final static int INITIAL_HAPPINESS = 0;
    /** The max happiness of Toy */
    public final static int MAX_HAPPINESS = 100;
    /** The initial wear of Toy */
    public final static double INITIAL_WEAR = 0.0;
    /** The product code of Toy */
    private int productCode;
    /** The name of Toy */
    private String name;
    /** The happiness of Toy */
    private int happiness;
    /** The wear of Toy */
    private double wear;

    /**
     * The constructor method for Toy which takes in
     * productCode and name. The happiness is set to
     * INITIAL_HAPPINESS and the wear is set to
     * INITIAL_WEAR.
     * @param productCode The product code of Toy
     * @param name The name of Toy
     */
    protected Toy(int productCode, String name) {
        this.productCode = productCode;
        this.name = name;
        happiness = INITIAL_HAPPINESS;
        wear = INITIAL_WEAR;
    }

    /**
     * The getter method of productCode
     * @return The product code of Toy
     */
    public int getProductCode() {
        return productCode;
    }

    /**
     * The getter method of name
     * @return The name of Toy
     */
    public String getName() {
        return name;
    }

    /**
     * The getter method of happiness
     * @return The happiness of Toy
     */
    public int getHappiness() {
        return happiness;
    }

    /**
     * Determines if Toy is retired. If happiness is
     * greater than MAX_HAPPINESS, then it returns true.
     * Otherwise, it returns false.
     * @return True or false on whether Toy is retired
     */
    public boolean isRetired() {
        return happiness > MAX_HAPPINESS;
    }

    /**
     * The getter method for wear.
     * @return The wear of Toy
     */
    public double getWear() {
        return wear;
    }

    /**
     * Increases the wear by a specific amount.
     * @param amount The amount to increase wear by
     */
    public void increaseWear(double amount) {
        wear += amount;
    }

    /**
     * States a unique message on how long the toy has been
     * played with and an object representation of itself.
     * The method specialPlay is then called with time
     * and happiness is increased with time. If the Toy
     * is retired, it will print a message stating so.
     * @param time The time that the Toy was played with
     */
    public void play(int time) {
        System.out.println("PLAYING(" + time + "): " + this);
        specialPlay(time);
        happiness += time;
        if (isRetired()) {
            System.out.println("RETIRED: "+ this);
        }
    }

    /**
     * Abstract method for specialPlay
     * @param minutes The amount of minutes the Toy was played with
     */
    protected abstract void specialPlay(int minutes);

    /**
     * A string representation of the Toy which includes
     * the productCode, name, happiness, isRetired, and wear.
     * @return String representation of Toy object
     */
    @Override
    public String toString() {
        return "Toy{PC:" + productCode + ", N:" + name + ", H:" + happiness + ", R:" + isRetired() + ", W:" + wear + "}";
    }
}
