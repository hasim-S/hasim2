class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int a = 0;
        

        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2 == 0){
                a++;
            }
        }

        return a>=2?true:false; 
    }
}