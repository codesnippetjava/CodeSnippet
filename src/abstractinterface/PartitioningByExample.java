package abstractinterface;

import groupingby.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 30000),
                new Employee("Bob", "IT", 40000),
                new Employee("Charlie", "HR", 35000),
                new Employee("Dave", "IT", 65000),
                new Employee("Eve", "Finance", 80000)
        );

        // Partition numbers into even and odd
        Map<Boolean, List<Employee>> partitionedBySalary =
                employees.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getSalary()>50000));

        System.out.println("Employees with salary > 50000:");
        partitionedBySalary.get(true).forEach(System.out::println);

        System.out.println("\nEmployees with salary <= 50000:");
        partitionedBySalary.get(false).forEach(System.out::println);
    }
}



