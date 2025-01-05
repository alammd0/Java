package Day1;

import java.util.Scanner;

public class conditionStatement {
    public static void main(String[] args) {
        // 1 -> Largest of 2-num 
        Scanner sc = new Scanner(System.in) ; 
        
        System.out.println("Enter the first Number : ");
        int first = sc.nextInt() ; 

        System.out.println("Enter the 2nd Number : ");
        int snd = sc.nextInt() ; 

        if (first > snd) {
            System.out.println("first is greater than snd");
        }
        else{
            System.out.println("snd greater than first");
        }

        // try your self
        // max of three number
        // check given Number is Odd Even 
        // Baki check Out The notes 
    }
}
