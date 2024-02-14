import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new SberEmployee(2.0);
        employees[1] = new EpamEmployee();
        employees[2] = new QIWIEmployee(true);

        int[][] employeeProfits = {
                {100000, 200000, 300000, 75000},
                {5000, 4000, 5000},
                {200000, 145000, 180000}
        };
        for (int i = 0; i < employees.length; i++) {
            employees[i].profits = employeeProfits[i];

            int[] profits = employees[i].getProfits();
            int bonus = employees[i].getBonus();

            System.out.println(printEmployees((employees[i])) + ":");
            System.out.println("Зарплата: " + arrayToString(profits));
            System.out.println("Бонус: " + bonus + "\n");
        }
    }

    public static String printEmployees(Employee employee) {
        return employee.toString();
    }

    public static String arrayToString(int[] array) {
        StringBuilder p = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            p.append(array[i]);
            if (i != (array.length - 1)) {
                p.append(", ");
            }
        }
        return p.toString();
    }
}


