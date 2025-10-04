public class _7_PrefixSum {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        int prefix[] = new int [5];
        int maxSum = Integer.MIN_VALUE;

        prefix[0] = array[0];

        for(int i = 1; i<array.length; i++){
            prefix[i] = prefix[i-1] + array[i];
        }

        for(int start = 0; start<array.length; start++){
            for(int end = start; end<array.length; end++ ){
                int sum = 0;
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(sum>maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }
} 
