public class Find123pattern {


    public boolean find123pattern(int[] nums) {
    nums = new int[]{1, 3, 2};
    for (int i = 0; i < nums.length - 2; i++) {
        for (int j = 0; j < nums.length - 1; j++) {
            for (int k = 0; k < nums.length; k++) {
                if (nums[k] > nums[i] && nums[j] > nums[k])
                    return true;
            }
        }
    }

    return false;
}
}


