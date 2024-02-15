import java.util.Arrays;

public class Employee {
    int[] profits;

    public int getBonus() {
        double averageProfit = 0;
        for (int i = 0; i < profits.length; i++) {
            averageProfit += profits[i];
        }
        return (int) (averageProfit / profits.length);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + Arrays.toString(profits) + "\n" +
                "Bonus: " + getBonus() + "\n";
    }
}
