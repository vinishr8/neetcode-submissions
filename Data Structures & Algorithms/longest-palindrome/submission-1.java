class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int even=0;
        int odd=0;
        for(Map.Entry<Character,Integer> m:map.entrySet()){
            even+=m.getValue()/2;
            odd+=m.getValue()%2;
        }
        if(odd>0){
            odd=1;
        }
        return even*2+odd;
    }
}