class Solution {
    public boolean isAnagram(String s, String t) {
        int [] chara = new int[26];

        for(char ch : s.toCharArray()){
            chara[ch-'a'] += 1;
        }
        for(char ch : t.toCharArray()){
            chara[ch-'a'] -= 1;
        }

        for(int i : chara){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
