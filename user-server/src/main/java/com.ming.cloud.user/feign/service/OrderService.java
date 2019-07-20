package com.ming.cloud.user.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Create on 2019-07-20.
 */
@FeignClient(value = "order", path = "order")
public interface OrderService {

    @RequestMapping(method = RequestMethod.POST, value = "/increase")
    void increaseAmount(@RequestParam("acctId") String accountId, @RequestParam("amount") double amount);

    @RequestMapping(method = RequestMethod.POST, value = "/decrease")
    void decreaseAmount(@RequestParam("acctId") String accountId, @RequestParam("amount") double amount);
}
