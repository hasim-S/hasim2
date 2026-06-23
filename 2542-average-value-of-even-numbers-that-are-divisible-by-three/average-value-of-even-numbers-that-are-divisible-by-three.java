class Solution {
    public int averageValue(int[] nums) {
        int cnt=0;
        int tot=0;
        for(int i:nums){
            if(i%2==0 && i%3==0){
                tot+=i;
                cnt+=1;
            }
        }
        return cnt>0?tot/cnt:0;
    }
}