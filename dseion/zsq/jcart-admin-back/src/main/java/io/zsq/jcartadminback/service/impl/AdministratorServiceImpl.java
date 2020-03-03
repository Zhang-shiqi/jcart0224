package io.zsq.jcartadminback.service.impl;

import com.github.pagehelper.Page;
import io.zsq.jcartadminback.dao.AdministratorMapper;
import io.zsq.jcartadminback.po.Administrator;
import io.zsq.jcartadminback.service.AdministratorService;
import io.zsq.jcartadminback.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorServiceImpl implements AdministratorService {

    @Autowired
    private AdministratorMapper administratorMapper;

    @Override
    public Administrator getById(Integer administratorId) {
        Administrator administrator = administratorMapper.selectByPrimaryKey(administratorId);
        return administrator;
    }

    @Override
    public Administrator getByUsername(String username) {
        Administrator administrator = administratorMapper.selectByUsername(username);
        return administrator;
    }

    @Override
    public Integer create(Administrator administrator) {
        return null;
    }

    @Override
    public void update(Administrator administrator) {
        administratorMapper.updateByPrimaryKeySelective(administrator);
    }

    @Override
    public void delete(Integer administratorId) {

    }

    @Override
    public void batchDelete(List<Integer> administratorIds) {

    }

    @Override
    public Page<Administrator> getList(Integer pageNum) {
        return null;
    }
}
