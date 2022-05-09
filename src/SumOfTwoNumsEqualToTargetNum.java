import java.util.HashMap;

public class SumOfTwoNumsEqualToTargetNum {
    public class Solution {
        public int[] twoSum(int[] numbers, int target) {
            HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
            for(int i = 0; i < numbers.length; i++){
                Integer requiredNum = (Integer)(target - numbers[i]);
                if(indexMap.containsKey(requiredNum)){
                    int toReturn[] = {indexMap.get(requiredNum), i};
                    return toReturn;
                }

                indexMap.put(numbers[i], i);
            }
            return null;
        }
    }
}
