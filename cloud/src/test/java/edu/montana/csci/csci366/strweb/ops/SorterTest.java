package edu.montana.csci.csci366.strweb.ops;

import org.junit.jupiter.api.Test;
import static edu.montana.csci.csci366.strweb.ops.TestingUtils.*;
import static org.junit.jupiter.api.Assertions.*;

public class SorterTest {

    @Test
    void testSortingWorks() {
        Sorter sorter = new Sorter(strings("a", "b", "c"));
        assertEquals(strings("a", "b", "c"), sorter.sort());

        sorter = new Sorter(strings("c", "b", "a"));
        assertEquals(strings("a", "b", "c"), sorter.sort());

        sorter = new Sorter(strings("b", "c", "a"));
        assertEquals(strings("a", "b", "c"), sorter.sort());
    }

    @Test
    void testParallelSortingWorks() {
        Sorter sorter = new Sorter(strings("a", "b", "c"));
        assertEquals(strings("a", "b", "c"), sorter.parallelSort());

        sorter = new Sorter(strings("c", "b", "a"));
        assertEquals(strings("a", "b", "c"), sorter.parallelSort());

        sorter = new Sorter(strings("b", "c", "a"));
        assertEquals(strings("a", "b", "c"), sorter.parallelSort());
    }

    @Test
    void testReverseSortingWorks() {
        Sorter sorter = new Sorter(strings("a", "b", "c"));
        assertEquals(strings("c", "b", "a"), sorter.reverseSort());

        sorter = new Sorter(strings("c", "b", "a"));
        assertEquals(strings("c", "b", "a"), sorter.reverseSort());

        sorter = new Sorter(strings("b", "c", "a"));
        assertEquals(strings("c", "b", "a"), sorter.reverseSort());
    }

}
