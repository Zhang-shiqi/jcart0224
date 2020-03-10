package io.zsq.jcartadminback.service;

import com.github.pagehelper.Page;
import io.zsq.jcartadminback.dto.in.OrderSearchInDTO;
import io.zsq.jcartadminback.dto.out.OrderListOutDTO;
import io.zsq.jcartadminback.dto.out.OrderShowOutDTO;
import io.zsq.jcartadminback.po.Order;

public interface OrderService {

    Page<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO, Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);

}
