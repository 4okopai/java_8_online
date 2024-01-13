package ua.com.dao;

import ua.com.dto.DepartmentStatistics;
import ua.com.entity.Department;

import java.util.Collection;

public interface DepartmentDao extends CrudDao<Department>{
    void attachEmployeeToDepartment(Long depId, Long empId);
    Collection<DepartmentStatistics> findDepartmentStatistics();
    Collection<Department> findAllNoPagination();
}
