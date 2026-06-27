// Brute force Tc = O(n^2) wont work for all testcases, Sc = O(1)

class Solution {
    public int reversePairs(int[] nums) {
       int count=0;
        for(int i=0;i<nums.length-1;i++){
          
            for(int j=i+1;j<nums.length;j++){
                if((long)nums[i]>2L*nums[j]){
                    count++;
                }
            }
        }
        return count;
        
    }
}

// optimal TC = O(2nlog n) Sc = O(n)
class Solution {
        private static void merge(int[] arr , int low, int mid, int high){
            ArrayList<Integer> temp = new ArrayList<>();
            int left=low;
            int right=mid+1;
            while(left<=mid && right<=high){
                if(arr[left]<=arr[right]){
                    temp.add(arr[left]);
                    left++;
                }
                else{
                    temp.add(arr[right]);
                    right++;
                }
            }
                while(left<=mid){
                    temp.add(arr[left]);
                    left++;
                }
                while(right<=high){
                    temp.add(arr[right]);
                    right++;
                }
                for(int i=low;i<=high;i++){
                    arr[i]=temp.get(i-low);
                }
            }
            public static int countpairs(int[] arr , int low, int mid, int high){
                int right=mid+1;
                int cnt =0;
                for(int i=low;i<=mid;i++){
                    while(right<=high && (long) arr[i]> 2L * arr[right]) {
                        right++;
                }
                    cnt += (right-(mid+1));
                }
                return cnt;
            }
            public static int mergesort(int[] arr , int low, int high){
                int cnt =0;
                if(low>=high) return 0;
                int mid = (low+high)/2;
                cnt+=mergesort(arr,low,mid);
                cnt+=mergesort(arr,mid+1,high);
                cnt+=countpairs(arr,low,mid,high);
                merge(arr,low,mid,high);
                return cnt;
            }
            public int reversePairs(int[] nums){
                return mergesort(nums, 0 , nums.length-1);
            }
        }
    
