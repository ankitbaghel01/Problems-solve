import java.util.*;

class ArrayQuestions{


    // Find the Maximum Subarray Sum (Kadane’s Algorithm):

    // Problem: Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
    // Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    // Output: 6 (The subarray [4, -1, 2, 1] has the largest sum of 6)
    
// public static int maxSubArray(int[] arr){
 
// int large = arr[0];
// for(int i=0;i<arr.length;i++){
//     int count =0;
//     for(int j=i;j<arr.length;j++){
//         count += arr[j];

//         large = Math.max(count , large);
//     }
// }


// return large;
// }




// Two Sum
// Two Sum:

// Input: nums = [2, 7, 11, 15], target = 9
// Output: [0, 1] (Because nums[0] + nums[1] = 9)


// public static int[] twoSum(int[] arr, int target){
 
//      for(int i=1;i<arr.length;i++){
//        if(arr[i-1]+arr[i]==target){
//         return new int[] {i-1, i};
//        }
//      }

    
//     return new int[]{-1,-1};
// }




// Move Zeroes to the End:

// Input: nums = [0, 1, 0, 3, 12]
// Output: [1, 3, 12, 0, 0]

   
public static int[] moveZero(int[] arr){
  
    int a[] = new int[arr.length];
int t=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==0) {
            a[arr.length-1]=arr[i];
        }   else{
            a[t++]=arr[i];
                }
    
    }

   

    return a;
}




    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int a[] = moveZero(arr);
        System.out.println(Arrays.toString(a));  // Output the array of duplicates
    
    }
}

