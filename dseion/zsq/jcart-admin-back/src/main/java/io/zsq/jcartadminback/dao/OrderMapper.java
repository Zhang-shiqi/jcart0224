package io.zsq.jcartadminback.dao;

import com.github.pagehelper.Page;

import io.zsq.jcartadminback.dto.out.OrderListOutDTO;
import io.zsq.jcartadminback.po.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface OrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

//    custom

    Page<OrderListOutDTO> search(@Param("orderId") Long orderId,
                                 @Param("status") Byte status,
                                 @Param("totalPrice") Double totalPrice,
                                 @Param("customerName") String customerName,
                                 @Param("startTime") Date startTime,
                                 @Param("endTime") Date endTime);

}