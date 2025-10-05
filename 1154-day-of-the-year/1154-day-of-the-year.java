class Solution {
    public int dayOfYear(String date) {

        
        int[] days = {31 , 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = Integer.parseInt(date.substring(0, 4));
        int day = Integer.parseInt(date.substring(8, 10));
        int m = Integer.parseInt(date.substring(5, 7));      

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            days[1] = 29;

        }
        int answer = day;
        for(int i = 0 ; i < m-1 ;i++){
            answer += days[i];
        }

        

        return answer;
    }
}