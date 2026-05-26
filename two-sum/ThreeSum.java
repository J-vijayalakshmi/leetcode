import java.util.*;

class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        if (nums.length < 3)
            return res;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {

                int sum = nums[i] + nums[l] + nums[r];

                if (sum == 0) {

                    res.add(Arrays.asList(
                            nums[i],
                            nums[l],
                            nums[r]));

                    while (l < r && nums[l] == nums[l + 1])
                        l++;

                    while (l < r && nums[r] == nums[r - 1])
                        r--;

                    l++;
                    r--;
                }

                else if (sum < 0) {
                    l++;
                }

                else {
                    r--;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

        ThreeSum obj = new ThreeSum();

        int[] nums = { -1, 0, 1, 2, -1, -4 };

        List<List<Integer>> result = obj.threeSum(nums);

        System.out.println(result);
    }
}