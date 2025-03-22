/*
 * Copyright © 2025 Ihor Didyk
 * Licensed under the Apache License, Version 2.0
 */
package com.ih0rd.assistant;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.ollama.OllamaContainer;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration(proxyBeanMethods = false)
@Testcontainers
class TestcontainersConfiguration {

  @Bean
  @ServiceConnection
  OllamaContainer ollamaContainer() {
    return new OllamaContainer(DockerImageName.parse("ollama/ollama:0.1.26"));
  }

  @Bean
  @ServiceConnection
  PostgreSQLContainer<?> pgvectorContainer() {
    return new PostgreSQLContainer<>(DockerImageName.parse("pgvector/pgvector:pg16"));
  }
}
