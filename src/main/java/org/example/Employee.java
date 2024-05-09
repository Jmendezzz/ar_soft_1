package org.example;

import java.util.Optional;

public class Employee {
  private String name;
  private Integer age;
  private Double baseMonthlySalary;

  public Employee(String name, Integer age, Double baseSalary) {
    this.name = name;
    this.age = age;
    this.baseMonthlySalary = baseSalary;
  }
  public void calculateMonthlySalary(Optional<Double> bonus, Optional<Double> penalty){
    bonus.ifPresent(b -> baseMonthlySalary += b);
    penalty.ifPresent(p -> baseMonthlySalary -= p);

    System.out.println("Monthly Salary: " + baseMonthlySalary);

  }
  public void printEmployeeInfo() {
    System.out.println("Name: " + name + ", Age: " + age + ", Base Salary: " + baseMonthlySalary);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Double getBaseMonthlySalary() {
    return baseMonthlySalary;
  }

  public void setBaseMonthlySalary(Double baseMonthlySalary) {
    this.baseMonthlySalary = baseMonthlySalary;
  }

}
