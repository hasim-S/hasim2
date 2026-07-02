import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>h=new HashSet<>();
        for(int n:nums){
            if(h.contains(n)){
                return true;
            }
            h.add(n);
        }
        return false;
    }
}