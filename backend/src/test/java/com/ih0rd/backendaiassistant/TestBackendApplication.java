package com.ih0rd.backendaiassistant;

import org.springframework.boot.SpringApplication;

public class TestBackendApplication {

  public static void main(String[] args) {
    SpringApplication.from(BackendApplication::main)
        .with(TestcontainersConfiguration.class)
        .run(args);
  }
}
