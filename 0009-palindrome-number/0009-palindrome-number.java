class Solution {
    public boolean isPalindrome(int x) {

        int revNo  =  0;

        int i = x;

        while (i > 0 ){
            int rem = i % 10;

            i =  i/10;

            revNo = revNo*10 + rem; 
            
        }

        if( x == revNo){
            return true;
        }

        return false;
        
    }
}