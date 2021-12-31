package edu.montana.csci.csci366.strweb.ops;

import org.junit.jupiter.api.Test;

import static edu.montana.csci.csci366.strweb.ops.TestingUtils.strings;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineLengthTransformerTest {

    @Test
    void testLineLengthWorks() {
        LineLengthTransformer transformer = new LineLengthTransformer(strings("a", "b", "c"));
        assertEquals(strings("1", "1", "1"), transformer.toLengths());

        transformer = new LineLengthTransformer(strings("a", "ab", "abc"));
        assertEquals(strings("1", "2", "3"), transformer.toLengths());
    }


}
