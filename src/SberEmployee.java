class SberEmployee extends Employee {
    private static final double SUCCESSFACTOR = 1.3;// коэффициент успешности банка
    double evaluationFactor; // коэффициент оценки
    @Override
    public String toString() {
        return "SberEmployee";
    }
    public SberEmployee(double evaluationFactor) {
        this.evaluationFactor = evaluationFactor;
    }

    @Override
    public int getBonus() {
        double averageProfit = calculateAverageProfit(getProfits());
        double bonus = averageProfit * SUCCESSFACTOR * evaluationFactor;
        return (int) bonus;
    }
}