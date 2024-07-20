/*Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
  The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
  */

class Solution {
    public static void main(String[] args) {
        int nums[]={3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums,val));
    }




    public static int removeElement(int[] nums, int val) {
        int countval = 0;
        for (int i = 0; i < nums.length ; i++){
            if (nums[i] != val){
                nums[countval]=nums[i];
                countval++;
            }
        }
        return countval++;
    }
}
