class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> st=new HashSet<>();
        for(int num: nums){
            st.add(num);
        }
        int count=0;
        for(Integer num:st){
            if(st.contains(num-1))
            count++;
        }
        return count+1;
    }
}
