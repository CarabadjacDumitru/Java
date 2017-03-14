package ArrayChallenge;

import java.util.Scanner;

public class ArrayClass {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int [] asd = getIntegers(5);
        sortIntegers(asd);
        printArray(asd);

    }

    public static int[] getIntegers(int capacity) {
        int[] arr = new int[capacity];

        System.out.println("Please enter " + capacity + "int values: \r");

        for(int i=0;i<capacity;i++){
            arr[i]=scanner.nextInt();
        }
        return arr;
    }

    public static int[] sortIntegers(int[] arrToSort) {
        int[] sortedArr = arrToSort;
        int temp=0;

        for (int i = 0; i < arrToSort.length; i++) {
            for (int j = 0; j < arrToSort.length; j++) {
                if (sortedArr[i]>sortedArr[j]) {
                    temp = sortedArr[j];
                    sortedArr[j] = sortedArr[i];
                    sortedArr[i] = temp;
                }
            }
        }
        return sortedArr;
    }

    public static void printArray(int[] toPrint){
        for (int tt:toPrint) {
            System.out.println(tt);
        }
    }
}