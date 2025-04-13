package com.sample.tek;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  Arrays
 * Write a function that takes an array of integers and returns the maximum sum of any contiguous subarray.
 */
public class ArraysSubSum {

     public static void main(String[] args){
         Scanner in=new Scanner(System.in);
         int[] nums= Arrays.stream(in.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
         int len=nums.length;
         if(len==0) return;
         int cursum=nums[0];
         int maxsum=nums[0];
         for(int i=1;i<len;i++){
             cursum=Math.max(cursum+nums[i],nums[i]);
             maxsum=Math.max(maxsum,cursum);
         }

         System.out.println(maxsum);

     }

}
