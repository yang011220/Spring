package org.example.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.example.dao.UserDao;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class jdbcConfig {
    //    管理第三方Bean
//    添加@Bean表示当前方法的返回值是一个Bean
    @Bean("dataSource")
    public DataSource dataSource(UserDao userDao){
        DruidDataSource druidDataSource = new DruidDataSource();
        System.out.println(userDao);
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql:///db1");
        druidDataSource.setUsername("linlin190127");
        druidDataSource.setPassword("011220ly.");
        return druidDataSource;
    }
}
