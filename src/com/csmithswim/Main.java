package com.csmithswim;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        String[] loopCount = String.valueOf(Integer.toBinaryString(n)).trim().split("0");
        int count=0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        Arrays.sort(loopCount);
        System.out.println(loopCount[loopCount.length-1].length());

//        System.out.println(Arrays.toString(loopCount));
//        System.out.println(Integer.toBinaryString(n));

        scanner.close();
    }
}
