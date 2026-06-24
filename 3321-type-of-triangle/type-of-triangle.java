public class Solution {
    public String triangleType(int[] n) {
        int a = n[0], b = n[1], c = n[2];

        if (a + b <= c || a + c <= b || b + c <= a)
            return "none";

        if (a == b && b == c)
            return "equilateral";

        if (a == b || b == c || a == c)
            return "isosceles";

        return "scalene";
    }
}