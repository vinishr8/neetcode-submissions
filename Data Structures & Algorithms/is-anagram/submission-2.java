class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map=new HashMap<>();

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            if(map.get(ch)==null){
                return false;
            }
            map.put(ch,map.getOrDefault(ch,0)-1);
        }
        for(int n:map.values()){
            if(n!=0){
                return false;
            }
        }
        return true;
    }
}
