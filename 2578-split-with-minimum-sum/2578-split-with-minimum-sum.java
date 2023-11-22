class Solution {
    public int splitNum(int num) {
        char[] nums = String.valueOf(num).toCharArray();
        Arrays.sort(nums);
        
        String num1 = "", num2 = "";
        for(int i = 0; i < nums.length; i += 2){
            num1 += nums[i];
        }

        for(int i = 1; i < nums.length; i += 2){
            num2 += nums[i];
        }

        return Integer.parseInt(num1) + Integer.parseInt(num2);
    }
    
}