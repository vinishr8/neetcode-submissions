class Solution {
    public boolean check(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
            }
        }
        if(count>1 || (nums.length>1 && count==1 && nums[0]<nums[n-1])){
            return false;
        }
        return true;
    }
}