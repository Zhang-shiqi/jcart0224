package io.zsq.jcartadminback.service;


import io.zsq.jcartadminback.po.Address;

import java.util.List;

public interface AddressService {

    Address getById(Integer addressId);

    List<Address> getByCustomerId(Integer customerId);

}
