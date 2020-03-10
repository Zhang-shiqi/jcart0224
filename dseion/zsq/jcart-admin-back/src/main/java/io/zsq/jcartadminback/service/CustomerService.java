package io.zsq.jcartadminback.service;

import com.github.pagehelper.Page;
import io.zsq.jcartadminback.dto.in.CustomerSearchInDTO;
import io.zsq.jcartadminback.dto.in.CustomerSetStatusInDTO;
import io.zsq.jcartadminback.po.Customer;

public interface CustomerService {

    Page<Customer> search(CustomerSearchInDTO customerSearchInDTO, Integer pageNum);

    Customer getById(Integer customerId);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);

}
