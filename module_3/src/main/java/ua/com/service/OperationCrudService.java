package ua.com.service;

import ua.com.entity.Operation;

import java.util.Collection;

public interface OperationCrudService extends CrudService<Operation>{
    Collection<Operation> findAll();
}
