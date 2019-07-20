package com.ming.cloud.user.service.impl;

import com.ming.cloud.user.dao.TransferDao;
import com.ming.cloud.user.entity.User;
import com.ming.cloud.user.service.UserService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Create on 2019-07-14.
 */
@Repository("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private TransferDao transferDao;

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    @Transactional
    public void transfer(String sourceAcctId, String targetAcctId, double amount) {
        this.transferDao.cancelIncrease(targetAcctId, amount);
        System.out.printf("exec decrease: acct= %s, amount= %7.2f%n", targetAcctId, amount);
    }
}
