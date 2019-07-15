package com.ming.cloud.order.service;


/**
 * Create on 2019-07-14.
 */
public interface OrderService {

    void increaseAmount(String accountId, double amount);

    void decreaseAmount(String accountId, double amount);

}
