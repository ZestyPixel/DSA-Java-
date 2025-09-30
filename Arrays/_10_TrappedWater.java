/*
    Trapping Rain Water Problem:

    For each bar in the height array, the water trapped above it depends on:
    - The tallest bar to its left (leftMax)
    - The tallest bar to its right (rightMax)

    Water trapped at index i = min(leftMax[i], rightMax[i]) - height[i]

    Time Complexity: O(n)
    Space Complexity: O(n) (can be reduced to O(1) using two pointers)
*/


public class _28_TrappedWater {
    public static int rainwater(int height[]){
        int leftMax []= new int [height.length];
        leftMax[0] = height[0];
        for(int i = 1; i<height.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        int rightMax[] = new int [height.length];
        rightMax[height.length-1] = height[height.length - 1];
        for(int i = height.length - 2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        for(int i = 0; i<height.length; i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    
    public static void main(String[] args) {
        int height []= {4,2,0,6,3,2,5};
        int r = rainwater(height);
        System.out.println(r);
    }
}
