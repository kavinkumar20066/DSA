class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0]; 

        for (int i = 1; i < strs.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < prefix.length() && j < strs[i].length(); j++) {
                if (prefix.charAt(j) == strs[i].charAt(j)) {
                    sb.append(prefix.charAt(j));
                } else {
                    break;
                }
            }
            prefix = sb.toString();
            if (prefix.isEmpty()) return "";
        }
        return prefix;
    }
}
