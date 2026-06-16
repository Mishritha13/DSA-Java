// brute force TC = O(n^3) SC = O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum =0;
            for(int k=i;k<=j;k++){
                sum+=nums[k];
                maxi=Math.max(sum,maxi);
            }
            }
        }
        return maxi;
        
    }
}

// better soln  TC = O(N^2), SC = O(1) 

class Solution {
    public int maxSubArray(int[] nums) {
        int maxi= Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                maxi=Math.max(sum,maxi);
            }
        }
        return maxi;
    }
}

// optimal soln = TC=O(n), Sc = O(1) using KADANE'S ALGORITHM
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        if(sum> maxi){
            maxi=sum;
        }
        if(sum<0){
            sum=0;
        }
        }
        return maxi;
    }
}
