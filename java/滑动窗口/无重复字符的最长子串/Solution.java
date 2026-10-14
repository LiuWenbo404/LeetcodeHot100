class Solution{
    public int lengthOfLongestSubstring(String s){
        int res = 0;
        char[] sChars = s.toCharArray();

        int[] sCnt = new int[128];
        
        int left = 0;
        for(int right = 0;right < s.length();right++){
            sCnt[sChars[right]]++;
            while(sCnt[sChars[right]] > 1){
                sCnt[sChars[left]]--;
                left++;
            }
            res = Math.max(res,right - left + 1);
        }
        return res;
    }
}