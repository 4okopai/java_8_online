package ua.com.Service.Impl;

import ua.com.DB.EmployeeDb;
import ua.com.Ent.Department;
import ua.com.Ent.Employee;
import ua.com.Service.EmployeeCrudService;

import java.io.IOException;

public class EmployeeCrudServiceImpl implements EmployeeCrudService {
    EmployeeDb employeeDb = new EmployeeDb();

    @Override
    public void create(Employee employee) {
        employeeDb.create(employee);
    }

    @Override
    public Employee update(Employee employee) throws IOException {
        return null;
    }

    @Override
    public Department[] delete(String id) throws IOException {
        return new Department[0];
    }

    @Override
    public Employee findOne(String id) throws IOException {
        return null;
    }

    @Override
    public Employee[] findAll() {
        return employeeDb.findAll();
    }
}
