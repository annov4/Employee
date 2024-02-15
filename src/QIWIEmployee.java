import java.util.Arrays;

class QIWIEmployee extends Employee {
    private boolean kpi;

    public QIWIEmployee(boolean kpi) {
        this.kpi = kpi;
    }

    public boolean okKpi() {
        return kpi;
    }

    @Override
    public int getBonus() {
        if (okKpi()) {
            return (8 * super.getBonus());
        } else {
            return 0;
        }
    }
}
