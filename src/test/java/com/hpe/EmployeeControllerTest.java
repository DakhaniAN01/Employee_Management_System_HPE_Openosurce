package com.hpe;

import com.hpe.Controller.EmployeeController;
import com.hpe.Model.Employee;
import com.hpe.Model.Employees;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class EmployeeControllerTest {
     @Mock
    private EmployeeManager employeeManager;

    @InjectMocks
    private EmployeeController employeeController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllEmployees() {
        Employees employees = new Employees();
        employees.getEmployeeList().add(new Employee(101, "Gautam", "Patil", "patil.g01@gmail.com", "Software Engineer"));

        when(employeeManager.getEmployees()).thenReturn(employees);

        Employees result = employeeController.getAllEmployees();

        assertEquals(1, result.getEmployeeList().size());
        assertEquals("Gautam", result.getEmployeeList().get(0).getFirstName());
    }

    @Test
    public void testAddEmployee() {
        Employee newEmployee = new Employee(105, "Aditya", "Shinde", "aditya.shinde@gmail.com", "DevOps Engineer");
        Employees employees = new Employees();

        when(employeeManager.getEmployees()).thenReturn(employees);

        ResponseEntity<String> response = employeeController.addEmployee(newEmployee);

        assertEquals("Employee added successfully", response.getBody());
        assertEquals(1, employees.getEmployeeList().size());
        assertEquals("Aditya", employees.getEmployeeList().get(0).getFirstName());
    }

    
}
