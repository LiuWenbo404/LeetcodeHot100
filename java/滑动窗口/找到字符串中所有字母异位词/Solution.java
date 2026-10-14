import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> findAnagrams(String s,String p){
        List<Integer> res = new ArrayList<>();

        char[] sChars = s.toCharArray();
        char[] pChars = p.toCharArray();
        int[] sCnt = new int[26];
        int[] pCnt = new int[26];
        for(char c : pChars){
            pCnt[c - 'a']++;
        }
        for(int right = 0; right < s.length();right++){
            sCnt[sChars[right] - 'a']++;
            int left = right - p.length() + 1;
            if(left < 0 ){
                continue;
            } 
            if(Arrays.equals(sCnt,pCnt)){
                res.add(left);
            }
            sCnt[sChars[left] - 'a']--;
            left++;
            
        }
        return res;
    }
}
