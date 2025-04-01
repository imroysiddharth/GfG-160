package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class FindMajority {
     public static List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int req = nums.length/3 ;
        TreeMap<Integer,Integer> hm  = new TreeMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        
        for(Integer i : hm.keySet()){
            if(hm.get(i)>req){
                ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        List<Integer> ans  = findMajority(arr);
        System.out.println(ans);
    }
}
