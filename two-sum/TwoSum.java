import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {

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
        int[] nums = new int{4,5,6,7,8,9,0};
        int target = 9;
        twoSum(nums, target);
    }
}