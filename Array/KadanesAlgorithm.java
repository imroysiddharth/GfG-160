package Array;

public class KadanesAlgorithm{
    public static void main(String[] args) {
        int arr[]={2, 3, -8, 7, -1, 2, 3};
        // int arr[]={-2,-5};
        System.out.println(maxSubarraySum(arr));
    }
    static int maxSubarraySum(int[] nums) {
        // Your code here
        int maxSoFar= nums[0];
        int CurrmaxSum = nums[0];
        
        for(int i=1; i<nums.length ;i++){
           
            CurrmaxSum= Math.max(CurrmaxSum+nums[i],nums[i]);
            maxSoFar = Math.max(CurrmaxSum, maxSoFar);
            
        }
        return maxSoFar;
    }
}