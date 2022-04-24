
public class TwoSum {

	public static void main(String[] args) {
//		 #1 - Two Sum(Checking)
//		==================================
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] answer = twoSum(nums, target);
		for(int i=0;i<answer.length; i++) {
			System.out.print(answer[i]);
		}
//		==================================
	}
	
//	 			#1 - Two Sum
//	   	==================================
	 public static int[] twoSum(int[] nums, int target) { 
	        int i = 0;
	        int j = i+1;
	        for(i = 0; i< nums.length; i++){
	            for(j = i+1; j< nums.length; j++){
	                if(nums[i] + nums[j] == target){
	                    return new int[] { i, j };
	                }
	            }
	        }
	        return new int[] {};
	    }
//		==================================
}
