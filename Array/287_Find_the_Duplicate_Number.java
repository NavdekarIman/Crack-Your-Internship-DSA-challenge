// class Solution {
//     public int findDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         int ans=0;
//         for(int i=0;i<nums.length-1;i++)
//             if(nums[i]==nums[i+1])
//                 ans=nums[i];
//         return ans;
//     }
// }

class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        boolean [] arr = new boolean[n];
        for(int i = 0;i< n; i++){
            if(arr[nums[i]]) return nums[i];
            arr[nums[i]] = true;
        }
        return - 1;
    }
}