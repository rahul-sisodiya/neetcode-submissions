class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean b = false;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                b = true;
                break;
            }
        }
        return b;
    }
}
