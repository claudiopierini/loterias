package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        IntStream.range(1, 8).forEachOrdered(i -> {
            ArrayList<Integer> numbers = (ArrayList<Integer>) new Random().ints(1, 60).limit(6).boxed().collect(Collectors.toList());
            Collections.sort(numbers);
            System.out.println("Jogo " + i + " - " + numbers);
        });
    }
}
