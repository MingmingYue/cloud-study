package com.ming.cloud.order;

import org.bytesoft.bytetcc.supports.springcloud.config.SpringCloudSecondaryConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Create on 2019-07-14.
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication(scanBasePackages = "com.ming.cloud.order")
@EnableTransactionManagement
@Import(SpringCloudSecondaryConfiguration.class)
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

}
