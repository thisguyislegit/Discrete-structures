
import static java.lang.Math.E;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kyle
 */
public class Exercise23_13 {

    public static void main(String[] args) {
        String stringData[][] = new String[2][8];
        stringData[0][0] = "Array";
        stringData[0][1] = "Selection";
        stringData[0][2] = "Insertion";
        stringData[0][3] = "Bubble";
        stringData[0][4] = "Merge";
        stringData[0][5] = "QuickT";
        stringData[0][6] = "Heap";
        stringData[0][7] = "Radix";
        stringData[1][0] = "Size";
        stringData[1][1] = "Sort";
        stringData[1][2] = "Sort";
        stringData[1][3] = "Sort";
        stringData[1][4] = "Sort";
        stringData[1][5] = "Sort";
        stringData[1][6] = "Sort";
        stringData[1][7] = "Sort";

        long tableData[][] = new long[6][8];
        tableData[0][0] = 10000;
        tableData[1][0] = 20000;
        tableData[2][0] = 30000;
        tableData[3][0] = 40000;
        tableData[4][0] = 50000;
        tableData[5][0] = 60000;

        //creating random array on n size
        int[] newListS1Selection = generateRandomArray(10000);

        //cloning the array
        int[] newLists1Insertion = newListS1Selection.clone();
        int[] newLists1Bubble = newListS1Selection.clone();
        int[] newLists1Merge =newListS1Selection.clone();
        int[] newLists1Quickt = newListS1Selection.clone();
        int[] newLists1Heap =newListS1Selection.clone();
        int[] newLists1Radix =newListS1Selection.clone();

        //sorting the array
        tableData[0][1] = selectionSort(newListS1Selection);
        tableData[0][2] = insertionSort(newLists1Insertion);
        tableData[0][3] = bubbleSort(newLists1Bubble);
        tableData[0][4] = mergeSort(newLists1Merge);
        tableData[0][5] = quickTSort(newLists1Quickt,newLists1Quickt[0],newLists1Quickt[newLists1Quickt.length]);
        tableData[0][6] = heapSort(arrayToArrayList(newLists1Heap));
        tableData[0][7] = radixSort(arrayToArrayList(newLists1Radix));

        //creating random array on n size
        int[]  newListS2Selection = generateRandomArray(20000);

        //cloning the array
        int[] newLists2Insertion = new ArrayList(newListS1Selection);
        int[]  newLists2Bubble = new ArrayList(newListS1Selection);
        int[]  newLists2Merge = new ArrayList(newListS1Selection);
        int[] newLists2Quickt = new ArrayList(newListS1Selection);
        int[] newLists2Heap = new ArrayList(newListS1Selection);
        int[] newLists2Radix = new ArrayList(newListS1Selection);

        //sorting the array
        tableData[1][1] = selectionSort(newListS2Selection);
        tableData[1][2] = insertionSort(newLists2Insertion);
        tableData[1][3] = bubbleSort(newLists2Bubble);
        tableData[1][4] = mergeSort(newLists2Merge);
        tableData[1][5] = quickTSort(newLists2Quickt);
        tableData[1][6] = heapSort(newLists2Heap);
        tableData[1][7] = radixSort(newLists2Radix);

        //creating random array on n size
        int[] newListS3Selection = generateRandomArray(30000);

        //cloning the array
        int[] newLists3Insertion = new ArrayList(newListS1Selection);
        int[] newLists3Bubble = new ArrayList(newListS1Selection);
        int[] newLists3Merge = new ArrayList(newListS1Selection);
        int[] newLists3Quickt = new ArrayList(newListS1Selection);
        int[] newLists3Heap = new ArrayList(newListS1Selection);
        int[] newLists3Radix = new ArrayList(newListS1Selection);
        //sorting the array
        tableData[2][1] = selectionSort(newListS3Selection);
        tableData[2][2] = insertionSort(newLists3Insertion);
        tableData[2][3] = bubbleSort(newLists3Bubble);
        tableData[2][4] = mergeSort(newLists3Merge);
        tableData[2][5] = quickTSort(newLists3Quickt);
        tableData[2][6] = heapSort(newLists3Heap);
        tableData[2][7] = radixSort(newLists3Radix);

        //creating random array on n size
        int[] newListS4Selection = generateRandomArray(40000);

        //cloning the array
        int[] newLists4Insertion = new ArrayList(newListS1Selection);
        int[] newLists4Bubble = new ArrayList(newListS1Selection);
        int[] newLists4Merge = new ArrayList(newListS1Selection);
        int[] newLists4Quickt = new ArrayList(newListS1Selection);
        int[]  newLists4Heap = new ArrayList(newListS1Selection);
        int[] newLists4Radix = new ArrayList(newListS1Selection);

        //sorting the array
        tableData[3][1] = selectionSort(newListS4Selection);
        tableData[3][2] = insertionSort(newLists4Insertion);
        tableData[3][3] = bubbleSort(newLists4Bubble);
        tableData[3][4] = mergeSort(newLists4Merge);
        tableData[3][5] = quickTSort(newLists4Quickt);
        tableData[3][6] = heapSort(newLists4Heap);
        tableData[3][7] = radixSort(newLists4Radix);

        //creating random array on n size
        int[] newListS5Selection = generateRandomArray(50000);

        //cloning the array
        int[] newLists5Insertion = new ArrayList(newListS1Selection);
        int[] newLists5Bubble = new ArrayList(newListS1Selection);
        int[] newLists5Merge = new ArrayList(newListS1Selection);
        int[] newLists5Quickt = new ArrayList(newListS1Selection);
        int[] newLists5Heap = new ArrayList(newListS1Selection);
        int[] newLists5Radix = new ArrayList(newListS1Selection);

        //sorting the array
        tableData[4][1] = selectionSort(newListS5Selection);
        tableData[4][2] = insertionSort(newLists5Insertion);
        tableData[4][3] = bubbleSort(newLists5Bubble);
        tableData[4][4] = mergeSort(newLists5Merge);
        tableData[4][5] = quickTSort(newLists5Quickt);
        tableData[4][6] = heapSort(newLists5Heap);
        tableData[4][7] = radixSort(newLists5Radix);

        //creating random array on n size
        int[] newListS6Selection = generateRandomArray(60000);

        //cloning the array
        int[] newLists6Insertion = new ArrayList(newListS1Selection);
        int[] newLists6Bubble = new ArrayList(newListS1Selection);
        int[] newLists6Merge = new ArrayList(newListS1Selection);
        int[] newLists6Quickt = new ArrayList(newListS1Selection);
        int[] newLists6Heap = new ArrayList(newListS1Selection);
        int[] newLists6Radix = new ArrayList(newListS1Selection);

        //sorting the array
        tableData[5][1] = selectionSort(newListS6Selection);
        tableData[5][2] = insertionSort(newLists6Insertion);
        tableData[5][3] = bubbleSort(newLists6Bubble);
        tableData[5][4] = mergeSort(newLists6Merge);
        tableData[5][5] = quickTSort(newLists6Quickt);
        tableData[5][6] = heapSort(newLists6Heap);
        tableData[5][7] = radixSort(newLists6Radix);

        //outputing the data
        System.out.format("%6s  %10s%10s%7s%6s%7s%5s%6s\n%5s  %6s%10s%10s%7s%6s%7s%5s\n"
                + "%6d  %5d%10d%10d%7d%6d%6d%5d\n%6d  %5d%5d%5d%5d%5d%5d%5d\n%6d%5d%5d%5d%5d%5d%5d%5d\n%6d%5d%5d%5d%5d%5d%5d%5d\n%6d%5d%5d%5d%5d%5d%5d%5d\n%6d%5d%5d%5d%5d%5d%5d%5d\n", stringData[0][0], stringData[0][1], stringData[0][2],
                stringData[0][3], stringData[0][4], stringData[0][5],
                stringData[0][6], stringData[0][7], stringData[1][0],
                stringData[1][1], stringData[1][2], stringData[1][3],
                stringData[1][4], stringData[1][5], stringData[1][6],
                stringData[1][7], tableData[0][0], tableData[0][1], tableData[0][2], tableData[0][3], tableData[0][4], tableData[0][5], tableData[0][6], tableData[0][7], tableData[1][0], tableData[1][1], tableData[1][2], tableData[1][3], tableData[1][4], tableData[1][5], tableData[1][6], tableData[1][7], tableData[2][0], tableData[2][1], tableData[2][2], tableData[2][3], tableData[2][4], tableData[2][5], tableData[2][6], tableData[2][7], tableData[3][0], tableData[3][1], tableData[3][2], tableData[3][3], tableData[3][4], tableData[3][5], tableData[3][6], tableData[3][7], tableData[4][0], tableData[4][1], tableData[4][2], tableData[4][3], tableData[4][4], tableData[4][5], tableData[4][6], tableData[4][7], tableData[5][0], tableData[5][1], tableData[5][2], tableData[5][3], tableData[5][4], tableData[5][5], tableData[5][6], tableData[5][7]);
    }
    private static ArrayList<Integer>[] bucket = new ArrayList[10];
    
public static List<Integer> arrayToArrayList(int[] array){
    ArrayList<Integer> list = new ArrayList<Integer>(array.length);
for (int i = 0; i < array.length; i++) 
  list.add(Integer.valueOf(array[i]));

return list;
}

