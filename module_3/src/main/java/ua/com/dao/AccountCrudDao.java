package ua.com.dao;

import ua.com.entity.Account;

import java.util.Collection;

public interface AccountCrudDao extends CrudDao<Account>{
    Collection<Account> findAll();
}