package com.algebra.batch.conf;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
class PersistenceContext {

    @ConfigurationProperties(prefix = "datasource-reader")
    @Primary
    @Bean(name="r_ds")  @Qualifier("r_ds")
    public DataSource readDruidDataSource() {
        return new DruidDataSource();
    }
    
    @ConfigurationProperties(prefix = "datasource-writer")
    @Bean(name="w_ds") @Qualifier("w_ds")
    public DataSource writeDruidDataSource() {
        return new DruidDataSource();
    }
}