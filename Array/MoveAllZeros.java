package Array;

public class MoveAllZeros {
     static void pushZerosToEnd(int[] arr) {
        // code here
       int i= 0 ;
       int j = 0 ;
       while(i<arr.length && j<arr.length){
        if(arr[i]!=0)i++;
        if(arr[j]!=0 && i<j){
            int t = arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
        j++;
       }
    
    }
    public static void main(String[] args) {
        int arr[]= {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
