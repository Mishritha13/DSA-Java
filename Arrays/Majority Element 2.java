// Brute force TC = O(n^2) SC = O(2)=O(1)
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(list.size()==0 || list.get(0)!=nums[i]){
                int count=0;
                for(int j=0;j<nums.length;j++){
                    if(nums[j]==nums[i]){
                        count++;
                    }
                }
                if(count>nums.length/3){
                    list.add(nums[i]);
                }
            }
            if(list.size()==2)
            break;
            
            }
            return list;
    }
}

// better soln = TC = O(n) SC = O(n)

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int repeat = nums.length/3+1;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])==repeat){
                result.add(nums[i]);
            }
            if(result.size()==2) break;
        }
        return result;
    }
}

// Optimal soln TC = O(n)+O(n)=O(n) SC = O(1)
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0,cnt2=0;
        int el1=Integer.MIN_VALUE, el2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && el2!=nums[i]){
                cnt1=1;
                el1=nums[i];
            }
            else if(cnt2==0 && el1!=nums[i]){
                cnt2=1;
                el2=nums[i];
            }
            else if(nums[i]==el1) {
                cnt1++;
            }
            else if(nums[i]==el2){
                cnt2++;
            } else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el1) cnt1++;
            if(nums[i]== el2) cnt2++;
        }
        int mini = nums.length/3+1;
        List<Integer> res = new ArrayList<>();
        if(cnt1>=mini) res.add(el1);
        if(cnt2>=mini&& el1!=el2) res.add(el2);
        return res;
    }
}

