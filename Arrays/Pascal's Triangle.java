// Time Complexity: O(n³) Space Complexity: O(n²) (or Auxiliary Space: O(1))
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                row.add(ncr(i,j));
            }
            ans.add(row);
        }
        return ans;
    }

        public int ncr(int n , int r ){
            long res = 1;
            r= Math.min(r,n-r);
                for(int i=0;i<r;i++){
                    res=res*(n-i);
                    res=res/(i+1);
                }
                return (int) res;
            }
}

        
    
