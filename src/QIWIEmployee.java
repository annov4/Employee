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
        if (okKpi()) {
            return (int) (8 * super.getBonus());
        } else {
            return 0;
        }
    }
}
