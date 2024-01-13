package ua.com.service;

import ua.com.entity.BaseEntity;

import java.util.Optional;

public interface CrudService<BE extends BaseEntity> {
    void create(BE be);
    void update(BE be);
    void delete(String id);
    Optional<BE> findOne(String id);
}
