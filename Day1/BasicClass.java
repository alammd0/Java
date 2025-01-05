package Day1;

import java.util.Scanner;

// Bioler Plate code =>
class BasicClass {
    public static void main(String[] args) {
        // Variables In Java
        // a = 10  a -> Variables and 10 is the value 
        // b = 20  b -> Variables and 20 is the value

        // calculate the sum of two Number from User input

        // This is user function to take User Input in Java
        Scanner sc = new Scanner(System.in);

        // Out in Java
        System.out.println("Enter the First Number :-> ");

        // input in java
        int a = sc.nextInt();

        System.out.println("Enter the 2nd Number :-> ");
        int b = sc.nextInt();
         
        int sum = a + b ;
        System.out.println("Sum of two Number is = " + sum);

        int mult = a * b ;
        System.out.println("Multiplication of two Number : " + mult);


        System.out.println("Enter the Radius Value : ");
        double r = sc.nextDouble() ; 

        double pi = 3.14f ;

        double ans = r * pi ;

        System.out.println("Circle of square : " + ans);
    }    
}