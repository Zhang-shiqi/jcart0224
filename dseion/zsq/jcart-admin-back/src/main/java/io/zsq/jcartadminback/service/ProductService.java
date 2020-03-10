package io.zsq.jcartadminback.service;

import com.github.pagehelper.Page;
import io.zsq.jcartadminback.dto.in.ProductCreateInDTO;
import io.zsq.jcartadminback.dto.in.ProductSearchInDTO;
import io.zsq.jcartadminback.dto.in.ProductUpdateInDTO;
import io.zsq.jcartadminback.dto.out.ProductListOutDTO;
import io.zsq.jcartadminback.dto.out.ProductShowOutDTO;

import java.util.List;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                   Integer pageNum);

    ProductShowOutDTO getById(Integer productId);

}
