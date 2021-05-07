class Solution {
    public int[] sortedSquares(int[] nums) {
        int newArr[] = new int[nums.length];
        int l = nums.length;
        int right = 0;
        int left = l-1;
        for(int i=l-1;i>=0;i--){
            if(Math.abs(nums[right])<Math.abs(nums[left])){
                newArr[i]=nums[left]*nums[left];
                left--;
            }else{
                newArr[i]=nums[right]*nums[right];
                right++;
            }
        }
        return newArr;
    }
}