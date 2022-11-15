package com.z;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author yun_kai
 * @date 2022年11月15日, 0015
 */
@SpringBootApplication
@EnableConfigurationProperties
@ConfigurationPropertiesScan(basePackages = {"com.z.properties"})
public class CodeGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeGeneratorApplication.class, args);
    }
}
