package io.zsq.jcartadminback.controller;


import io.zsq.jcartadminback.dto.in.ReturnSearchInDTO;
import io.zsq.jcartadminback.dto.in.ReturnUpdateActionInDTO;
import io.zsq.jcartadminback.dto.out.PageOutDTO;
import io.zsq.jcartadminback.dto.out.ReturnListOutDTO;
import io.zsq.jcartadminback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO,
                                               @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }

}
