// Brute force = TC = O(n^2)...worst case = O(n^3) , SC = O(1)

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int longest=1;
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            int cnt=1;
            while(linearsearch(nums,x+1)==true){
                x=x+1;
                cnt=cnt+1;
            }
            longest = Math.max(longest,cnt);
        }
        return longest;
    }
    public boolean linearsearch( int[] nums, int x){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
            return true;
        }
        
    }
    return false;
        
    }
}
// Better TC = O(n log n) Sc = O(1)

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
        return 0;
    }
        Arrays.sort(nums);
        int cnt =0;
        int lastSmall=Integer.MIN_VALUE;
        int longest=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==lastSmall){
            
                cnt++;
            lastSmall=nums[i];
        }
        
        if(nums[i]!=lastSmall){
            cnt=1;
            lastSmall=nums[i];
            }
    longest=Math.max(longest,cnt);
    }
        
    
    return longest;
        }
}

// OPTIMAL SOLN Time Complexity: O(n) Space Complexity: O(n)
class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        int longest=1;
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }
        for(int it:st){
            if(!st.contains(it-1)){
                int cnt=1;
                int x =it;
                while(st.contains(x+1)){
                    x++;
                    cnt++;
                }
                longest=Math.max(longest,cnt);
            }
        }
        return longest;
    }
}



