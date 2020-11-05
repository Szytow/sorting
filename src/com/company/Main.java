package com.company;

import java.util.List;

import static com.company.GenerateList.createRandomList;
import static com.company.BubbleSort.bubbleSort;
import static com.company.SelectionSort.selectionSort;
/*
bubble +

selection +

quick -

merge -

 */

public class Main {

    public static void main(String[] args) {
        List<Integer> newArr = createRandomList();
        System.out.println(newArr);
        bubbleSort(newArr);
        System.out.println("Bubble sort: " + newArr);
        selectionSort(newArr);
        System.out.println("Selection sort: " + newArr);
    }


}
