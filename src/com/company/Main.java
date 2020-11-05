package com.company;

import java.util.List;

import static com.company.GenerateList.createRandomList;
import static com.company.BubbleSort.bubbleSort;
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

        List<Integer> newArr = createRandomList();
        System.out.println(newArr);
        bubbleSort(newArr);
        System.out.println(newArr);

    }


}
