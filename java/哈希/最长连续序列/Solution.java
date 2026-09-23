
import java.util.HashSet;
import java.util.Set;


public class Solution {
    public int longestConsecutive(int[] nums){
        int ans = 0;
        // 哈希集合 去重
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int x : set){
            // 确保x是序列起点
            if(set.contains(x-1)){
                continue;
            }

            int y = x;
            while(set.contains(y + 1)){
                y++;
                
            }
            ans = Math.max(ans,y - x + 1);

        }

        return ans;
    }
}
