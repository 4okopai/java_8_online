package ua.com.dao;

import ua.com.entity.Employee;

import java.util.Collection;

public interface EmployeeDao extends CrudDao<Employee>{
    Collection<Employee> findAllByDepartment(Long depId);
    Collection<Employee> findAllNoPagination();
}
