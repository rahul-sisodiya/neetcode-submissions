class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        if(strs.length == 0) return ans;

        ans.add(new ArrayList(Arrays.asList(strs[0])));
        if(strs.length == 1) return ans;

        for(int i = 1; i<strs.length; i++){
            boolean isPlaced = false;
            for(List<String> list : ans){
                if(isAnagram(strs[i],list.get(0))){
                    list.add(strs[i]);
                    isPlaced = true;
                    break;
                }
            }
            if(!isPlaced){

                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                ans.add(temp);
            }
            
        }
        return ans;


    }

    public boolean isAnagram(String s , String t){
        int [] characters = new int[26];
        for(char ch : s.toCharArray()){
            characters[ch-'a']+=1;
        }
        for(char ch : t.toCharArray()){
            characters[ch-'a']-=1;
        }

        for(int i : characters){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
