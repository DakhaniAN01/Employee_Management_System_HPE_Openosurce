package com.hpe;
public class EmployeeManager {
    private Employees employees;

    public EmployeeManager() {
        employees = new Employees();
        initializeEmployees();
    }

    private void initializeEmployees() {
        /*employees.getEmployeeList().add(new Employee(101, "Gautam", "Patil", "patil.g01@gmail.com", "Software Engineer"));
        employees.getEmployeeList().add(new Employee(102, "Alisha", "Smith", "alisha.smith@hotmail.com", "Project Manager"));
        employees.getEmployeeList().add(new Employee(103, "Kim", "Son", "sonkim99@yahoo.com", "HR Specialist"));
        employees.getEmployeeList().add(new Employee(104, "Zahira", "Sheikh", "shieh.zahira@outlook.com", "Marketing Manager"));*/
    }

    public Employees getEmployees() {
        return employees;
    }
}
