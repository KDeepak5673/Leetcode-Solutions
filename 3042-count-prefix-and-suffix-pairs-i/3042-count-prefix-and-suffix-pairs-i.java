class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        

        int count = 0 ; 
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }

        return count;
    }

    boolean isPrefixAndSuffix(String str1 ,String str2){
        int l1 = str1.length();
        int l2 = str2.length();

        if (l1 > l2) {
            return false;
        }
        
        if (str1.equals(str2.substring(0,l1)) && str1.equals(str2.substring( l2-l1, l2))){
            return true;
        }
        return false;

    }
}