package Array;

public class NextPermutation {
    static void nextPermutation(int[] arr) {
        // code here
        int i= arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1])i--;
        if(i>=0){
            int j = arr.length-1;
             
            while(arr[j]<=arr[i])j--;
            
            swap(arr,i, j);
        }
        reverse(arr,i+1,arr.length-1);
        
    }
    static void reverse(int arr[], int i , int j){
        while(i<j){
            int t = arr[i];
            arr[i]=arr[j];
            arr[j]=t ;
            i++;
            j--;
        }
    }
    static void swap(int []a ,int i,int j){
        int temp = a[i] ;
        a[i] = a[j] ;
        a[j] =temp;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,6,5,4};
        nextPermutation(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
