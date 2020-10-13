package com.learnSpringBoot.conferenceapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

    // override bean
    @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.driverClassName("com.mysql.jdbc.Driver");
        builder.url("jdbc:mysql://localhost:3306/conference_demo?useSSL=false");
        builder.username("Sanyam");
        builder.password("Sanyam@99");
        System.out.println("Custom DataSource bean is initialized and set");
        return builder.build();
    }
}
