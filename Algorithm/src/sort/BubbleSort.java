package sort;

public class BubbleSort {
	public static void main(String[] args) {
		int[] nums = { 2, 5, 11, 3, 22, 6, 91, 13, 35, 4 };
		sort(nums);
		for(int i=0;i<nums.length-1;i++){
			System.err.print(nums[i]+" ");
		}
	}
	
	public static void sort(int[] nums){
		int temp = 0;
		for(int i=nums.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(nums[j]>nums[j+1]){
					temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
	}
}
