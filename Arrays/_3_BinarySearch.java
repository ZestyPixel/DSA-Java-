public class _21_BinarySearch {
    public static void main(String[] args) {
        //Linear search - Go over all elements from one side one by one
        //Binary search (prerequisite - elements must be sorted) 
        //In Binary search we compare the middle element to the required one and keep dividing the elements into two parts until we get it.
        int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int key = 10;
        int start = 0;
        int end = a.length-1;
        boolean found = false;
        while(start<=end){
            int mid = start + (end-start)/2;
            if (a[mid] == key){
                System.out.println(mid);
                found = true;
                break;
            }
            else if(a[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }

        }
        if(!found) System.out.println("Element is not in array.");
    }
}
