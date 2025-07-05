class Solution {
    public boolean judgeSquareSum(int c) {

        for(long i = 0 ; i * i <= c ; i++){
            int j = c -  (int)(i * i);
            int a = 1, sum = 0;

            while(sum < j){
                sum += a;
                a += 2;
            }
            if(sum == j) return true;

        }
        return false;
    }
}