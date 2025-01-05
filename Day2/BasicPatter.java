package Day2;

import java.util.Scanner;

public class BasicPatter {

    public static void rightAngle(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void rightAngleII(int row, int col){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numberPatter(int row, int col){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void printChar(int row, int col){
        char ch = 'A' ;
        
        for(int i = 1; i <= row ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Row Size : ");
        int row = sc.nextInt();

        System.out.println("Enter the col Size : ");
        int col = sc.nextInt();

        System.out.println("I");
        rightAngle(row, col);
        System.out.println("II");
        rightAngleII(row, col);

        System.out.println("III");
        numberPatter(row, col);

        System.out.println("IV");
        printChar(row, col);

    }
}
