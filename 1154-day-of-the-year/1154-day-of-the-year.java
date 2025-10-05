class Solution {
    public int dayOfYear(String date) {
        String[] str = date.split("-");

        int[] ans = new int[str.length];

        for(int i = 0 ; i < str.length ;i++){
            ans[i] = Integer.parseInt(str[i]);
        }
        int[] days = {0, 31 , 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
        int year = ans[0];
        int ex = 0;
        int m = days[(ans[1])-1];

        // if(m == 1 , )


        if((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0 ){
            if(ans[1] > 2) {
                ex =1;
            }

        }

        int answer = ans[2]+m+ex;

        return answer;
    }
}