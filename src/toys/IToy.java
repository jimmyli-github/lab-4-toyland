package toys;

/**
 * The IToy interface with its methods.
 */
public interface IToy {
    /** The getter method for productCode */
    public int getProductCode();
    /** The getter method for name */
    public String getName();
    /** The getter method for happiness */
    public int getHappiness();
    /** The getter method for retired */
    public boolean isRetired();
    /** The getter method for wear */
    public double getWear();
    /** Increases the wear by a specific amount */
    public void increaseWear(double amount);
    /** Plays the toy for a specific amount of time */
    public void play(int time);
}
