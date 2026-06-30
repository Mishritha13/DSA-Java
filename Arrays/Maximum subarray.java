// Brute force TC = O(N^3) SC = O(1)
/*
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<nums.length;j++){
                int prod=1;
                for(int k=i;k<=j;k++){
                    prod=prod*nums[k];
                }
                max=Math.max(max,prod);
            }
        }
        return max;
        
    }
}
*/
/*
// Better approach TC = O(N^2) SC = O(1)
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int prod=1;
            for(int j=i;j<n;j++){
                prod=prod*nums[j];
                max=Math.max(max,prod);
            }
        }
        return max;
    }
}
*/
// optimal sol'n TC = O(N) SC = O(1)
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int pre=1, suff =1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(pre==0) pre=1;
            if(suff==0) suff=1;
            pre*=nums[i];
            suff*=nums[n-i-1];
            ans=Math.max(ans,Math.max(pre,suff));
        }
        return ans;
    }
}

