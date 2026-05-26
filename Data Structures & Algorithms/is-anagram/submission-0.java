class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);

        char[] charArray2 = t.toCharArray();
        Arrays.sort(charArray2);
        
        for(int i=0;i<charArray2.length;i++){
            if(charArray2[i]!=charArray[i]){
                return false;
            }
        }
        return true;
    }
}
