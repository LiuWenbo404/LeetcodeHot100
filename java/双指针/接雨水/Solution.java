
public class Solution {
    public int trap(int height[]){
        int ans = 0;

        int left = 0;
        int right = height.length - 1;
        
        int preMax = 0; // 左侧最大高度值
        int sufMax = 0; // 右侧最大高度值

        while (left < right) { 
            preMax = Math.max(preMax,height[left]);
            sufMax = Math.max(sufMax,height[right]);

            // 局部确定高度小一侧的位置能接的雨水
            if(preMax < sufMax){
                ans += preMax - height[left];
                left++;
            }
            else{
                ans += sufMax - height[right];
                right--;
            }
        }

        return ans;
    }
}
