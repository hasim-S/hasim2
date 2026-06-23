class Solution {
    public int differenceOfSum(int[] nums) {
        int x=0;
        int y=0;
        for(int i=0;i<nums.length;i++){
            int t=nums[i];
            x +=t;
            while(t>0){
                y+=(t%10);
                t=t/10;
            }
        }
        return x>y?x-y:y-x;
        
    }
}