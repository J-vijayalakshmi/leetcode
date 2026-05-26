import java.util.Arrays;

class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] % 2 != 0) {

                while (left < right && nums[right] % 2 != 0) {
                    right--;
                }

                swap(nums, left, right);
            }
            left++;
        }
        return nums;
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        SortArrayByParity obj = new SortArrayByParity();
        int[] nums = {3, 1, 2, 4};
        int[] result = obj.sortArrayByParity(nums);
        System.out.println(Arrays.toString(result));
    }
}