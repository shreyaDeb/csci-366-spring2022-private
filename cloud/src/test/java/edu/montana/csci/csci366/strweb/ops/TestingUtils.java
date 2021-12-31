package edu.montana.csci.csci366.strweb.ops;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TestingUtils {
    public static String strings(String... strings) {
        return Arrays.asList(strings).stream().collect(Collectors.joining("\n"));
    }
}
