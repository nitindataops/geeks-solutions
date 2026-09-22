class Solution {
    public String delAlternate(String s) {
        StringBuilder sb = new StringBuilder();
        
        // Loop through even indices (0, 2, 4, ...)
        for (int i = 0; i < s.length(); i += 2) {
            sb.append(s.charAt(i));
        }
        
        return sb.toString();
    }
}