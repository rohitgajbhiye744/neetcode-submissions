class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet unums = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(unums.contains(nums[i])) {
                return true;
            } else {
                unums.add(nums[i]);
            }
        }
        return false;
    }
}