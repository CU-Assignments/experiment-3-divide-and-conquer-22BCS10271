class Solution {
    public String longestNiceSubstring(String s) {
        if (s.length() < 2)
            return "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.contains(Character.toString(Character.toUpperCase(ch))) &&
                    s.contains(Character.toString(Character.toLowerCase(ch)))) {
                continue;
            }

            String left = longestNiceSubstring(s.substring(0, i));
            String right = longestNiceSubstring(s.substring(i + 1));

            return left.length() >= right.length() ? left : right;
        }

        return s;
    }
}