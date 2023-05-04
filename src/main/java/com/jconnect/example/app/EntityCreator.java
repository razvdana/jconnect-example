package com.jconnect.example.app;


import java.util.UUID;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "com.jconnect.example.app")
@EnableJpaRepositories(basePackages = "com.jconnect.example.app")
@RequiredArgsConstructor
public class EntityCreator {

    private final MyEntityRepository repository;

    @EventListener(ApplicationReadyEvent.class)
    public void saveEntity() {
        repository.save(new MyEntity(UUID.randomUUID().toString(), "test"));
    }
}
