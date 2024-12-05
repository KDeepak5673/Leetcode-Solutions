class Solution {
    public int maximumWealth(int[][] accounts) {

        int[] count = new int[accounts.length];

        for (int i = 0; i < accounts.length; i++) {

            count[i] = 0;

            for (int j = 0; j < accounts[i].length; j++) {

                count[i] += accounts[i][j];
            }
        }


        int maximum = count[0];

        for (int i = 0; i < count.length; i++) {
            if (count[i] > maximum) {
                maximum = count[i];
            }

        }

        return maximum;
        
    }
}