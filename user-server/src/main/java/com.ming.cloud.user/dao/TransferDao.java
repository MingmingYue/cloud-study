package com.ming.cloud.user.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * Create on 2019-07-20.
 */
@Mapper
public interface TransferDao {

    @Update("update tb_account_two set amount = amount + #{amount} where acct_id = #{acctId}")
    int increaseAmount(@Param("acctId") String accountId, @Param("amount") double amount);

    @Update("update tb_account_two set amount = amount - #{amount} where acct_id = #{acctId}")
    int cancelIncrease(@Param("acctId") String accountId, @Param("amount") double amount);

}