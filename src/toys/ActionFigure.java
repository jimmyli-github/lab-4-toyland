package toys;

/**
 * The ActionFigure class with its variables and methods.
 */
public class ActionFigure extends Doll {
    /** The minimum energy level of ActionFigure */
    public final static int MIN_ENERGY_LEVEL = 1;
    /** The hair color of ActionFigure */
    public final static Color HAIR_COLOR = Color.ORANGE;
    /** The product code of ActionFigure */
    private static int productCode = 500;
    /** The current energy level of ActionFigure */
    private int energyLevel;

    /**
     * The constructor for ActionFigure which takes in name, age, and speak.
     * The energyLevel is set to MIN_ENERGY_LEVEL and productCode is increased
     * by 1.
     * @param name The name of the ActionFigure
     * @param age The age of the ActionFigure
     * @param speak The catchphrase of the ActionFigure
     */
    protected ActionFigure(String name, int age, String speak) {
        super(productCode, name, HAIR_COLOR, age, speak);
        energyLevel = MIN_ENERGY_LEVEL;
        productCode++;
    }

    /**
     * The getter method for energyLevel.
     * @return The energy level of the Doll
     */
    public int getEnergyLevel() {
        return energyLevel;
    }

    /**
     * Prints out a unique message which includes the name of the ActionFigure and energyLevel.
     * It increases its energy level after and calls special play for Doll.
     * @param time The time that the ActionFigure is played with.
     */
    @Override
    protected void specialPlay(int time) {
        System.out.println("\t" + super.getName() + " kung foo chops with " + energyLevel * time + " energy!");
        energyLevel++;
        super.specialPlay(time);
    }

    /**
     * Adds on to the string representation of the super objects with
     * ActionFigure's energyLevel.
     * @return String representation of ActionFigure object
     */
    @Override
    public String toString() {
        return super.toString() + ", ActionFigure{E:" + energyLevel + "}";
    }
}