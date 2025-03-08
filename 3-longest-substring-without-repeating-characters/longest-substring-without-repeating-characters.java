class Solution {
    public int lengthOfLongestSubstring(String s)
     {
        int n=s.length();
        int len;
        int maxlen=0;
        int left=0; int right=0;
        HashMap<Character,Integer> Hash = new HashMap<>();
        while(right<n)
        {
            if(Hash.containsKey(s.charAt(right))){
                if(Hash.get(s.charAt(right))>=left){
                    left=Hash.get(s.charAt(right))+1;
                }
            }
            len=right-left+1;
            maxlen=Math.max(maxlen,len);
            Hash.put(s.charAt(right),right);
            right++;
        }
        return maxlen;
    } //byu
}