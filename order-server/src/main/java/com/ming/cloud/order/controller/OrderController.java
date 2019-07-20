package com.ming.cloud.order.controller;

import com.ming.cloud.order.service.OrderService;
import org.bytesoft.compensable.Compensable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * Create on 2019-07-15.
 */
@Compensable(interfaceClass = OrderService.class, cancellableKey = "orderService")
@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @ResponseBody
    @RequestMapping(value = "/increase", method = RequestMethod.POST)
    @Transactional
    public void increaseAmount(@RequestParam("acctId") String acctId, @RequestParam("amount") double amount) {
        this.jdbcTemplate.update("update tb_account_one set amount = amount + ? where acct_id = ?", amount, acctId);
        System.out.printf("exec increase: acct= %s, amount= %7.2f%n", acctId, amount);
    }

    @ResponseBody
    @RequestMapping(value = "/decrease", method = RequestMethod.POST)
    @Transactional
    public void decreaseAmount(@RequestParam("acctId") String acctId, @RequestParam("amount") double amount) {
        this.jdbcTemplate.update("update tb_account_one set amount = amount - ? where acct_id = ?", amount, acctId);
        System.out.printf("exec decrease: acct= %s, amount= %7.2f%n", acctId, amount);
    }
}
