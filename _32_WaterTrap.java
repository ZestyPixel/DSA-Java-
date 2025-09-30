public class _32_WaterTrap {
    
    public static int watertrap(int height []){//Two pointer approach
        if(height == null || height.length < 3) return 0; //If it's an empty array or the array has only two elements and thus cannot trap water.

        int trappedWater = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[0];
        int rightMax = height[height.length-1];
        while(left<right){
            if(leftMax<rightMax){
                left++;
                leftMax = Math.max(leftMax, height[left]);
                trappedWater += leftMax - height[left];
            }
            else{
                right--;
                rightMax = Math.max(height[right], rightMax);
                trappedWater += rightMax-height[right];
            }
        }
        return trappedWater;
    }
    
    // public static int watertrap(int height []){
    //     int leftMax [] = new int [height.length] ;
    //     leftMax[0] = height[0];
    //     for(int i=1; i< height.length; i++){
    //         leftMax[i] = Math.max(height[i], leftMax[i-1]);
    //     }

    //     int rightMax[] = new int [height.length];
    //     rightMax[height.length-1] = height[height.length-1];
    //     for(int i=height.length-2; i>= 0; i--){
    //         rightMax[i] = Math.max(height[i], rightMax[i+1]);
    //     }

    //     int trappedWater = 0;
    //     for(int i = 0; i<height.length; i++){
    //         int waterLevel = Math.min(leftMax[i],rightMax[i]);
    //         trappedWater += waterLevel - height[i];
    //     }
    //     return trappedWater;

    // }
    public static void main(String[] args) {
        int height []= {4, 2, 0, 3, 2, 5};
        int level = watertrap(height);
        System.out.println(level);
    }
}
