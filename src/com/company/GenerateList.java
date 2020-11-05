package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GenerateList {

    public static List<Integer> createRandomList() {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        Random r = new Random();

        List<Integer> array = new ArrayList();
        int max = 20;

        for (int i = 0; i < arrLength; i++) {
            array.add(r.nextInt(max));
        }
        return array;
    }

    public static List<Integer> copy(List<Integer> oglist){
        List<Integer> array = new ArrayList();
        for (int number  : oglist) {
            array.add(number);
        }
        return array;
    }

}
