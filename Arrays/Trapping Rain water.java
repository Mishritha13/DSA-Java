// TC = O(n) SC = O(n)
/*
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] maxleft = new int[n];
        for(int i=1;i<n;i++){
            maxleft[i]=Math.max(height[i-1],maxleft[i-1]);

        }
        int[] maxright = new int[n];
        for(int i=n-2;i>=0;i--){
            maxright[i]=Math.max(height[i+1],maxright[i+1]);
        }
        int trapwater=0;
        for(int i=0;i<n;i++){
            int currentwater=Math.min(maxleft[i],maxright[i])-height[i];
            if(currentwater<0) currentwater=0;
            trapwater+=currentwater;
        }
        return trapwater;
    }
}
*/
// TC = O(n) SC = O(n)
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left=0,right=n-1;
        int leftmax=0,rightmax=0,trapwater=0;
        while(left<=right){
            if(height[left]<=height[right]){
                if(height[left]>=leftmax){
                    leftmax=height[left];
                }
                else{
                    trapwater+=leftmax-height[left];
                  
                }
                left++;
            }
        else{
            if(height[right]>rightmax){
                rightmax=height[right];
            }
            else{
                trapwater+=rightmax-height[right];
            }
            right--;
        }
        }
        return trapwater;
    }
}
