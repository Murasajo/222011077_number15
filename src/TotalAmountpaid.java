public class TotalAmountpaid {
    int P;
    int t;
    int n;
    double r;

    public TotalAmountpaid(int P, int t, int n, double r) {

        // Initializing the variables in Assign2
        this.P = P;
        this.t = t;
        this.n = n;
        this.r = r;
    }

    public double calculateTotalAmountPaid() {
        int totalCompoundingPeriods = t * n;
        double ratePerPeriod = r / n;

        // Calculate the total amount paid using the amount formula on compund interest
        double amountPaid = P * Math.pow(1 + ratePerPeriod, totalCompoundingPeriods); 
        return amountPaid;
    }

    public static void main(String[] args) {
        int principal = 500000;
        double annualRate = 0.18;
        int years = 3;
        int compoundingPeriodsPerYear = 12;

        // Create an instance of Assign2 with the provided values
        TotalAmountpaid myAmount = new TotalAmountpaid(principal, years, compoundingPeriodsPerYear, annualRate);
        double Amount = myAmount.calculateTotalAmountPaid(); //calling an instance/object to calculate total amount paid

        System.out.println("Mr.Bob will have paid " + Amount + " rwf, after 3 years");
    }
}
