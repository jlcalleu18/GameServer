package edu.citytech.server.numbers.service;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NumberService {
    public static int[] get123(int... limit){
        int newLimit = 100;
        if (limit.length != 0)
            newLimit = limit[0];

        var data = IntStream.rangeClosed(0, newLimit)
                .toArray();

        return data;
    }

    public static void main(String[] args) {
        Arrays.stream(get123(45)).forEach(System.out::print);
    }
}
