package Quiz3;

class ImproperFractionException extends Exception{
    public ImproperFractionException(String msg){
        super(msg);
    }
}
class ZeroDenominatorException extends Exception{
    public ZeroDenominatorException(String msg){
        super(msg);
    }
}

public class ProperFraction {
    private  double numerator;
    private double denominator;

    public ProperFraction(double numerator, double denominator) throws ImproperFractionException,ZeroDenominatorException{
        this.numerator = numerator;
        this.denominator = denominator;
       if (this.numerator>=this.denominator && this.denominator==0 ){
            throw new ImproperFractionException("Your numerator can not be equal or greater than denominator" +
                    " And Denominator Cant be Zero");
        }
        else if(this.numerator>=this.denominator){
            throw new ImproperFractionException("Your numerator can not be equal or greater than denominator");
        }

    }

    public double getNumerator() {
        return numerator;
    }

    public double getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return "ProperFraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
