import java.util.*;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                return new int[] {hm.get(target - nums[i]),i};
            }
            hm.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
    public static void main(String aregs[]){
        int[] nums = new int[]{4,9,8,5,3,4,5};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}