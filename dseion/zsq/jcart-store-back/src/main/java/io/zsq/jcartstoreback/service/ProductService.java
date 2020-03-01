package io.zsq.jcartstoreback.service;


import com.github.pagehelper.Page;
import io.zsq.jcartstoreback.dto.out.ProductListOutDTO;
import io.zsq.jcartstoreback.dto.out.ProductShowOutDTO;

public interface ProductService {

    ProductShowOutDTO getById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
