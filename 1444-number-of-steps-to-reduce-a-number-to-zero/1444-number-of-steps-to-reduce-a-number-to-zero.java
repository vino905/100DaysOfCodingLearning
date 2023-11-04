class Solution {
    public int numberOfSteps(int num) {
        if(num<=1)
			return num;
		if(num%2==0)
			num=num/2;
		else
			num=num-1;
		return 1+numberOfSteps(num);  
    }
}