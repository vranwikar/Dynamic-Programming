/**
 * Count all possible paths from top left to bottom right of a mXn matrix
 * @author Vallabh
 *
 */
public class AllPossiblePathsInMatrix {

	public static void main(String[] args){
		int m = 3;
		int n = 3;
		
		int[][] count = new int[m][n];
		
		for(int i=0;i<m;i++)
			count[i][0] = 1;
		
		for(int j=0;j<n;j++)
			count[0][j] = 1;
		
		for(int i = 1; i < m;i++){
			
			for(int j = 1; j< n; j++){
				count[i][j] = count[i-1][j] + count[i][j-1];
			}
		}
		
		System.out.println("Count of paths " +count[m-1][n-1]);
	}
}
