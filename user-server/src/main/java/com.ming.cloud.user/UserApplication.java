package com.ming.cloud.user;

import org.bytesoft.bytetcc.supports.springcloud.config.SpringCloudSecondaryConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by 2019-06-25
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
@EnableTransactionManagement
@Import(SpringCloudSecondaryConfiguration.class)
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
