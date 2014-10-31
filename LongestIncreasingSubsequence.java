/**
 * Find longest increasing subsequence from array of numbers 
 * @author Vallabh
 *
 */
public class LongestIncreasingSubsequence {

	public static void main(String[] args){
		
		int[] input = {5, 2, 8, 6, 3, 6, 9, 7};
		int[] LIS = new int[input.length];
		int[] path = new int[input.length];
		
		for(int i=0;i<input.length;i++){
			LIS[i] = 1;
			path[i] = i;
		}
		for(int i=0;i<input.length;i++){
			
			for(int j = 0; j < i; j++){
				
				if( (input[i] > input[j]) && (LIS[i] < LIS[j] + 1)){
					LIS[i] = LIS[j] + 1;
					path[i] = j;
				}
			}
		}
			
		for(int i = 0; i < input.length; i++){
			System.out.println(path[i]);
		}
	}
}
