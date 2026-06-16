 //brute force Tc = O(n^2) 
class Solution {
    public int majorityElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int cnt=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==nums[i]) cnt++;
            }
            if(cnt>(nums.length/2)) return nums[i];
        }
        return -1;
        
    }
}
// better approach TC = 0(n), SC = O(n) 
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > nums.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}

// optimal sol'n TC = O(n), SC = O(1)
class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int el =0;
        for(int i=0;i<nums.length;i++){
            if(cnt==0){
                cnt=1;
                el= nums[i];
            }
            else if(el==nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return el;
    }
}


