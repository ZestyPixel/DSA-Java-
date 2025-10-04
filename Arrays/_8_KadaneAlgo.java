public class _8_KadaneAlgo {
    public static void main(String[] args) {
        //THE BASIC CONCEPT IS THE MOMENT THE CURRENT SUM BECOMES NEGATIVE, JUST MAKE IT 0 AND PROCEED

        int arr [] = {-2,-3,4,-1,-2,1,5,-3};
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i = 0; i<arr.length;i++){
            currentSum += arr[i];
            if(currentSum<0){
                currentSum = 0;
            }
            if(maxSum<currentSum){
                maxSum = currentSum;
            }
        }
        System.out.println(maxSum);
    }
}
