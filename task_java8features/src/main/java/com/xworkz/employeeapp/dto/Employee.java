package com.xworkz.employeeapp.dto;


import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;
    private String bloodGroup;

}
