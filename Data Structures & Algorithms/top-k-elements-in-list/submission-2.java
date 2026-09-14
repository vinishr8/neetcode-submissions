class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer>[] arr =new List[nums.length+1];

        for(int i=0;i<arr.length;i++){
            arr[i]=new ArrayList<>();
        }
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            arr[m.getValue()].add(m.getKey());
        }

        int[] res = new int[k];
        int idx=0;
        for(int i=arr.length-1;i>0 && idx<k;i--){
            List<Integer> temp=arr[i];
            for(int n:temp){
                if(idx<k){
                    res[idx++]=n;
                }else {
                    return res;
                }
            }
        }
        return res;
    }
}
