package BinarySearch;
//LeetCode 704
public class _1_BinarySearch {
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = (end-start/2) + start; //Mid needs to be calculated every time and also write it this way so that you never get an overflow error.
            if(target == nums[mid]){
                return mid;
            }else if(target<nums[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int x = search(arr, 4);
        System.out.println(x);
    }
}
