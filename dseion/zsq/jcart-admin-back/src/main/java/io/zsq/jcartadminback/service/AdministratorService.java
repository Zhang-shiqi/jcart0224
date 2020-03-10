package io.zsq.jcartadminback.service;

import com.github.pagehelper.Page;
import io.zsq.jcartadminback.po.Administrator;

import java.util.List;

public interface AdministratorService {

    Administrator getById(Integer administratorId);

    Administrator getByUsername(String username);

    Administrator getByEmail(String email);

    Integer create(Administrator administrator);

    void update(Administrator administrator);

    void delete(Integer administratorId);

    void batchDelete(List<Integer> administratorIds);

    Page<Administrator> getList(Integer pageNum);

}
