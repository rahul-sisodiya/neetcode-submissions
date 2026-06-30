class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int l = nums.length;
        for(int i = 0 ; i<l ; i++){
            map.put(nums[i],i);
        }

        int [] ans = new int[2];

        for(int i = 0 ; i<l ; i++){
            int secNum = target-nums[i];
            
            if(map.containsKey(secNum) && i!=map.get(secNum)){
                ans[0] = i;
                ans[1] = map.get(secNum);
                return ans;
            }
        }
        return new int[]{-1,-1};

    }
}
