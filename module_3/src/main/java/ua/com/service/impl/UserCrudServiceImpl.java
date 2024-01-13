package ua.com.service.impl;

import ua.com.dao.UserCrudDao;
import ua.com.dao.impl.UserCrudDaoImpl;
import ua.com.entity.User;
import ua.com.service.UserCrudService;

import java.util.Optional;

public class UserCrudServiceImpl implements UserCrudService {
    UserCrudDao userCrudDao = new UserCrudDaoImpl();

    @Override
    public void create(User user) {
        userCrudDao.create(user);
    }

    @Override
    public void update(User user) {
        userCrudDao.update(user);
    }

    @Override
    public void delete(String id) {
        userCrudDao.delete(Long.valueOf(id));
    }

    @Override
    public Optional<User> findOne(String id) {
        return userCrudDao.findById(Long.valueOf(id));
    }
}
