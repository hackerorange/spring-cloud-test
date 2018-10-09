package com.glodon.springcloudadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringCloudAdminApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAdminApplication.class, args);
    }
}
