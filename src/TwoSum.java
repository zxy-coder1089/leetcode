import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums,int target) {
        //创建哈希表，key存数字，value存下标
        //Map<Key类型, Value类型> map = new HashMap<>();
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];   //计算所需另一半

            if (map.containsKey(need)) {  //若存在，则返回下标
                return new int[]{map.get(need),i};
            }
            map.put(nums[i],i); //若不存在，则把数字和下标存入哈希表，供后面数字匹配
        }
        return new int[0];
    }
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2,7,11,23};
        int target = 9;
        int[] result = solution.twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
