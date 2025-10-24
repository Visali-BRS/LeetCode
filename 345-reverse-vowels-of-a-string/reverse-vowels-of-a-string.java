class Solution {
    public String reverseVowels(String s) {
        boolean[] vowels = new boolean[128];
        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels[c] = true;
        }
        char[] cs = s.toCharArray();
        int i = 0, j = cs.length - 1;
        while (i < j) {
            while (i < j && !vowels[cs[i]]) {
                ++i;
            }
            while (i < j && !vowels[cs[j]]) {
                --j;
            }
            if (i < j) {
                char t = cs[i];
                cs[i] = cs[j];
                cs[j] = t;
                ++i;
                --j;
            }
        }
        return String.valueOf(cs);
    }
}

//////

public class Reverse_Vowels_of_a_String {

    class Solution {
        public String reverseVowels(String s) {
            char[] a = s.toCharArray();

            int l = 0; // left
            int r = a.length - 1; // right

            while (l < r) {
                if (isVowel(a[l]) && isVowel(a[r])) {
                    swap(a, l++, r--);
                } else if (isVowel(a[l])) {
                    r--;
                } else {
                    l++;
                }
            }

            return new String(a);
        }

        private boolean isVowel(char b) { // The letters A, E, I, O, and U are called vowels
            char c = Character.toLowerCase(b);
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }

        private void swap(char[] cs, int start, int end) {
            char temp = cs[start];
            cs[start] = cs[end];
            cs[end] = temp;
        }
    }
}