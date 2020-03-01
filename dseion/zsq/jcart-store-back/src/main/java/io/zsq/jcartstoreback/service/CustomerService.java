package io.zsq.jcartstoreback.service;


import io.zsq.jcartstoreback.dto.in.CustomerRegisterInDTO;
import io.zsq.jcartstoreback.po.Customer;

public interface CustomerService {

    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);

    Customer getById(Integer customerId);

    void update(Customer customer);

}
