/**
 * 
 * @author Vallabh
 *
 */
public class Knapsack {

	/**
	 * Knapsack with repetitions
	 * @param args
	 */
	public static void main(String[] args){
		
		int[]  weight = {6, 3, 4, 2};
		int[] values = {30, 14, 16, 9};
		int W = 10;
		int[] result = new int[W+1];
		int max = 0;
		int tempW = 0;
		for(int i = 1; i < W+1; i++){
			tempW = W;
			max = 0;
			for(int j = 1; j < i; j++){
				if(weight[j] < tempW &&){
					result[j] = result[]
				}
			}
		}
		
	}
}
