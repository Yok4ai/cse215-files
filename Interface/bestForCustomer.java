package Interface;

public class bestForCustomer implements discountable {
    private double percentage;
    private double threshold;

    public bestForCustomer(double percentage, double threshold) {
        this.percentage = percentage;
        this.threshold = threshold;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }


    @Override
    public double discountedPrice(double price) {
        double newPrice = price - price * (percentage / 100);
        if (newPrice < threshold) {
            return newPrice;
        } else return price-threshold;
    }
}
