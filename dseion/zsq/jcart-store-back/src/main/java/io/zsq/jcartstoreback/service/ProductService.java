package io.zsq.jcartstoreback.service;


import com.github.pagehelper.Page;
import io.zsq.jcartstoreback.dto.out.ProductListOutDTO;
import io.zsq.jcartstoreback.dto.out.ProductShowOutDTO;
import io.zsq.jcartstoreback.po.Product;

public interface ProductService {

    Product getById(Integer productId);

    ProductShowOutDTO getShowById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
