package io.zsq.jcartadminback.controller;


import com.github.pagehelper.Page;
import io.zsq.jcartadminback.dto.in.ProductCreateInDTO;
import io.zsq.jcartadminback.dto.in.ProductSearchInDTO;
import io.zsq.jcartadminback.dto.in.ProductUpdateInDTO;
import io.zsq.jcartadminback.dto.out.PageOutDTO;
import io.zsq.jcartadminback.dto.out.ProductListOutDTO;
import io.zsq.jcartadminback.dto.out.ProductShowOutDTO;
import io.zsq.jcartadminback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;
    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,

                                                @RequestParam Integer pageNum){
        Page<ProductListOutDTO> page = productService.search(pageNum);

        PageOutDTO<ProductListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(page);

        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){

        ProductShowOutDTO productShowOutDTO = productService.getById(productId);


        return productShowOutDTO;
    }


    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        Integer productId = productService.create(productCreateInDTO);
        return productId;
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){
        productService.update(productUpdateInDTO);

    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer productId){

    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> productIds){

    }

}
