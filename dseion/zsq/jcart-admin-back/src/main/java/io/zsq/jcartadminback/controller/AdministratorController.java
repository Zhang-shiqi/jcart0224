package io.zsq.jcartadminback.controller;


import io.zsq.jcartadminback.dto.in.*;
import io.zsq.jcartadminback.dto.out.AdministratorGetProfileOutDto;
import io.zsq.jcartadminback.dto.out.AdministratorListOutDTO;
import io.zsq.jcartadminback.dto.out.AdministratorShowOutDTO;
import io.zsq.jcartadminback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/getPwdResetCode")
    public String  getPwdResetCode(@RequestParam String email){
        return null;
    }
    @PostMapping("/resetPwd")
    public void resetPwd(@RequestBody AdministratorResetPwdInDTO administratorResetPwdInDTO){

    }

    @GetMapping("/getList")
    public PageOutDTO<AdministratorListOutDTO> getList(@RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public AdministratorShowOutDTO getById(@RequestParam Integer administratorId){
        return  null;
    }
    @PostMapping("/create")
    public Integer create(@RequestBody AdministratorCreateInDTO administratorCreateInDTO){
        return null;

    }

    @PostMapping("/update")
    public Integer update(@RequestBody AdministratorUpdateInDTO dministratorUpdateInDTO){
        return null;
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer administratorId){

    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> administratorIds){

    }

}
