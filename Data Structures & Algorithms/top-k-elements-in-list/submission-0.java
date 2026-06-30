class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequencies
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Step 2: Create buckets (index = frequency)
        List<List<Integer>> bucket = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            bucket.add(new ArrayList<>());
        }

        // Step 3: Place numbers into their frequency bucket
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            bucket.get(freq).add(num);
        }

        // Step 4: Collect top k from highest frequency down
        int[] ans = new int[k];
        int j = 0;
        for (int i = bucket.size() - 1; i >= 0 && j < k; i--) {
            for (int num : bucket.get(i)) {
                ans[j++] = num;
                if (j == k) return ans;
            }
        }

        return ans;
    }
}
