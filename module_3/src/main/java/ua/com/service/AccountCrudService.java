package ua.com.service;

import ua.com.entity.Account;

import java.util.Collection;

public interface AccountCrudService extends CrudService<Account>{
    Collection<Account> findAll();
}
