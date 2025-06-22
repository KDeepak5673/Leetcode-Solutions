class Solution {
    public String[] divideString(String s, int k, char fill) {

        int size = s.length() / k;

        List<String> str = new ArrayList<>();

        
        for (int i = 0; i < size; i++) {
            
            String sub = s.substring(i * k, (i * k) + k);
            str.add(sub);
        }

        if (s.length() != size * k) {

            StringBuilder sub = new StringBuilder(s.substring(size*k));
            while(sub.length() < k) {
                sub.append(fill);
            }

            str.add(sub.toString());
        }

        return str.toArray(new String[0]);
    }
}