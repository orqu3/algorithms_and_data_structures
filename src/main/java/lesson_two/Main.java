package lesson_two;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //1. Создать массив большого размера (100000 элементов).
        int[] array = new int[100000];

        //3. Заполнить массив случайными числами.
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        testBubbleSortTime(array); //28645 ms
        testSelectionSortTime(array); //1554 ms
        testInsertionSortTime(array); //3 ms
    }

    //4. Написать методы, реализующие рассмотренные виды сортировок, и проверить скорость выполнения каждой.
    // (Можете в комментариях написать измеренное время)

    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minI = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minI = j;
                }
            }
            if (i != minI) {
                int tmp = arr[i];
                arr[i] = arr[minI];
                arr[minI] = tmp;
            }
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    private static void testBubbleSortTime(int[] array) {
        long bubbleSortStartTime = System.currentTimeMillis();
        bubbleSort(array);
        long bubbleSortEndTime = System.currentTimeMillis();
        System.out.println("BubbleSort total time: " + (bubbleSortEndTime - bubbleSortStartTime) + " ms");
    }

    private static void testSelectionSortTime(int[] array) {
        long selectionSortStartTime = System.currentTimeMillis();
        selectionSort(array);
        long selectionSortEndTime = System.currentTimeMillis();
        System.out.println("Selection sort total time: " + (selectionSortEndTime - selectionSortStartTime) + " ms");
    }

    private static void testInsertionSortTime(int[] array) {
        long insertionSortStartTime = System.currentTimeMillis();
        insertionSort(array);
        long insertionSortEndTime = System.currentTimeMillis();
        System.out.println("Insertion sort total time: " + (insertionSortEndTime - insertionSortStartTime) + " ms");
    }
}
