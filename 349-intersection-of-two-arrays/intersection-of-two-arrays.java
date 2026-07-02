class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>m=new HashSet<>();
        HashSet<Integer>s=new HashSet<>();
        for(int i:nums1){
            m.add(i);
        }
        for(int i:nums2){
            if(m.contains(i)){
            s.add(i);
            }

        }
        int[] h=new int[s.size()];
        int index=0;
        for(int i:s){
            h[index++]=i;
        }
        return h;
    }
}