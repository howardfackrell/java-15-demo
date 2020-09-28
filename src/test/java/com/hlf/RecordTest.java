package com.hlf;

import org.junit.jupiter.api.Test;

record Point(int x, int y, int z) {}

public class RecordTest {

  @Test
  public void testRecord() {

    Point p = new Point(1, 2, 3);

    System.out.println(p);
  }
}
