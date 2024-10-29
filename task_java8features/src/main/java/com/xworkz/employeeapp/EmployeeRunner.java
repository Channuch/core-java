package com.xworkz.employeeapp;

import com.xworkz.employeeapp.dto.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeRunner {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        Employee employee = new Employee(1,"Ramesh",10000.00,"clerk","O+ve");
        Employee employee1 = new Employee(2,"Mukesh",50000.00,"Manager","AB+ve");
        Employee employee2 = new Employee(3,"Suresh",80000.00,"HR","A-ve");
        Employee employee3 = new Employee(4,"Kamlesh",30000.00,"R&D","A+ve");
        Employee employee4 = new Employee(5,"Ramesh",25000.00,"Quality","A+ve");
        Employee employee5 = new Employee(6,"Ramesh",18000.00,"Production","B+ve");
        Employee employee6 = new Employee(7,"Rakesh",35000.00,"Audit","O+ve");
        Employee employee7 = new Employee(8,"Kalesh",29000.00,"SaleMan","O+ve");
        Employee employee8 = new Employee(9,"Sahntsh",30000.00,"Marketing","AB-ve");
        Employee employee9 = new Employee(10,"Bupesh",25000.00,"Finance","AB+ve");
        Employee employee10 = new Employee(11,"Lokesh",10000.00,"clerk","B-ve");
        Employee employee11 = new Employee(12,"Rajesh",18000.00,"Production","B+ve");
        Employee employee12 = new Employee(13,"Kamlesh",29000.00,"Sales","O-ve");

        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);
        list.add(employee6);
        list.add(employee7);
        list.add(employee8);
        list.add(employee9);
        list.add(employee10);
        list.add(employee11);
        list.add(employee12);

//          1.employee with second highest salary
//        System.out.println(list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst());

//        2.Employees whose salary is grater then 25000
//        System.out.println(list.stream().filter(salary-> salary.getSalary() > 25000).collect(Collectors.toList()));

//        3.Employes whose names start with B
//        System.out.println(list.stream().filter(ref -> ref.getName().startsWith("B")).collect(Collectors.toList()));

//        4.employee with duplicate names
//        System.out.println(list.stream().sorted(Comparator.comparing(Employee ::getName)).collect(Collectors.toList()));
//        System.out.println(list.stream().collect(Collectors.groupingBy(Employee::getName),Collectors.counting()));
        List<Employee> duplicateNameEmployees = list.stream()
                .collect(Collectors.groupingBy(Employee::getName))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() > 1)
                .map(Map.Entry::getKey)
                .map(name -> list.stream().filter(exm -> exm.getName().equals(name)).findFirst().orElse(null))
                .collect(Collectors.toList());

        System.out.println(duplicateNameEmployees);

      /*  for (Employee dto:list){
            System.out.println(dto);
        }*/




    }
}
