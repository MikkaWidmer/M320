package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        initList(list);

        bubbleSort(list);
        System.out.println("after bubblesort:");
        printList(list);
        System.out.println("\nafter reverse");
        Collections.reverse(list);
        printList(list);
    }

    private static void printList(List<User> list) {
        for (User user : list) {
            System.out.print(user + " ");
        }
    }

    private static void initList(List<User> list) {
        list.add(new User(1,"a"));
        list.add(new User(323, "b"));
        list.add(new User(32,"c"));
        list.add(new User(232,"d"));
        list.add(new User(234,"e"));
        list.add(new User(9999, "f"));
    }

    static void bubbleSort(List<User> arr) {
        User temp;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - i - 1; j++) {
                if (arr.get(j).getAge() > arr.get(j + 1).getAge()) {
                    temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }
}
