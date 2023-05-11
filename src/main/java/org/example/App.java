package org.example;

import static org.example.BubbleSort.bubbleSort;
import static org.example.HeapSort.heapSort;
import static org.example.InsertionSort.insertionSort;
import static org.example.MergeSort.mergeSort;
import static org.example.QuickSort.quickSort;
import static org.example.SelectionSort.selectionSort;

public class App 
{
    public static void main( String[] args )
    {

        System.out.println("---Insert Sort--- ");
        int[] arr = {5, 2, 8, 3, 1};
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("---Bubble Sort--- ");

        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("-----------------");

        System.out.println("---Selection Sort---");

        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println("---Quick Sort---");
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("-------");
        System.out.println("---Merge Sort---");
        mergeSort(arr,0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("--------");
        System.out.println("---Heap Sort---");
        heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

