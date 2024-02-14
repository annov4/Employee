class QIWIEmployee extends Employee {
    private boolean kpi;

    public QIWIEmployee(boolean kpi) {
        this.kpi = kpi;
    }
    @Override
    public String toString() {
        return "QIWIEmployee";
    }

    public boolean okKpi() {
        return kpi;
    }

    @Override
    public int getBonus() {
        double averageProfit = calculateAverageProfit(getProfits());
        if (okKpi()) {
            return (int) (8 * averageProfit);
        } else {
            return 0;
        }
    }
}
