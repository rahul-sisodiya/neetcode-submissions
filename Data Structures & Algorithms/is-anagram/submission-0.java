class Solution {
    public boolean isAnagram(String s, String t) {
        String arr[] = s.split("");
        String arr0[] = t.split("");
        Arrays.sort(arr);
        Arrays.sort(arr0);

        return Arrays.equals(arr,arr0);

    }
}
