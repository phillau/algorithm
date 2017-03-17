package search;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] nums = { 2, 5, 11, 3, 22, 6, 91, 13, 35, 4 };
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		System.err.println(search(nums, 13));
	}
	
	public static int search(int[] nums,int num){
		int start = 0;
		int end = nums.length-1;
		while(start<=end){
			int mid = (end+start)/2;
			if(num<nums[mid]){
				end = mid - 1;
			}else if(num>nums[mid]){
				start = mid + 1;
			}else{
				return mid;
			}
		}
		return -1;
	}
}
