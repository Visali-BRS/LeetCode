class Solution {
    public String reverse(String s){
        String rev= "";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+ s.charAt(i);
        }
        return rev;
    }
    public int maximumNumberOfStringPairs(String[] words) {
        int ans=0;
        int n=words.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
            String a=words[i];  
            String b=words[j];
            if(a.equals("0")){
                break;
            }
            String revb=reverse(b);
            if(revb.equals(a)){
                ans++;
                words[j]="0";
                break;
            }
        }
    }
    return ans;
}
}