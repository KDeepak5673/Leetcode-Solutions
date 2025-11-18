class Solution {
    public boolean isOneBitCharacter(int[] bits) {

        boolean ans = false;
        int n = bits.length;

        for(int i = 0 ; i< n ; i++){
            if(bits[i] == 0){
                ans = true;
            }
            if(bits[i] == 1){
                ans = false;
                i += 1;
            }
        }

        return ans;
    }
}