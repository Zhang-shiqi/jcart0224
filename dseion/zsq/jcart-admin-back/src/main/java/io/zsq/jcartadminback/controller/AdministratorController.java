package io.zsq.jcartadminback.controller;


import io.zsq.jcartadminback.dto.in.AdministratorLoginInDTO;
import io.zsq.jcartadminback.dto.in.AdministratorUpdateProfileInDTO;
import io.zsq.jcartadminback.dto.out.AdministratorGetProfileOutDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {


    @GetMapping("/login")
    public String login(AdministratorLoginInDTO administratorLoginInDTO){


        return  null;
    }

    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDto getProfile(Integer adminstratorId){

        return  null;

    }

    @GetMapping("/updateProdfile")
    public void updateProdfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){

    }

}
