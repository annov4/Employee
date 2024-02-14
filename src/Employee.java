public class Employee {
    int[] profits;

    public int getBonus() {
        double averageProfit = 0;
        for (int i = 0; i < profits.length; i++) {
            averageProfit += profits[i];
        }
        return (int) (averageProfit / profits.length);
    }
    public int[] getProfits() {
        return profits;
    }

}