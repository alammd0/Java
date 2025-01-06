package Day4;

import java.util.Arrays;

public class dayQues {
    // 1. Second Largest Element in given Array
    // I -> Sort method
    public static int sortMethod(int arr[]) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int n = arr.length;

        for (int i = n - 2; i > 0; i--) {
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }

        return -1;
    }


    //II->  Pass Method
    public static int passMethod(int arr[]){
        int larget = Integer.MIN_VALUE ; 
        for(int i = 0 ; i < arr.length; i++){
            larget = Math.max(larget, arr[i]);
        }

        int sndLarget = -1;
        for(int i = 0 ; i < arr.length; i++){
            if (arr[i] >= sndLarget && arr[i] != larget) {
                sndLarget = arr[i] ; 
            }
        }

        return sndLarget ;
    } 

    //  2. Move all zero end in given array
    //  I. Method  Temporary Method 
    public static void tempArray(int arr[]){
        int n = arr.length ; 
        int temp[] = new int[n] ; 

        int idx = 0 ;

        for(int i = 0 ; i < n ; i++){
            if (arr[i] != 0) {
                temp[idx] = arr[i];
                idx++;
            }
        }

        while (idx < n) {
            temp[idx++] = 0 ;  
        }

        // compy element temp to original
        for(int i = 0 ; i < n ; i++){
            arr[i] = temp[i];
        }
    }

    // II. method
    public static void countMethod(int arr[]){
        int count = 0 ;
        int n = arr.length ; 
        
        for(int i = 0; i < n; i++){
            if (arr[i] != 0) {
                arr[count] = arr[i] ; 
                count++;
            }
        }

        while (count < n) {
            arr[count] = 0;
            count++;
        }

    }

    // 3. I -> Missing Number - leectcode(268)
    public static int missingNumber(int arr[]){
        int n = arr.length ;

        int sum1 = n * ((n+1) / 2);

        System.out.println("Sum -> " + sum1);

        int sum2 = 0 ;
        for(int i = 0 ; i < n ; i++){
            sum2 += arr[i] ; 
        }
        return sum1 - sum2 ; 
    }

    // 3. II-> Index method 
    public static int missinNumberIdx(int arr[]){
        int ans = -1 ; 

        for(int i = 0; i < arr.length; i++){
            if( i != arr[i]){
                ans = i ;
            }
        }

        return ans ;
    }

    // 4.I-> Duplicate Number - 287 (leetcode)
    public static void findDuplicate(int arr[]){
        Arrays.sort(arr);

        for(int i = 0; i < arr.length-1; i++){
            if (arr[i] == arr[i+1]) {
                System.out.println("Duplicate are = " + arr[i]);
            }
        }
    }

    //II-> duplicate Number -> Negative method or visited Method 
    public static int findDuplicatend(int arr[]){
        int ans = 0 ; 

        for(int i = 0 ; i < arr.length; i++){
            int indx = Math.abs(arr[i]) ;
            if (arr[indx] < 0) {
                ans = indx ;
            }
            arr[indx] *= -1;
        }
        return ans;
    }
    // 5 -> Sort color - leetcode try your Self

    public static void main(String[] args) {
        // int arr[] = { 12, 35, 1, 10, 34, 1 };

        // // int ans = sortMethod(arr);

        // int ans2 = passMethod(arr) ;

        // System.out.println("Our 2nd Larget = " + ans2);


        // int arr[] = {1, 2, 0, 4, 3, 0, 5, 0} ; 

        // // tempArray(arr);
        // countMethod(arr);

        // for(int i = 0; i < arr.length ; i++){
        //     System.out.print(arr[i] + " ");
        // }

        // int arr[] = {3, 0, 1} ; 
        // // int ans = missingNumber(arr); 

        // int ans = missinNumberIdx(arr);

        // System.out.println(ans);

        int arr[] = {1, 3, 4, 2, 2} ; 
        // findDuplicate(arr);

        int ans = findDuplicatend(arr);

        System.out.println(ans);
    }
}