    public static int[] generateRandomArray(int n) {
        int[] list = new int[1000];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list[i]=(random.nextInt(1000));
        }
        return list;
    }

  public static void selectionSort(int[] arr) {
        int i, j, minIndex, tmp;
        int n = arr.length;
        for (i = 0; i < n - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
        }
    }

    public static void radixSort(int[] input) {
        final int RADIX = 10;
        // declare and initialize bucket[]
        List<Integer>[] bucket = new ArrayList[RADIX];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<Integer>();
        }

        // sort
        boolean maxLength = false;
        int tmp = -1, placement = 1;
        while (!maxLength) {
            maxLength = true;
            // split input between lists
            for (Integer i : input) {
                tmp = i / placement;
                bucket[tmp % RADIX].add(i);
                if (maxLength && tmp > 0) {
                    maxLength = false;
                }
            }
            // empty lists into input array
            int a = 0;
            for (int b = 0; b < RADIX; b++) {
                for (Integer i : bucket[b]) {
                    input[a++] = i;
                }
                bucket[b].clear();
            }
            // move to next digit
            placement *= RADIX;
        }
    }

    public static void bubbleSort(int[] A) {
        for (int i = 0, k; i < A.length - 1; i++) {
            for (k = A.length - 1; k > i; --k) {
                if (A[k] < A[k - 1]) {
                    swap(A, k, k - 1);
                }
            }
        }
    }

    private static void swap(int[] input, int a, int b) {
        int tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }

    public static void mergeSort(int[] list) {
        if (list.length > 1) {
            // Merge sort the first half
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            // Merge sort the second half
            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2,
                    secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);

            // Merge firstHalf with secondHalf into list
            merge(firstHalf, secondHalf, list);
        }
    }

    public static void merge(int[] list1, int[] list2, int[] temp) {
        int current1 = 0; // Current index in list1
        int current2 = 0; // Current index in list2
        int current3 = 0; // Current index in temp

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1] < list2[current2]) {
                temp[current3++] = list1[current1++];
            } else {
                temp[current3++] = list2[current2++];
            }
        }

        while (current1 < list1.length) {
            temp[current3++] = list1[current1++];
        }

        while (current2 < list2.length) {
            temp[current3++] = list2[current2++];
        }
    }

    public static void quickSort(int[] input) {
        quickSort(input, 0, input.length - 1);
    }

    private static void quickSort(int[] input, int first, int last) {
        if (first < last) {
            int pivot = partition(input, first, last);
            quickSort(input, first, pivot - 1);
            quickSort(input, pivot + 1, last);
        }
    }

    private static int partition(int[] input, int first, int last) {
        int pivot = first + new Random().nextInt(last - first + 1);
        swap(input, pivot, last);
        for (int i = first; i < last; i++) {
            if (input[i] <= input[last]) {
                swap(input, i, first);
                first++;
            }
        }
        swap(input, first, last);
        return first;
    }

    public static void heapSort(int[] input) {
        // convert input to heap
        int leastParent = (input.length - 1) / 2;
        for (int i = leastParent; i >= 0; i--) {
            moveDown(input, i, input.length - 1);
        }
        // flatten heap into sorted array
        for (int i = input.length - 1; i > 0; i--) {
            if (input[0] > input[i]) {
                swap(input, 0, i);
                moveDown(input, 0, i - 1);
            }
        }
    }

    private static void moveDown(int[] input, int first, int last) {
        int largest = 2 * first + 1;
        while (largest <= last) {
            // right child exists and is larger than left child
            if (largest < last && input[largest] < input[largest + 1]) {
                largest++;
            }
            // right child is larger than parent
            if (input[largest] > input[first]) {
                swap(input, largest, first);
                // move down to largest child
                first = largest;
                largest = 2 * first + 1;
            } else {
                return;// force exit
            }
        }
    }
}
