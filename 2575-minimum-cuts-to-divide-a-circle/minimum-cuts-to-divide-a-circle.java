class Solution {
    public int numberOfCuts(int s) {
        if (s == 1) return 0;
        if (s % 2 == 0) return s / 2;
        return s;
    }
}