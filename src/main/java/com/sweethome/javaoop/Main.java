package com.sweethome.javaoop;

import com.sweethome.javaoop.logic.BubbleSort;
import com.sweethome.javaoop.logic.JavaSort;
import com.sweethome.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> bubbleSort = new JavaSort<>();

        System.out.println("[result] " + bubbleSort.sort(Arrays.asList(args)));

    }
}
