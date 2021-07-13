package com.druggelp.backend.service;

import com.druggelp.backend.entity.Cart;
import com.druggelp.backend.entity.ProductInOrder;
import com.druggelp.backend.entity.User;

import java.util.Collection;

public interface CartService {

    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
