class Solution {
    public boolean isAnagram(String s, String t) {
        
        List<Character> s_arr = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            s_arr.add(ch);
        }

        if(s_arr.size() != t.length()){
            return false;
        }
        
        for(int i = 0; i < t.length(); i++) {
            for(int j = 0; j < s_arr.size(); j++) {
                if(t.charAt(i) == s_arr.get(j)) {
                    s_arr.remove(j);
                    break;
                }
            }
        }

        if(s_arr.size() != 0) {
            return false;
        }
        
        return true;
    }
}
