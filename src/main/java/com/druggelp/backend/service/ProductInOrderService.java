package com.druggelp.backend.service;

import com.druggelp.backend.entity.ProductInOrder;
import com.druggelp.backend.entity.User;

public interface ProductInOrderService {

    void update(String itemId, Integer quantity, User user);

    ProductInOrder findOne(String itemId, User user);
}
