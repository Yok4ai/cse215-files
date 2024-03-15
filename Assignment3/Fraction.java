package Assignment3;


public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        normalize();
    }
    private void normalize(){
        int gcd = 1;
        int smallest;
        smallest = Math.min(this.denominator,this.numerator);

        for(int i=1; i<=smallest; i++){
            if(this.numerator%i==0 && this.denominator%i==0){
                gcd = i;
            }
        }
        this.numerator = this.numerator/gcd;
        this.denominator = this.denominator/gcd;
    }
    public int getNumerator(){
        return numerator;
    }
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    public void setDenominator (int denominator){
        this.denominator = denominator;
    }

    public Fraction add(Fraction second) {
        int newDenominator = this.denominator * second.denominator;

        int newNumerator = (newDenominator/this.denominator)*this.numerator+
                            (newDenominator/second.denominator)*second.numerator;

        Fraction result = new Fraction(newNumerator,newDenominator);
                return result;
    }
    public Fraction sub(Fraction second) {
        int newDenominator = this.denominator * second.denominator;

        int newNumerator = (newDenominator/this.denominator)*this.numerator-
                (newDenominator/second.denominator)*second.numerator;

        Fraction result = new Fraction(newNumerator,newDenominator);
        return result;
    }
    public Fraction multiplication(Fraction second){
        int newDenominator = this.denominator * second.denominator;
        int newNumerator = this.numerator * second.numerator;

        Fraction result = new Fraction(newNumerator,newDenominator);
        return result;
    }
    public Fraction division(Fraction second){
        int newDenominator = this.denominator * second.numerator;
        int newNumerator = this.numerator * second.denominator;

        Fraction result = new Fraction(newNumerator,newDenominator);
        return result;
    }

    public String toString(){

        return this.numerator + "/" + this.denominator;
    }
}
