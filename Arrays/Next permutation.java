//optimal siln TC = O(3n) , SC = O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            reverse(nums,0,nums.length-1);
            return;

        }
        for(int i=nums.length-1;i>=ind;i--){
            if(nums[ind]<nums[i]){
                swap(nums,i,ind);
                break;
            }
        }
        reverse(nums,ind+1,nums.length-1);

        }
        
    

private void reverse(int[] nums, int start, int end){
    while(start<end){
        swap(nums,start,end);
        start++;
        end--;
    }
}
private void swap(int[] nums, int i, int j){
    int temp=nums[i];
    nums[i]=nums[j];
    nums[j]=temp;
}
}
