package com.company;

import java.util.List;

public class QuickSort {

    public List<Integer> quickSort(List<Integer> list, int lowIndex, int highIndex) {
        if (lowIndex < highIndex){
            int pivot = partition(list, lowIndex, highIndex);

            quickSort(list, lowIndex, pivot -1);
            quickSort(list, pivot + 1, highIndex);
        }
        return list;

    }

    private int partition(List<Integer> list, int lowIndex, int highIndex) {
        int pivot = list.get(highIndex);
        int i = lowIndex - 1;
        for (int j = lowIndex; j < highIndex; j++) {

            if(list.get(j) < pivot){
                i++;

                int tmp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, tmp);
            }

        }

        int temp = list.get(i +1);
        list.set(i + 1, list.get(highIndex));
        list.set(highIndex, temp);

        return i+1;
    }


}
