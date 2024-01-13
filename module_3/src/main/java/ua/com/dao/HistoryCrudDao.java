package ua.com.dao;

import ua.com.entity.History;
import ua.com.entity.Operation;

import java.util.Collection;

public interface HistoryCrudDao extends CrudDao<History>{
    public Collection<Operation> findAllNoPagination(Long id, String date1, String date2);
}