package com.glodon.springcloudapigateway;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
        import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableZuulServer
@EnableZuulProxy
public class SpringCloudApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudApiGatewayApplication.class, args);
    }
}
