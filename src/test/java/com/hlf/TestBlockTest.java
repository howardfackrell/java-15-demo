package com.hlf;

import org.junit.jupiter.api.Test;

public class TestBlockTest {

    @Test
    void testTextBlock() {
        var text = """
    This text
    goes accross multiple lines
    """;
        System.out.println(text);
    }
}
