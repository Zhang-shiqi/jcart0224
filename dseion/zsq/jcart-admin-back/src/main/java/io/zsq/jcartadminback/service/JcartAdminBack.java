package io.zsq.jcartadminback.service;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.zsq.jcartadministrationback.dao")
public class JcartAdminBack {

    public static void main(String[] args) {

        SpringApplication.run(JcartAdminBack.class,args);
    }

}
