package com.ming.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * Created by 2019-06-20
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, MongoAutoConfiguration.class})
@EnableZipkinServer
@EnableEurekaClient
public class ZipKinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipKinApplication.class, args);
    }
}
