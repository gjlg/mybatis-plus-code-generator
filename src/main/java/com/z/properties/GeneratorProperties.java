package com.z.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author yun_kai
 * @date 2022年11月15日, 0015
 */
@Data
@Component
@ConfigurationProperties(prefix = "generator")
public class GeneratorProperties {
    private String parent;

    private String entity;
}
