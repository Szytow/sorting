package com.company;

import java.util.List;

public class SelectionSort {

    public static void selectionSort(List<Integer> list) {
        int tmp;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    tmp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tmp);
                }
            }
        }

    }

}
