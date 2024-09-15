class A{


public static int maxSubArray(int[] arr){
    int large = arr[0];
 for(int i=0;i<arr.length;i++){
    int currSum=0;
    for(int j=i;j<arr.length;j++){
        currSum += arr[j];
        large = Math.max(currSum, large);
    }
 }

    return large;
}

    public static void main(String[] args) {
        int[] arr= {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubArray(arr));
    }
}