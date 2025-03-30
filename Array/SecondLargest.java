package Array;
/*
    Constraints:
    2 ≤ arr.size() ≤ 105
    1 ≤ arr[i] ≤ 105
*/
public class SecondLargest{

    public static int getSecondLargest(int[] arr) {
        // Code Here
        int max = -1;
        int smax = -1;
        
        for(int i=0; i<arr.length ; i++){
            if(arr[i]>max){
                max=arr[i];
            } 
        }
        for(int i=0; i<arr.length ; i++){
            if(arr[i]>smax && arr[i]<max){
                smax=arr[i];
            }
        }
        return smax;
    }

    public static void main(String[] args) {
        int arr[]= {10,5,10};
        System.out.println(getSecondLargest(arr));
    }
}