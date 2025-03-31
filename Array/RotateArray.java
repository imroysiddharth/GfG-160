package Array;

public class RotateArray {
    static void reverse(int a[], int i,int j){
        while(i<j){
            int temp = a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
    static void rotateArr(int arr[], int d) {
        // add your code here
        d = d%arr.length;
        d =arr.length -d;
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
    }
    public static void main(String[] args) {
        int []a = {1, 2, 3, 4, 5};
        rotateArr(a, 2);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
