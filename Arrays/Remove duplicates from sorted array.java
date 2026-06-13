//brute force T.c = O(N) , s.c  = O(N) ( taking extra space)
class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.contains(num)){
            set.add(num);
        nums[index]=num;
        index++;
            }
        }
        return index;
    }
}

// optimal T.c = O(N) , s.c = O(1)
class Solution{
    public int removeDuplicates(int[] nums){
        int i =0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
