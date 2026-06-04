class Solution {

    public String encode(List<String> strs) {
        StringBuilder st=new StringBuilder();
        for(String str: strs){
            st.append(str.length()).append("#").append(str);
        }
        return st.toString();
    }

    public List<String> decode(String str) {
        List<String> ll=new ArrayList<>();
        char[] chAr=str.toCharArray();
        int len=0,start=0,l=chAr.length;
        while(start<l){
            len=0;
            while(start<l&&Character.isDigit(chAr[start])){
                len=len*10+(chAr[start]-'0');
                start++;
            }
            if (start < l && chAr[start] == '#') {
                start++;
                String s = str.substring(start, start + len);
                ll.add(s);
                start+=len;
            }
        }
        return ll;
    }
}
