package io.zsq.jcartadminback.service;

import com.github.pagehelper.Page;
import io.zsq.jcartadminback.dto.in.ReturnSearchInDTO;
import io.zsq.jcartadminback.po.Return;

public interface ReturnService {

    Page<Return> search(ReturnSearchInDTO returnSearchInDTO, Integer pageNum);

    Return getById(Integer returnId);

    void update(Return aReturn);

}
