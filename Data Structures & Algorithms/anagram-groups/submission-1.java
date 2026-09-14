class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String st = new String(ch);
            List<String> ll=map.getOrDefault(st, new ArrayList());
            // System.out.println(st);
            ll.add(str);
            map.put(st, ll);
        }
        List<List<String>> ll=new ArrayList<>();
        for(List<String> l:map.values()){
            ll.add(l);
        }
        return ll;
    }
}
