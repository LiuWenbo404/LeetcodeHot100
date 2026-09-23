
public class Solution {
    public int maxArea(int height[]){
        int maxArea = 0;

        int left = 0;
        int right = height.length - 1;
        while(left < right){

            // 移动高度较矮一端的指针
            if(height[left] < height[right]){
                int area = height[left] * (right - left);
                maxArea = Math.max(maxArea,area);
                left++;
            }else{
                int area = height[right] * (right - left);
                maxArea = Math.max(maxArea,area);
                right--;
            }
        }

        return maxArea;
    }
}
