
public class MaxSubArray {

	public static void main(String[] args){
		int[] inp = {-2, -3, 4, -1, -2, 1, 5, -3};
		int sum = 0;
		int maxSum = 0;
		boolean flag = false;
		int start = 0;
		int end = 0;
		
		for(int i = 0; i<inp.length;i++) {
			sum = sum + inp[i];
			if(sum < 0){
				sum = 0;
				flag = false;
			}
			if(!flag && (sum > 0)) {
				start = i;
				flag = true;
			}
			if(sum > maxSum){
					maxSum = sum;
					end = i;
				}
			}
		System.out.println("Maximu sum is " +maxSum);
		System.out.println("Start is " +start);
		System.out.println("End is "+end);
	}
}
