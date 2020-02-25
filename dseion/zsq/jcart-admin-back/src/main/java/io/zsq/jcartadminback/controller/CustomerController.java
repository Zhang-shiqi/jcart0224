package io.zsq.jcartadminback.controller;

import io.zsq.jcartadminback.dto.in.CustomerSearchInDTO;
import io.zsq.jcartadminback.dto.out.CustomerListOutDTO;
import io.zsq.jcartadminback.dto.out.CustomerShowOutDTO;
import io.zsq.jcartadminback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CustomerController {

    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO>  search(CustomerSearchInDTO customerSearchInDTO, @RequestParam Integer pageNum){

        return null;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customer){

        return null;
    }

    @PostMapping("/disable")
    public void disable(@RequestParam Integer customerId){

    }
}
