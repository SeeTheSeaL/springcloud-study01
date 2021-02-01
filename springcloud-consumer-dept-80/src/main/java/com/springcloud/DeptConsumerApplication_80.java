package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author lee
 * @date 2020/10/6 - 4:46 下午
 */
@SpringBootApplication
@EnableEurekaClient //开启Eureka
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT")
public class DeptConsumerApplication_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApplication_80.class,args);
    }
}
