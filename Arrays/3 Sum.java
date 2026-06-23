// Tc = O(n^2) SC = O(n)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer> hashset = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int k = -(nums[i]+nums[j]);
                if(hashset.contains(k)){
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],k);
                    Collections.sort(temp);
                    ans.add(temp);                    
                }
                hashset.add(nums[j]);

            }
        }
        return new ArrayList<>(ans);
    }
}

// Optimal soln = TC = O(n^2) Sc = O(n^2) (space without including output O(1))
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int left = i+1, right=nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                
            while(left<right && nums[left]==nums[left-1]) left++;
            while(left<right && nums[right]==nums[right+1]) right--;
            }
            else if (sum<0) left++;
            else right--;
        

        }
        }
    
    return ans;
}
    }

