package edu.citytech.cst.tictactoe.numbers.service;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NumberService {
    public static int[] get123(){
        var data = IntStream.iterate(0, e->e+1).limit(26)
                .toArray();

        return data;
    }

    public static void main(String[] args) {
        Arrays.stream(get123()).forEach(System.out::print);
    }
}
