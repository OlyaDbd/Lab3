package com.lab3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {

    @Test
    void testFirst() {
        List<String> text = new ArrayList<>(
                Arrays.asList("java class", "hello world", "1234 5678"));
        List<String> expected = Main.reverseStrings(text);
        List<String> actual = new ArrayList<>(
                Arrays.asList("avaj", "ssalc", "olleh", "dlrow", "4321", "8765"));
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void testSecond() {
        List<String> text = new ArrayList<>(
                Arrays.asList("types.of.computer.system", "abc 123"));
        List<String> expected = Main.reverseStrings(text);
        List<String> actual = new ArrayList<>(
                Arrays.asList("sepyt", "fo", "retupmoc", "metsys", "cba", "321"));
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void testThirdEmpty() {
        List<String> text = new ArrayList<>(
                Arrays.asList(""));
        List<String> expected = Main.reverseStrings(text);
        List<String> actual = new ArrayList<>(
                Arrays.asList(""));
        Assertions.assertIterableEquals(expected, actual);
    }
}
