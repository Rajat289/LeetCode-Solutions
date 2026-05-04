class Solution {
    public String reverseWords(String s) {
        String ans = "";
        String[] words = s.split(" ");

        for (String word : words) {
            String temp = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                temp += word.charAt(i);
            }

            ans += temp + " ";
        }

        return ans.trim();
    }
}
