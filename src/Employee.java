public class Employee {
    int[] profits;

    public int getBonus() {
        return 0;
    }

    public int[] getProfits() {
        return profits;
    }

    public static double calculateAverageProfit(int[] profits) {
        double averageProfit = 0;
        for (int i = 0; i < profits.length; i++) {
            averageProfit += profits[i];
        }
        return averageProfit / profits.length;
    }
}