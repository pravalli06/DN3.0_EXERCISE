public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        // Base case: if no years left, return the present value
        if (years == 0) {
            return presentValue;
        }
        // Recursive case: calculate the value for the next year
        return calculateFutureValue(presentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double presentValue = 1000.0;  // Present value
        double growthRate = 0.05;      // Growth rate (5%)
        int years = 10;                // Number of years

        double futureValue = calculateFutureValue(presentValue, growthRate, years);
        System.out.println("Future Value: " + futureValue);
    }
}