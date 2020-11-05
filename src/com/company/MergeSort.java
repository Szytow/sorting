package com.company;

import java.util.List;

public class MergeSort {

    public List<Integer> mergeSort(List<Integer> list, int lowIndex, int highIndex) {

        if (lowIndex < highIndex) {
            // Find the middle point
            int m = (lowIndex + highIndex) / 2;

            // Sort first and second halves
            mergeSort(list, lowIndex, m);
            mergeSort(list, m + 1, highIndex);

            // Merge the sorted halves
            merge(list, lowIndex, m, highIndex);
        }
        return list;
    }

    private void merge(List<Integer> list, int lowIndex, int m, int highIndex) {
        int n1 = m - lowIndex + 1;
        int n2 = highIndex - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];


        for (int i = 0; i < n1; ++i)
            L[i] = list.get(lowIndex + i);
        for (int j = 0; j < n2; ++j)
            R[j] = list.get(m + 1 + j);

        int i = 0;
        int j = 0;

        int k = lowIndex;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                list.set(k, L[i]);
                i++;
            } else {
                list.set(k, R[j]);
                j++;
            }
            k++;
        }

        while (i < n1) {
            list.set(k, L[i]);
            i++;
            k++;
        }

        while (j < n2) {
            list.set(k, R[j]);
            j++;
            k++;
        }
    }

}
