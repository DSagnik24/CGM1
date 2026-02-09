public class LongestSubStringWithoutRepeating {
    public static void main(String[] args) {
        String str = "bbbbb";
        String str2 = "abcabcbb";
        String str3 = "pwwkew";
        System.out.println("The longest substring is: " + lengthOfLongestSubstring(str));
        System.out.println("The longest substring is: " + lengthOfLongestSubstring(str2));
        System.out.println("The longest substring is: " + lengthOfLongestSubstring(str3));
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int l = 0;
        java.util.Map<Character, Integer> charIndexMap = new java.util.HashMap<>();

        for (int r = 0; r < n; r++) {
            char currentChar = s.charAt(r);
            if (charIndexMap.containsKey(currentChar)) {
                l = Math.max(charIndexMap.get(currentChar) + 1, l);
            }
            charIndexMap.put(currentChar, r);
            maxLength = Math.max(maxLength, r - l + 1);
        }
        return maxLength;
    }
}
