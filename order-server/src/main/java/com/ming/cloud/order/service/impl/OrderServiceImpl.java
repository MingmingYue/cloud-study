package com.ming.cloud.order.service.impl;

import com.ming.cloud.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Create on 2019-07-14.
 */
@Repository("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void increaseAmount(String acctId, double amount) {
        this.jdbcTemplate.update("UPDATE tb_account_one SET amount = amount - ? WHERE acct_id = ?", amount, acctId);
        System.out.printf("undo increase: acct= %s, amount= %7.2f%n", acctId, amount);
    }

    @Transactional
    public void decreaseAmount(String acctId, double amount) {
        this.jdbcTemplate.update("UPDATE tb_account_one SET amount = amount + ? WHERE acct_id = ?", amount, acctId);
        System.out.printf("undo decrease: acct= %s, amount= %7.2f%n", acctId, amount);
    }
}
