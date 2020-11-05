package com.company;

import com.company.GenerateList;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Random;

public class BubbleSort {


    public static void bubbleSort(List<Integer> list){
        int tmp;
        for (int i = 0; i < list.size() - 1; i++) {
            for(int j = 1; j < list.size() - i; j++){
                if (list.get(j-1) > list.get(j)){
                    tmp = list.get(j-1);
                    list.set((j-1), list.get(j));
                    list.set((j), tmp);
                }
            }
        }
    }
}
