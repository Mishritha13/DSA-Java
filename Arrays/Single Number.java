// brute force t.c = O(n^2), s.c = O(1)
class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==num){
                    count++;
                }
                
           
            }
            if(count==1) return num;
           
        }
         return -1;
        
    }
}
// better approach t.c = O(3N) , sc = O(max) 

class Solution {
    public int singleNumber(int[] nums) {
        int n = arr.length;

        // Step 1: Find maximum element
        int maxi = arr[0];
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        // Step 2: Create frequency array of size maxi+1
        int[] hash = new int[maxi + 1];

        // Step 3: Count frequencies
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // Step 4: Find element with frequency = 1
        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1)
                return arr[i];
        }

        return -1; // fallback
    }
    
// optimal t.c = O(N), s.c = O(1)
class Solution {
    public int singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
}


