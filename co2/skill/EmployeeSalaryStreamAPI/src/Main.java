import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = Arrays.asList(
	            new Employee(1, "Alice", 45000),
	            new Employee(2, "Bob", 55000),
	            new Employee(3, "Charlie", 60000),
	            new Employee(4, "David", 30000),
	            new Employee(5, "Eve", 70000),
	            new Employee(6, "Frank", 65000),
	            new Employee(7, "Grace", 72000),
	            new Employee(8, "Hannah", 50000),
	            new Employee(9, "Isaac", 40000),
	            new Employee(10, "Jack", 80000)
	        );
	        System.out.println("Employees with salary greater than 50,000:");
	        employees.stream()
	            .filter(e -> e.getSalary() > 50000)
	            .forEach(System.out::println);
	        System.out.println("\nEmployees sorted by salary:");
	        employees.stream()
	            .sorted(Comparator.comparingDouble(Employee::getSalary))
	            .forEach(System.out::println);
	        System.out.println("\nEmployee with the highest salary:");
	        Employee highestSalaryEmployee = employees.stream()
	            .max(Comparator.comparingDouble(Employee::getSalary))
	            .orElseThrow(() -> new IllegalStateException("No employees found"));
	        System.out.println(highestSalaryEmployee);
	        System.out.println("\nAverage salary of employees:");
	        DoubleSummaryStatistics stats = employees.stream()
	            .mapToDouble(Employee::getSalary)
	            .summaryStatistics();
	        System.out.println("Average Salary: " + stats.getAverage());
	   
	}
}
