/*
 * Copyright © 2025 Ihor Didyk
 * Licensed under the Apache License, Version 2.0
 */
package com.ih0rd.assistant;

import org.springframework.boot.SpringApplication;

public class TestBackendApplication {

  public static void main(String[] args) {
    SpringApplication.from(BackendApplication::main)
        .with(TestcontainersConfiguration.class)
        .run(args);
  }
}
