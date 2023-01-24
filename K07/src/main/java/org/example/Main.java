package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        initList(list);

        bubbleSort(list);
        System.out.println("after bubblesort:");
        printList(list);
        System.out.println("\nafter reverse");
        list.sort(Comparator.reverseOrder());
        printList(list);
    }

    private static void printList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }

    private static void initList(List<Integer> list) {
        list.add(1);
        list.add(132);
        list.add(21);
        list.add(2341);
        list.add(13);
        list.add(11);
    }

    static void bubbleSort(List<Integer> arr) {
        int temp;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }
}
