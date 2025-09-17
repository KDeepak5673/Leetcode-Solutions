class Solution {
    public boolean isAnagram(String s, String t) {
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