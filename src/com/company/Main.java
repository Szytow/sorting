package com.company;

import java.util.List;

import static com.company.BubbleSort.bubbleSort;
import static com.company.GenerateList.copy;
import static com.company.GenerateList.createRandomList;
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

//        long startTime = System.nanoTime();
//        System.out.println(bubbleSort(copy(newArr)));
//        long endTime = System.nanoTime();
//        System.out.println("Bubblesorting time: " + (endTime - startTime)/1000000);
//        System.out.println("**************************************");
//
//        startTime = System.nanoTime();
//        System.out.println(selectionSort(copy(newArr)));
//        endTime = System.nanoTime();
//        System.out.println("Selection sort time: " + (endTime - startTime)/1000000);
//        System.out.println("**************************************");

        long startTime = System.nanoTime();
        System.out.println(new MergeSort().mergeSort(copy(newArr), 0, newArr.size() - 1));
        long endTime = System.nanoTime();
        System.out.println("Merge sort time: " + (endTime - startTime)/1000000);
        System.out.println("**************************************");

        startTime = System.nanoTime();
        System.out.println(new QuickSort().quickSort(copy(newArr), 0, newArr.size() - 1));
        endTime = System.nanoTime();
        System.out.println("Quick sort time: " + (endTime - startTime)/1000000);
        System.out.println("**************************************");




//        new QuickSort().quickSort(newArr, 0, newArr.size() - 1);
//        new MergeSort().mergeSort(newArr, 0, newArr.size()-1);
//        System.out.println(newArr);

    }


}
