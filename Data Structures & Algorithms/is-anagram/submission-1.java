class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> m = new HashMap<>();
        for(char ch: s.toCharArray()){
            if(m.containsKey(ch)){
                m.put(ch,m.get(ch)+1);
            }else{
                m.put(ch,1);
            }
        }
        HashMap<Character,Integer> n = new HashMap<>();
        for(char ch: t.toCharArray()){
            if(n.containsKey(ch)){
                n.put(ch,n.get(ch)+1);
            }else{
                n.put(ch,1);
            }
        }
        return m.equals(n);
    }
}
