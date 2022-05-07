package edu.montana.csci.csci366.strweb.ops;

import java.util.Arrays;
import java.util.Collections;
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

        CountDownLatch latch = new CountDownLatch(_lines.length);
        //runs through each line to calculate each length
        for (int i = 0; i < _lines.length; i++) {
            String line = _lines[i];
            LineLengthCalculator LineLengthCalculator = new LineLengthCalculator(i, latch);

            new Thread(LineLengthCalculator).start();
        }
        //wait for all the threads to be done
        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
             return String.join("\n", _lines);
    }

    //this class calculates the length of lines (as named)
    class LineLengthCalculator implements Runnable {
        private final int index;
        private final CountDownLatch latch;
        //constructor
        public LineLengthCalculator(int index, CountDownLatch latch) {
            this.index = index;
            this.latch = latch;
        }
        @Override
        public void run() {
            String currentValue = _lines[index];
            _lines[index] = String.valueOf(currentValue.length());
            //decreases latch by -1
            latch.countDown();
        }
    }

}
