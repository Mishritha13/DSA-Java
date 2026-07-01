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
// To print the subarray elements 
class Solution {
    public static void maxSubArray(int[] nums) {
        int sum = 0, maxi = Integer.MIN_VALUE;
        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum > maxi) {
                maxi = sum;
                start = tempStart;
                end = i;
            }

            if (sum < 0) {
                sum = 0;
                tempStart = i + 1;
            }
        }

        System.out.println("Maximum Sum = " + maxi);
        System.out.print("Subarray: ");

        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
