package com.hlf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringIsEmptyTest {

    @Test
    void testStingEmpty() {
        Assertions.assertFalse("This is a Test".isEmpty());
        Assertions.assertTrue("".isEmpty());
        Assertions.assertThrows(NullPointerException.class, () -> {
            String n = null;
            n.isEmpty();
        });
    }

    @Test
    void testCharSequenceIsEmpty() {
        Assertions.assertFalse(new StringBuilder("This is a Test").isEmpty());
        Assertions.assertTrue(new StringBuilder("").isEmpty());
        Assertions.assertThrows(NullPointerException.class, () -> {
            StringBuilder n = null;
            n.isEmpty();
        });
    }
}
