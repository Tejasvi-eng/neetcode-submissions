class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int k = 0; k < nums.length - 2; k++) {

            // skip duplicate fixed values
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }

            int i = k + 1;
            int j = nums.length - 1;

            while (i < j) {

                int sum = nums[i] + nums[j];

                if (sum == -nums[k]) {

                    list.add(Arrays.asList(nums[k], nums[i], nums[j]));

                    i++;
                    j--;

                    // skip duplicate values after finding a triplet
                    while (i < j && nums[i] == nums[i - 1]) {
                        i++;
                    }

                    while (i < j && nums[j] == nums[j + 1]) {
                        j--;
                    }

                } 
                else if (sum > -nums[k]) {
                    j--;
                } 
                else {
                    i++;
                }
            }
        }

        return list;
    }
}