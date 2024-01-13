package ua.com.dao;

import ua.com.entity.Operation;

import java.util.Collection;

public interface OperationCrudDao extends CrudDao<Operation>{
    Collection<Operation> findAll();
}