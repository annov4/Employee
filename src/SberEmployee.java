import java.util.Arrays;

class SberEmployee extends Employee {
    private static final double SUCCESSFACTOR = 1.3;// коэффициент успешности банка
    double evaluationFactor; // коэффициент оценки

    public SberEmployee(double evaluationFactor) {
        this.evaluationFactor = evaluationFactor;
    }

    @Override
    public int getBonus() {
        double bonus = super.getBonus() * SUCCESSFACTOR * evaluationFactor;
        return (int) bonus;
    }
}