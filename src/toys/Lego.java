package toys;

/**
 * The Lego class with its variables and methods.
 */
public class Lego extends Toy {
    /** The amount of starting pieces for Lego */
    public final static int STARTING_PIECES = 1;
    /** The product code for Lego */
    private static int productCode = 600;
    /** The current amount of pieces for Lego */
    private int currentPieces;
    /** The total amount of pieces for Lego */
    private int totalPieces;

    /**
     * The constructor method for Lego which takes in
     * name and totalPieces. The currentPieces is set
     * to STARTING_PIECES and the product code is
     * increased by 1.
     * @param name The name of the Lego
     * @param totalPieces The total amount of pieces for Lego
     */
    public Lego(String name, int totalPieces) {
        super(productCode, name);
        currentPieces = STARTING_PIECES;
        this.totalPieces = totalPieces;
        productCode++;
    }

    /**
     * The getter method for currentPieces.
     * @return The current amount of pieces for Lego
     */
    public int getCurrentPieces() {
        return currentPieces;
    }

    /**
     * The getter method for totalPieces.
     * @return The total amount of pieces for Lego
     */
    public int getTotalPieces() {
        return totalPieces;
    }

    /**
     * The amount of current pieces increases with time. It prints out a
     * unique message which includes the name, currentPieces, and
     * totalPieces of the Lego. The wear is then increased by time.
     * @param time The amount of minutes the Toy was played with
     */
    @Override
    protected void specialPlay(int time) {
        currentPieces += time;
        if (currentPieces < totalPieces) {
            System.out.println("\t" + super.getName() + " is being built with " + currentPieces + " out of " + totalPieces + " pieces completed.");
            increaseWear(time);
        }
        else {
            currentPieces = totalPieces;
            System.out.println("\t" + super.getName() + " is completed with a total of " + totalPieces + " pieces.");
        }
    }

    /**
     * Adds on to the string representation of the super objects with
     * Lego's current pieces.
     * @return String representation of Lego object
     */
    @Override
    public String toString() {
        return super.toString() + ", Lego{P:" + currentPieces + "}";
    }
}
