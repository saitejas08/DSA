import java.util.*;

public class Sort {
    public static void main(String[] args) {
        int[] num = {9,4,6,2,4,8,1,0};
        bubble(num);
        System.out.println(Arrays.toString(num));
        int[] nums = {3,8,1,6,9,2,9,2};
        selection(nums);
        System.out.println(Arrays.toString(nums));
    }
    //Bubble sort
    /* ***
    Space Complexity is O(1)
    Time Complexity is O(N) to O(N^2) (best - worst)
    Stable Algorithm
    also known as exchange sort or sinking sort
     */
    public static void bubble(int[] a){
        boolean swapped;
        for(int i = 0; i < a.length; i++){
            swapped = false;
            for(int j = 1; j < a.length - i; j++){
                if(a[j] < a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                    swapped = true;
                }
            }
            // if no swap occurs that implies array is sorted
            if(!swapped){
                break;
            }
        }
    }

    //selection sort
    /* ***
    Space complexity is O(1)
    Time complexity is  O(N^2)
    Unstable algorithm
     */
    public static void selection(int[] a){
        for(int i = 0; i < a.length; i++){
            int last = a.length - i - 1;
            int max = getMaxTerm(a,0, last);
            swap(a,max,last);
        }
    }
    public static int getMaxTerm(int[] a, int start, int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(a[max] < a[i]){
                max = i;
            }
        }
        return max;
    }
    public static void swap(int[] a, int i, int l){
        int temp = a[i];
        a[i] = a[l];
        a[l] = temp;
    }

    //insertion sort
    /* ***

     */
    public static void insertion(int[] a){

    }

    //cyclic sort
    /* ***

     */
    public static void cyclic(int[] a){

    }

}
