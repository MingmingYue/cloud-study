package com.ming.cloud.user.controller;

import com.ming.cloud.user.dao.TransferDao;
import com.ming.cloud.user.feign.service.OrderService;
import com.ming.cloud.user.service.UserService;
import org.bytesoft.compensable.Compensable;
import org.bytesoft.compensable.CompensableCancel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by 2019-06-25
 */
@RestController
@RequestMapping("/user")
@Compensable(interfaceClass = UserService.class, simplified = true)
public class UserController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @Resource
    private TransferDao transferDao;

    @Autowired
    private OrderService orderService;

    @ResponseBody
    @RequestMapping(value = "/simplified/transfer", method = RequestMethod.POST)
    @Transactional
    public void transfer(@RequestParam String sourceAcctId, @RequestParam String targetAcctId, @RequestParam double amount) {
        this.orderService.decreaseAmount(sourceAcctId, amount);
        this.increaseAmount(targetAcctId, amount);
    }

    private void increaseAmount(String acctId, double amount) {
        this.transferDao.increaseAmount(acctId, amount);
        System.out.printf("exec increase: acct= %s, amount= %7.2f%n", acctId, amount);
    }

    @CompensableCancel
    @Transactional
    public void cancelTransfer(String sourceAcctId, String targetAcctId, double amount) {
        this.transferDao.cancelIncrease(targetAcctId, amount);
        System.out.printf("exec decrease: acct= %s, amount= %7.2f%n", targetAcctId, amount);
    }

}
