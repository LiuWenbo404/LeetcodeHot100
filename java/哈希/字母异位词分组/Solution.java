import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs){
        // 哈希表 key：排序好后的字符串 value：原始的字符组成的数组
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] strChars = str.toCharArray();
            Arrays.sort(strChars);
            String key = new String(strChars);

            List<String> valueList =  map.getOrDefault(key,new ArrayList<>());
            valueList.add(str);
            map.put(key,valueList);

        }
        return new ArrayList<>(map.values());
    }
}
