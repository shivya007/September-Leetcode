//2220. Minimum Bit Flips to Convert Number

class Solution {
    public int minBitFlips(int start, int goal) {
        int minbitflips = start ^ goal;
        int count =0;
        while( minbitflips > 0){
            count += minbitflips & 1;
            minbitflips = minbitflips >> 1; // OR (int) (minbitflips * ( 1 / Math.pow(2, 1)));
        }
        return count;
    }
}