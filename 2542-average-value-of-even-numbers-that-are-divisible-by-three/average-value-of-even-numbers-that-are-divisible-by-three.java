class Solution {
    public int averageValue(int[] nums){
        int sum=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%6==0){
                sum+=nums[i];
                n++;
            }
        }
        return (n==0)?0:sum/n;
    }
}