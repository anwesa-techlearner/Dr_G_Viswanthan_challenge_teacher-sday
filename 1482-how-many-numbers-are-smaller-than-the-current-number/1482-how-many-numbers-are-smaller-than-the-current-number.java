class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] k = new int[nums.length];
        for (int i =0;i<nums.length;i++){
            int low = 0;
            for(int j =0; j<nums.length;j++){
                if(nums[j]<nums[i]&& nums[j]!=nums[i]){
                    low = low +1;
                }
             k[i] = low;
            }
            
        }
     return k;
    }
}