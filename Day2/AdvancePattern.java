package Day2;

import java.util.Scanner;

public class AdvancePattern {


    /* * * * * * *
       *         *
       *         *
       *         *
       * * * * * *
     */

    public static void HallowPattern(int row, int col){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= col; j++){
                if (i == 1 || j == 1 || i == row || j == col) {
                    System.err.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /*
                  *
                * *
              * * *
            * * * *
     */

    public static void interRightAngle(int row, int col){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row - i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    /*
      
       1 2 3 4 5 
       1 2 3 4
       1 2 3
       1 2 
       1
    
     */

    public static void printNumber(int row, int col){
        for(int i = 1; i <= row ; i++){
            for(int j = 1 ; j <= col-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }



    /*
    
      1 
      2 3
      4 5 6
      7 8 9 10

     */
    public static void increaseNumber(int row, int col){
        int count = 1; 
        for(int i = 1;  i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(count);
                count++;
            }
            System.err.println();
        }
    }

    /* 
       1 
       0 1
       1 0 1
       0 1 0 1
       1 0 1 0 1
     */
    public static void zeroOne(int row, int col){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < i; j++){
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }


    // H/W Try Your Self 

    /*
     1 -> 
         *             *
         * *         * *
         * * *     * * *
         * * * * * * * *
         * * * * * * * *
         * * *     * * *
         * *         * *
         *             *
     
     2 -> 
            * * * * *
           * * * * *
          * * * * *
         * * * * *
    
     3 -> 
                    * * * * * *
                   *         *
                  *         *
                 *         *
                *         *
               * * * * * *
            
     4 ->            *
                   * * *
                 * * * * * 
               * * * * * * * 
               * * * * * * *
                 * * * * *
                   * * *
                     *
    
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Row : ");
        int row = sc.nextInt() ; 

        System.out.println("Enter the Size of column : ");
        int col = sc.nextInt();
        
        System.out.println("Hallow Pattern : ");
        HallowPattern(row, col);


        System.out.println("Interted Reactangle : ");
        interRightAngle(row, col);


        System.out.println("Number Pattern : ");
        printNumber(row, col);

        System.out.println("Increase Number : ");
        increaseNumber(row, col);

        System.out.println("Zero One Pattern : ");
        zeroOne(row, col);
    }
}
