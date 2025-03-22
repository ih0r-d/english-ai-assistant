/*
 * Copyright © 2025 Ihor Didyk
 * Licensed under the Apache License, Version 2.0
 */
package com.ih0rd.assistant;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class BackendApplicationTests {

  @Test
  void contextLoads() {}
}
