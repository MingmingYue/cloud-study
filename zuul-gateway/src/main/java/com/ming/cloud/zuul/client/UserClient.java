package com.ming.cloud.zuul.client;

import com.ming.cloud.zuul.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 2019-06-20
 */
@FeignClient(value="user", path="user")
public interface UserClient {

    @GetMapping("/getUser")
    User getUserById(@RequestParam("userId") String userId);
}

