import java.util.HashMap;
import java.util.Map;

class Solution{
    /**
     * 代码实现（哈希表）
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int nums[],int target){
        if(nums.length < 2){
            return new int[]{};
        }
        // 哈希表 key：数组下标对应的值 value：数组下标
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{i,map.get(target - nums[i])};
            }
            else{
                map.put(nums[i],i);    
            }
        }
        return new int[]{};
    }


}