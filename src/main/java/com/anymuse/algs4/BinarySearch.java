
package com.anymuse.algs4;

import edu.princeton.cs.algs4.*;
import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whitelist = new In(args[0]).readAllInts();
        int[] keys = new In(args[1]).readAllInts();
        Arrays.sort(whitelist);
        for (int key: keys) {
            if (rank(key, whitelist) < 0) {
                StdOut.println(key);
            }
        }
    }
}
