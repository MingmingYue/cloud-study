package com.ming.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

/**
 * Created by 2019-06-20
 */
@EnableZipkinServer
@SpringBootApplication
@EnableEurekaClient
public class ZipKinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipKinApplication.class,args);
    }
}
