class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count=0,pr=1,l=nums.length;
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int[] sol=new int[nums.length];
        left[0]=nums[0];
        right[l-1]=nums[l-1];
        for(int i=1;i<nums.length-1;i++){
            left[i]=left[i-1]*nums[i];
            right[l-i-1]=right[l-i]*nums[l-i-1];
        }
        int i=1;
        sol[0]=right[1];
        sol[l-1]=left[l-2];
        while(i<l-1){
            sol[i]=left[i-1]*right[i+1];
            i++;
        }
        return sol;
    }
}  
