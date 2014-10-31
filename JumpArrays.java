
/**
 * Given an array start from the first element and reach the last by jumping. The jump length can be at most 
 * the value at the current position in the array. Optimum result is when u reach the goal in minimum number of jumps.
 * 
 * @author Vallabh
 *
 */
public class JumpArrays {

	public static void main(String[] args){
		
		int[] inp = {4,0,0,3,6,5,4,7,1,0,1,2};;
		int[] result = new int[inp.length];
		
		for(int i =0; i< inp.length;i++){
			result[i] = Integer.MAX_VALUE;
		}
		
		if(inp[0] == 0)
			System.out.println("Not Possible to move anywhere ");
		
		result[0] = 0; // Starting from 0th position
		
		for(int i = 0; i < inp.length;i++){
			
			for(int j = i+1; (j <= i + inp[i]) && (j < inp.length); j++){
				
				if(result[j] > result[i] + 1)
					result[j] = result[i] + 1;
			}
		}
		
		for(int i=0;i<result.length;i++)
			System.out.print(" " +result[i]);
	}
}
