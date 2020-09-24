package com.hlf;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class InstanceOfTest {

  @Test
  void testInstanceOf() {
    Object obj = Integer.valueOf(123);

    if (obj instanceof Integer num) {
      assertEquals(124, num + 1);
    } else {
      fail("Didn't work");
    }
  }
}
