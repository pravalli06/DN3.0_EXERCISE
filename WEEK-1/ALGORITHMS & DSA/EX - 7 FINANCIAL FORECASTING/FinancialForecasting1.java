public class FinancialForecasting1 {
   

        // Iterative method to calculate future value
        public static double calculateFutureValueIterative(double presentValue, double growthRate, int years) {
            double futureValue = presentValue;
            for (int i = 0; i < years; i++) {
                futureValue *= (1 + growthRate);
            }
            return futureValue;
        }
    
        public static void main(String[] args) {
            double presentValue = 1000.0;  // Present value
            double growthRate = 0.05;      // Growth rate (5%)
            int years = 10;                // Number of years
    
            double futureValueRecursive = calculateFutureValue(presentValue, growthRate, years);
            double futureValueIterative = calculateFutureValueIterative(presentValue, growthRate, years);
            
            System.out.println("Future Value (Recursive): " + futureValueRecursive);
            System.out.println("Future Value (Iterative): " + futureValueIterative);
        }
        
        // Recursive method to calculate future value
        public static double calculateFutureValue(double presentValue, double growthRate, int years) {
            if (years == 0) {
                return presentValue;
            }
            return calculateFutureValue(presentValue * (1 + growthRate), growthRate, years - 1);
        }
    }
    
    
