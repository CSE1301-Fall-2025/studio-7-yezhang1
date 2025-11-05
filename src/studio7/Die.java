package studio7;

public class Die {
    // instance variables
    private int sides;

    //constructor
    public Die (int initside) {
        sides = initside;
    }

    //the number the die returned
    public int randomreturn() {
        return (int) (Math.random() * sides + 1);
    }

    //toString
    public String toString() {
        return "Sides = " + sides;
    }
    
    public static void main(String[] args) {
        Die d = new Die(6);

        System.out.println(d);
        System.out.println(d.randomreturn());
    }

}
