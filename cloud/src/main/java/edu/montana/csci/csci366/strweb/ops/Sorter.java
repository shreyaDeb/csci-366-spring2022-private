package edu.montana.csci.csci366.strweb.ops;

import java.util.Arrays;
import java.util.Collections;

/**
 * This class is a simple sorter that implements sorting a strings rows in different ways
 */
public class Sorter {
    private final String _strings;

    public Sorter(String strings) {

        _strings = strings;
    }

    public String sort() {

        //splits the string array it creates
        String[] split = _strings.split("\n|\r\n");

        //sorts the splitted array
        Arrays.sort(split);

        //joins the strings together
        return String.join("\n", split);
    }

    public String reverseSort() {

        //splits the string array it creates
        String[] split = _strings.split("\n|\r\n");

        //first sorts and then splits in reverse order
        Arrays.sort(split, Collections.reverseOrder());

        //joins the strings together
        return String.join("\n", split);
    }

    public String parallelSort() {

        //splits the string array it creates
        String[] split = _strings.split("\n|\r\n");

        //parallel sorts the array
        Arrays.parallelSort(split);

        //joins the strings together
        return String.join("\n", split);
    }
}