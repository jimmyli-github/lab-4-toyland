package toys;

/**
 * The Doll class with its variables and methods.
 */
public class Doll extends Toy {
    /** The product code of Doll */
    private static int productCode = 200;
    /** The hair color of Doll */
    private Color hairColor;
    /** The age of Doll */
    private int age;
    /** The catchphrase of doll */
    private String speak;

    /**
     * The constructor of Doll which takes in
     * name, hairColor, age, and speak.
     * The product code is increased by 1.
     * @param name The name of the Doll
     * @param hairColor The hair color of the Doll
     * @param age The age of the Doll
     * @param speak The catchphrase of the Doll
     */
    protected Doll(String name, Color hairColor, int age, String speak) {
        super(productCode, name);
        this.hairColor = hairColor;
        this.age = age;
        this.speak = speak;
        productCode++;
    }

    /**
     * The second constructor of Doll for ActionFigure which
     * takes in productCode, name, hairColor, age, and speak.
     * @param productCode The product code of the Doll
     * @param name The name of the Doll
     * @param hairColor The hair color of the Doll
     * @param age The age of the Doll
     * @param speak The catchphrase of the Doll
     */
    protected Doll(int productCode, String name, Color hairColor, int age, String speak) {
        super(productCode, name);
        this.hairColor = hairColor;
        this.age = age;
        this.speak = speak;
    }

    /**
     * The getter method for hairColor.
     * @return The hair color of the Doll
     */
    public Color getHairColor() {
        return hairColor;
    }

    /**
     * The getter method for age.
     * @return The age of the Doll
     */
    public int getAge() {
        return age;
    }

    /**
     * The getter method for speak.
     * @return The catchphrase of the Doll
     */
    public String getSpeak() {
        return speak;
    }

    /**
     * Prints out a unique message which includes the Doll's hair color and catchphrase.
     * After, the wear of the Doll is increased by age.
     * @param time The time that the ActionFigure is played with.
     */
    @Override
    protected void specialPlay(int time) {
        System.out.println("\t" + super.getName() + " brushes their " + hairColor + " hair and says, \"" + speak + "\"");
        increaseWear(age);
    }

    /**
     * Adds on to the string representation of the super objects with
     * Doll's hairColor, age, and speak.
     * @return String representation of Doll object
     */
    @Override
    public String toString() {
        return super.toString() + ", Doll{HC:" + hairColor + ", A:" + age + ", S:" + speak + "}";
    }
}
