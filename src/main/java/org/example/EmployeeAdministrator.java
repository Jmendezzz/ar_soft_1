package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class EmployeeAdministrator {
  private final List<Employee> employees;
  private final Scanner scanner;

  public EmployeeAdministrator() {
    this.employees = new ArrayList<>();
    this.scanner = new Scanner(System.in);
  }

  public void addEmployee(Employee employee) {
    this.employees.add(employee);
  }

  public void calculateMonthlySalaries() {
     employees.forEach(employee -> {
      System.out.println("Enter bonus for employee " + employee.getName());
      Double bonus = scanner.nextDouble();
      System.out.println("Enter penalty for employee " + employee.getName());
      Double penalty = scanner.nextDouble();
      employee.calculateMonthlySalary(Optional.of(bonus), Optional.of(penalty));
     });
  }

  public void printEmployeesInfo() {
    employees.forEach(Employee::printEmployeeInfo);
  }
}
