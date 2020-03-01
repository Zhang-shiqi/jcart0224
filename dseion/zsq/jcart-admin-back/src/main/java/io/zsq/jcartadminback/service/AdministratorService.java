package io.zsq.jcartadminback.service;

import io.zsq.jcartadminback.po.Administrator;

public interface AdministratorService {

    Administrator getById(Integer administratorId);

    Administrator getByUsername(String username);

    void update(Administrator administrator);

}
