class Solution {
    public int minCostToMoveChips(int[] p) {
        int even = 0;
        int odd = 0; 

        for (int i = 0; i < p.length; i++) {
            if (p[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        if (odd < even) {
            return odd;
        } else {
            return even;
        }
    }
}