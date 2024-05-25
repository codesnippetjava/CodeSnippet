package groupingby;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByDemo {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 3000),
                new Employee("Bob", "IT", 4000),
                new Employee("Charlie", "HR", 3500),
                new Employee("Dave", "IT", 4500),
                new Employee("Eve", "Finance", 5000)
        );

        // Group employees by department
        Map<String, List<Employee>> employeesByDepartment =
                employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        // Print the grouped employees
        employeesByDepartment.forEach((department, employeeList) -> {
            System.out.println("Department: " + department);
            employeeList.forEach(System.out::println);
        });
    }
}
