class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> m=new HashSet<>();
        for(int i:nums){
            m.add(i);
        }
        for(int i=0;i<=nums.length;i++){
            if(!m.contains(i)){
                return i;
            }
        }
        return 0;

    }
}