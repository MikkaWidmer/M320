import java.util.Arrays;
import java.util.Collections;

public class InsertionSort {

    public static void main(String[] args) {
        User[] arr = {new User(2, "Thomas"), new User(1, "Marko"), new User(5, "Silvia"), new User(4, "Beat"), new User(0, "Klodiana"), new User(3, "Tobias")};
        insertionSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
        Arrays.sort(arr);
    }

    public static void insertionSort(User[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            User key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getId() > key.getId()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(User[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
