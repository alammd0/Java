package Day3;

import java.util.Scanner;

public class arrayBasic {
    public static void main(String[] args) {
        // array Creation
        int numbers[] = new int[20];

        // input
        numbers[0] = 10;
        numbers[1] = 30;
        numbers[2] = 50;

        // output
        System.out.println(numbers.length); // 20 Beacuse the creation is 20 length

        System.out.println(numbers[2]);

        int num[] = { 10, 20, 30, 40 }; //

        // array Using Loop
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the Array Element : ");
        // array Element from user side (input side)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Printing the Array Elemet : ");
        // array element form output Side
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
