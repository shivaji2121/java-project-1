package com.Streams;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String department;
    int salary;
    List<String> skills;

    public Employee(int id, String name, String department, int salary, List<String> skills) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.skills = skills;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", skills=" + skills +
                '}';
    }
}

public class StreamsP1 {
    static void main(String[] args) {

        List<Employee> employeesList = List.of(
                new Employee(1, "Amit", "IT", 60000, List.of("Java", "Spring")),
                new Employee(2, "Ravi", "HR", 40000, List.of("Communication")),
                new Employee(3, "Neha", "IT", 80000, List.of("Java", "AWS")),
                new Employee(4, "Priya", "Finance", 70000, List.of("Excel", "Accounting")),
                new Employee(5, "Arun", "IT", 50000, List.of("Python", "AWS"))
        );

        List<String> skills = employeesList.stream()
                .flatMap(e->e.getSkills().stream())
                .distinct().toList();
        System.out.println(skills);

        List<String> names=employeesList.stream()
                .filter(e->e.getSalary()>60000)
                .map(e->e.getName())
                .toList();
        System.out.println(names);

    int totalsal=employeesList.stream()
            .map(Employee::getSalary)
            .reduce(0,Integer::sum);
        System.out.println(totalsal);

        System.out.println("-----------");
        Map<String,List<Employee>> dept=employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(dept);

        System.out.println("------------");
       Map<String,Long> list= employeesList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));
        System.out.println(list);

        System.out.println("--------------");
        Map<String, Optional<Employee>> highestPaid =
               employeesList.stream()
                               .collect(Collectors.groupingBy(
                                       Employee::getDepartment,
                                       Collectors.maxBy(
                                               Comparator.comparingInt(Employee::getSalary)
                                       ))
                               );
        System.out.println(highestPaid);

        System.out.println("---------------------");
        Map<Boolean,List<Employee>> emp=employeesList.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getSalary()>60000));
        System.out.println(emp);
    }
}


