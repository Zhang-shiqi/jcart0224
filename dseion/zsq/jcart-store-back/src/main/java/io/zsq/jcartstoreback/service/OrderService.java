package io.zsq.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.zsq.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.zsq.jcartstoreback.dto.out.OrderShowOutDTO;
import io.zsq.jcartstoreback.po.Order;

public interface OrderService {

    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO,
                  Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

    OrderShowOutDTO getById(Long orderId);

}
