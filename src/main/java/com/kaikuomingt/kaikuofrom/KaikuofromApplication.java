package com.kaikuomingt.kaikuofrom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.kaikuomingt.kaikuofrom.mapper")
public class KaikuofromApplication {

    public static void main(String[] args) {
        SpringApplication.run(KaikuofromApplication.class, args);
    }

}
