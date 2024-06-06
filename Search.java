import java.util.*;
public class Search {
    //Search is a way to search target in an array or a string
    //There are two ways of doing this.
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int target = 3, t2 = 3;
        System.out.println(linearSearch(arr,target));
        System.out.println(binarySearch(arr,target));
        System.out.println(linearSearch(arr,t2));
        System.out.println(binarySearch(arr,t2));
        System.out.println(OrAgBS(arr,target));
    }
    //Linear Search
    //O(n) - time complexity
    //O(1) - space complexity
    /*
    checking each and every element in the array in iteration
     */
    public static boolean linearSearch(int[] a,int b) {
        for (int j=0;j<a.length;j++) {
            if (b == a[j]) {
                return true;
            }
        }
        return false;
    }
    //Binary Search
    //O(logN) - time
    //O(1) - space
    //Binary Search is only for sorted arrays
    /*
    1. Find the middle element
    2. If middle element > target then choose 1st half else choose 2nd half
    3. If middle element == target // ends
     */
    public static boolean binarySearch(int[] a,int b){
        Arrays.sort(a);
        int start = 0;
        int end = a.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(a[mid] > b) end = mid - 1;
            else if(a[mid] < b) start = mid + 1;
            else return true;
        }
        return false;
    }
    //Order Agnostic Binary Search
    //for unknown order
    public static boolean OrAgBS(int[] a, int b){
        int start = 0;
        int end = a.length - 1;
        boolean isAsc = a[start] < a[end];
        while(start <= end){
            int mid = start + (end-start)/2;
            if(a[mid] == b) return true;
            if(isAsc){  //for ascending order
                if(a[mid] > b) end = mid - 1;
                else start = mid + 1;
            }
            else{    //descending order
                if(a[mid] < b) end = mid - 1;
                else start = mid + 1;
            }
        }
        return false;
    }
}
