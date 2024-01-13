package ua.com.service.impl;

import ua.com.dao.OperationCrudDao;
import ua.com.dao.impl.OperationCrudDaoImpl;
import ua.com.entity.Operation;
import ua.com.service.OperationCrudService;

import java.util.Collection;
import java.util.Optional;

public class OperationCrudServiceImpl implements OperationCrudService {
    OperationCrudDao operationCrudDao = new OperationCrudDaoImpl();

    @Override
    public void create(Operation operation) {
        operationCrudDao.create(operation);
    }

    @Override
    public void update(Operation operation) {
        operationCrudDao.update(operation);
    }

    @Override
    public void delete(String id) {
        operationCrudDao.delete(Long.valueOf(id));
    }

    @Override
    public Optional<Operation> findOne(String id) {
        return operationCrudDao.findById(Long.valueOf(id));
    }

    @Override
    public Collection<Operation> findAll() {
        return null;
    }
}
