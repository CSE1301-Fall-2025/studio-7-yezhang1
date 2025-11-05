package studio7;

public class Fraction {
    //instance variable
    private int numerator;
    private int denominator;

    public Fraction (int numer, int denom) {
        numerator = numer;
        denominator = denom;
    }

    public String reciprocal() {
        return denominator + "/" + numerator;
    }
    
    public Fraction sum(Fraction other) {
        int newNumer = this.numerator * other.denominator + 
                       other.numerator * this.denominator;
        int newDenom = this.denominator * other.denominator;
        return new Fraction(newNumer, newDenom);
    }


    public Fraction product(Fraction other) {
        int newNumer = this.numerator * other.numerator;
        int newDenom = this.denominator * other.denominator;
        return new Fraction(newNumer, newDenom);
    }


    public String toString(){
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        Fraction f = new Fraction(2, 5);
        Fraction f2 = new Fraction(4,5);
        System.out.println(f);
        System.out.println(f.reciprocal());
    }
}
