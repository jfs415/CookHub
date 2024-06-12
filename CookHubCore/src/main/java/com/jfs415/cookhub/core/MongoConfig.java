package com.jfs415.cookhub.core;

import com.mongodb.MongoClientSettings;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.UuidRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoConfig {
    
    private final MongoCredential mongoCredential;
    
    @Autowired
    public MongoConfig(@Value("${spring.data.mongodb.username}") String username, @Value("${spring.data.mongodb.password}") String password) {
        mongoCredential = MongoCredential.createCredential(username, "admin", password.toCharArray());
    }
    
    @Bean
    public MongoClient mongoClient() {
        MongoClientSettings clientSettings = MongoClientSettings.builder().uuidRepresentation(UuidRepresentation.STANDARD).credential(mongoCredential).build();
        
        return MongoClients.create(clientSettings);
    }
}
