package com.jfs415.cookhub.test.integrations;

import com.jfs415.cookhub.core.CookHubCoreApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration(proxyBeanMethods = false)
public class TestCookHubCoreApplication {

    @Bean
    @ServiceConnection(name = "redis")
    GenericContainer<?> redisContainer() {
        return new GenericContainer<>(DockerImageName.parse("redis:latest")).withExposedPorts(6379);
    }

    public static void main(String[] args) {
        SpringApplication.from(CookHubCoreApplication::main)
                .with(TestCookHubCoreApplication.class)
                .run(args);
    }
}
