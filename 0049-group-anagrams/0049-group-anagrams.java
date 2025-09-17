class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();

        boolean[] visit = new boolean[strs.length];

        for(int i = 0 ; i < strs.length ; i++){
            List<String> temp = new ArrayList<>();

            if(!visit[i]){
                temp.add(strs[i]);
            }
            visit[i] = true;
            for(int j = i+1 ; j < strs.length ; j++){
                if(!visit[j] && isAnagrams(strs[j] , strs[i])){
                    temp.add(strs[j]);
                    visit[j] = true; 
                }
            }
            if(!temp.isEmpty())
            ans.add(temp);
  
        }
        

        return ans;
    }
    public boolean isAnagrams(String s , String t){
        if(s.length() != t.length()){
            return false;
        }

        ArrayList<Character> list = new ArrayList<>(); 

        for(Character ch : s.toCharArray()){
            list.add(ch);
        }
        for(Character ch : t.toCharArray()){
            if(!list.contains(ch)){
                return false;
            }else{
                list.remove(ch);
            }
        }
        return true;
    }
}