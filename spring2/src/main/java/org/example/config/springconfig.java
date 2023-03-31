package org.example.config;

import com.alibaba.druid.pool.DruidAbstractDataSource;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

//配置类的注解方式
@Configuration
//包扫描的注解方式
@ComponentScan("org.example")
@Import(jdbcConfig.class)
public class springconfig {

}
