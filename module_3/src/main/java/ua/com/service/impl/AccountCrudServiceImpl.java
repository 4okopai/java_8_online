package ua.com.service.impl;

import ua.com.dao.AccountCrudDao;
import ua.com.dao.impl.AccountCrudDaoImpl;
import ua.com.entity.Account;
import ua.com.service.AccountCrudService;

import java.util.Collection;
import java.util.Optional;

public class AccountCrudServiceImpl implements AccountCrudService {
    AccountCrudDao accountCrudDao = new AccountCrudDaoImpl();

    @Override
    public void create(Account account) {
        accountCrudDao.create(account);
    }

    @Override
    public void update(Account account) {
        accountCrudDao.update(account);
    }

    @Override
    public void delete(String id) {
        accountCrudDao.delete(Long.valueOf(id));
    }

    @Override
    public Optional<Account> findOne(String id) {
        return accountCrudDao.findById(Long.valueOf(id));
    }

    @Override
    public Collection<Account> findAll() {
        return accountCrudDao.findAll();
    }
}
