package toys;

import java.lang.reflect.Type;

/**
 * The Kite class with its variables and methods.
 */
public class Kite extends Toy{
    /** The wear multiplier of Kite */
    public final static double WEAR_MULTIPLIER = 0.05;
    /** The product code of Kite */
    private static int productCode = 100;
    /** The color of Kite */
    private Color color;
    /** The type of Kite */
    private Type type;

    /** The types of Kite */
    public enum Type {
        CELLULAR,
        DELTA,
        DIAMOND,
        PARAFOIL,
        ROKKAKUS,
        SLED,
        STUNT;
    }

    /**
     * The constructor method for Kite which takes in
     * name, color and type. The product code is increased
     * by 1.
     * @param name The name of the Kite
     * @param color The color of the Kite
     * @param type The type of the Kite
     */
    protected Kite(String name, Color color, Type type) {
        super(productCode, name);
        this.type = type;
        this.color = color;
        productCode++;
    }

    /**
     * The getter method of Color.
     * @return The color of the Kite
     */
    public Color getColor() {
        return color;
    }

    /**
     * The getter method of Type.
     * @return The type of the Kite
     */
    public Type getType() {
        return type;
    }

    /**
     * Prints out a unique message which includes the name, type,
     * and color of the ActionFigure. The wear is then increased
     * by the wear multiplier multiplied by the time.
     * @param time The time that the Kite is played with.
     */
    @Override
    protected void specialPlay(int time) {
        System.out.println("\tFlying the " + color + ", " + type + " kite " + getName());
        increaseWear(WEAR_MULTIPLIER * time);
    }

    /**
     * Adds on to the string representation of the super objects with
     * Kite's color and type.
     * @return String representation of Kite object
     */
    @Override
    public String toString() {
        return super.toString() + ", Kite{C:" + color + ", T:" + type + "}";
    }
}
