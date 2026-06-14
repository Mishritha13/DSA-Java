
//brute force tc = O(nxmxk)(num1.length+num2.lenngth+k(ans.contains where k is the no. of elements already in ans...wrost case min(n,m))=O(n,m,min(n,m))).....s.c = vis[]=O(m)+res =O(K)=(O(m+k))
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean vis[] = new boolean[nums2.length];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i]==nums2[j] && vis[j]==false){
                    if(!ans.contains(nums1[i])){
                    ans.add(nums1[i]);
                    }
                    vis[j]=true;
                    break;
                }
                
            }
        }
    
        int[] res = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;

    }
}

// optimal sol Time: O(n + m) , Space: O(n)
import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        int[] ans = new int[result.size()];
        int i = 0;

        for (int num : result) {
            ans[i++] = num;
        }

        return ans;
    }
}
