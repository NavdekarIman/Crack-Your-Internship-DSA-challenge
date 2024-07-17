package Array;
// class Solution {
//     public int removeDuplicates(int[] nums) {
//         if (nums.length == 0) // check for empty array
//             return 0;
//         int a = 1;
//         for (int i = 1; i < nums.length; i++) {//traverce the array
//             if (nums[i - 1] != nums[i]) {
//                 nums[a] = nums[i];
//                 a++;
//             }
//         }
//         return a;
//     }
// }
class Solution{
    public int removeDuplicates(int[] nums){
        int left = 0;
        int n = nums.length;
        for( int i = 1; i < n; i++)
            if(nums[left] != nums[i] )
                nums[++left] = nums [i];
        return left + 1;        
    }
}

