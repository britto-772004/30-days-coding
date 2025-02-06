// Problem Statement: Given an array of integers nums and an integer
// target , return indices of the two numbers such that they add up to
// target .
// Example:​
// Input: nums = [2, 7, 11, 15] , target = 9​
// Output: [0, 1] (because nums[0] + nums[1] = 2 + 7 = 9 )


// without using hash map 
package TwoSum;

import java.util.Arrays;

public class TwoSum{

    static int[] twosum(int[] arr,int target){
        int j = 0;
        int[] resultarr = new int[2];
        for(int i = 0; i<arr.length;i++){
            j = i +1;
            if (target == (arr[i] + arr[j])){
                resultarr[0] = i;
                resultarr[1] = j;
                return resultarr;
            }
        }
        return resultarr;

    }
    public static void main (String [] args ){
        int[] array = {11,15,2,7};
        int target = 9;
        int[] received_arr = twosum(array, target);
        System.out.println("output : "+ Arrays.toString(received_arr));
    }
}