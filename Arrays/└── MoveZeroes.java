// brute force
ArrayList<Integer> temp = new ArrayList<>();

for (int i = 0; i < arr.length; i++) {
    if (arr[i] != 0) {
        temp.add(arr[i]);
    }
}

for (int i = 0; i < temp.size(); i++) {
    arr[i] = temp.get(i);
}

for (int i = temp.size(); i < arr.length; i++) {
    arr[i] = 0;
}

//optimal

// Problem: Move Zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}

