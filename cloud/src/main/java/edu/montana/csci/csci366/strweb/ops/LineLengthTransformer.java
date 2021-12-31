package edu.montana.csci.csci366.strweb.ops;

import java.util.concurrent.CountDownLatch;

/**
 * This class is should calculate the length of each line and replace the line in the
 * array with a string representation of its length
 */
public class LineLengthTransformer {
    String[] _lines;

    public LineLengthTransformer(String strings) {
        _lines = strings.split("\n");
    }

    public String toLengths() {
        //TODO - this method should create a series of Runnables and use Threads to do all
        //       line lengths in parallel
      return "";
    }

}
