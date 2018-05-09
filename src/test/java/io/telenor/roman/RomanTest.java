package io.telenor.roman;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RomanTest {
    @Test
    public void test() {
        assertThat(Roman.convert(1), is("I"));
    }
}