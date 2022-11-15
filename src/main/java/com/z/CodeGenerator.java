package com.z;

import java.util.Collections;

import cn.hutool.core.date.DatePattern;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.keywords.MySqlKeyWordsHandler;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author yun_kai
 * @date 2022年11月15日, 0015
 */
public class CodeGenerator {

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${package.config.parent}")
    private String parent;

    @Value("${package.config.entity}")
    private String entity;

    private static final String SCHEMA = "mybatis-plus";

    private static final String OUTPUT_DIR = "/opt/baomidou";

    private static final String AUTHOR = "baomidou";

    /**
     * 数据库配置
     */
    private final DataSourceConfig.Builder DATA_SOURCE_CONFIG =
            new DataSourceConfig.Builder(url,username,password)
                    .dbQuery(new MySqlQuery())
                    .schema(SCHEMA)
                    .typeConvert(new MySqlTypeConvert())
                    .keyWordsHandler(new MySqlKeyWordsHandler())
            ;


    private final GlobalConfig.Builder GLOBAL_CONFIG =
            new GlobalConfig.Builder()
                    .outputDir(OUTPUT_DIR)
                    .author(AUTHOR)
                    .enableKotlin()
                    .enableSwagger()
                    .dateType(DateType.TIME_PACK)
                    .commentDate(DatePattern.NORM_DATE_PATTERN)
            ;

    private final PackageConfig.Builder PACKAGE_CONFIG =
            new PackageConfig.Builder()
                    .parent(parent)
                    .entity(entity)
                    .service("service")
                    .serviceImpl("service.impl")
                    .mapper("mapper")
                    .xml("mapper.xml")
                    .controller("controller")
                    .pathInfo(Collections.singletonMap(OutputFile.xml, "D://"))
            ;

}
