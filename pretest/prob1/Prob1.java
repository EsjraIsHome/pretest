package prob1;

public class Prob1 {

	public static void main(String[] args) {
		System.out.printf("Hello World\n");
		int[] nums = {4, 7, 2, 9, 1};
		findMaxDiff(nums);
	}
	
	public static int findMaxDiff(int[] arr) {
		int iter = arr.length - 1;
		if (iter == 0) {
			return 0;
		}
		int diff = 0;
		for (int i=0; i < iter; i++) {
			int val1 = arr[i];
			int val2 = arr[i+1];
			int inDiff = val1 - val2;
			if (inDiff < 0) {
				inDiff += diff*2;
			}
			if (inDiff > diff) {
				diff = inDiff;
			}
		}
		return diff;
	}
}