class Solution {
    public int minimizeXor(int num1, int num2) {

        int x = 0;

        int setBitsNum2 = Integer.bitCount(num2);

        int setBitsAdded = 0;

        for (int i = 31; i >= 0 && setBitsAdded < setBitsNum2; i--) {
            if ((num1 & (1 << i)) != 0) { // If num1 has a bit set at position i
                x |= (1 << i); // Set the same bit in x
                setBitsAdded++;
            }
        }

        for (int i = 0; i <= 31 && setBitsAdded < setBitsNum2; i++) {
            if ((x & (1 << i)) == 0) { // If x does not have a bit set at position i
                x |= (1 << i); // Set this bit
                setBitsAdded++;
            }
        }

        return x;

    }
}