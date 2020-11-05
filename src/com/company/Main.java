package com.company;

import com.company.sorting.BubbleSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
bubble

selection

gnome

quick

insertion

counting

merge

tree

bucket
 */

public class Main {

    public static void main(String[] args) {

        Random r = new Random();

        List<Integer> array = new ArrayList();
        int lenght = 10;
        int max = 20;

        for (int i = 0; i < lenght; i++){
            array.add(r.nextInt(max));
        }

        System.out.println(array);
        System.out.println(array.get(3));
        array.set(3, 40);
        System.out.println(array);




    }
}
