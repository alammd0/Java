package Day3;

import java.util.Scanner;

public class arrayQuestion {
    // 1. Linear Search
    // arr = [2, 4, 6, 8, 10, 12, 14] and key(element) = 12 -> output = 5
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // 2. largest Number
    // arr[] = {1, 2, 3, 4, 5, 6} larget -> 6
    public static int largetNumber(int arr[]) {
        int larget = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (larget < arr[i]) {
                larget = arr[i];
            }
        }

        return larget;
    }

    // 3. Reverse An array
    // arr[] = {2, 3, 4, 5, 6, 7} -> [7, 6, 5, 4, 3, 2]
    public static void reverArry(int arr[]) {
        int firstElement = 0;
        int lastElement = arr.length - 1;

        while (firstElement <= lastElement) {
            int temp = arr[lastElement];
            arr[lastElement] = arr[firstElement];
            arr[firstElement] = temp;
            firstElement++;
            lastElement--;
        }
    }

    // 4. Pairs in An array
    // array -> [2, 4, 6, 8, 10]
    // pairs -> 2 -> (2, 4), (2, 6), ............
    public static void printAllPairs(int arr[]){

        // total Count of the Pairs 
        int count = 0 ;

        int n = arr.length;
        for(int i = 0 ; i < n; i++){
            int curr = arr[i] ; 
            // System.out.println("Pairs Element start with : " + curr + " = ");
            for(int j = i+1; j < n; j ++){
                System.out.print(" ( " + curr + " , " + arr[j] + " ) ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total pairs of the : " + count);
    }

    // 5. print Sub Array
    // arr[] -> [2, 4, 6] 
    // sub Array 
    //  2 -> [2], [2, 4], [2, 4, 6]
    //  4 -> [4], [4, 6]
    // 6 -> [6]

    public static void printAllSubArrray(int arr[]){
        int n = arr.length ; 
        for(int i = 0; i < n; i++){
            int start = i ; 
            for(int j = i ; j < n; j++){
                int snd = j ;
                for(int k = start ; k < snd ; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // // try Your Self
    // 1. write a java Program to sort numeric
    // 2. write a java program to sum of element in array
    // 3. write a java program to find minimum and maximum
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array : ");
        int n = sc.nextInt();

        // System.out.println("Enter the Key Value :");
        // int key = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the Array Element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Element are there : ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        // int ans = linearSearch(arr, key);

        // System.out.println("Our searching element is There : " + ans);

        // int largetElement = largetNumber(arr);

        // System.out.println("Larget Number in given Array : " + largetElement);

        // reverArry(arr);

        // System.out.println("After the Reverse Array : ");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // printAllPairs(arr);

        printAllSubArrray(arr);

    }
}
