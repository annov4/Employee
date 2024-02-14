class EpamEmployee extends Employee {
    @Override
    public String toString() {
        return "EpamEmployee";
    }
    @Override
    public int getBonus() {

        double bonus = calculateAverageProfit(getProfits());
        return (int) bonus;
    }
}