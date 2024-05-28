package StreamAllMatch;

import java.util.Arrays;
import java.util.List;

public class AllMatchExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, 55000.0),
                new Employee(2, 75000.0),
                new Employee(3, 80000.0),
                new Employee(4, 60000.0),
                new Employee(5, 90000.0)
        );

        double salaryThreshold = 50000.0;

        boolean allEmployeesAboveThreshold = employees.stream()
                .allMatch(employee ->
                        employee.getSalary() > salaryThreshold);

        if (allEmployeesAboveThreshold) {
            System.out.println
                    ("All employees have salaries above the threshold.");
        } else {
            System.out.println
                    ("Not all employees have salaries above the threshold.");
        }
    }
}

