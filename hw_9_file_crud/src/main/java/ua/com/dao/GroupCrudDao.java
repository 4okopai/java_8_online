package ua.com.dao;

import ua.com.entity.Group;

import java.util.Collection;

public interface GroupCrudDao<BE extends Group> {
    void create(BE be);
    void update(BE be);
    void delete(Long id);
    boolean existsById(Long id);
    Collection findAll();
}
