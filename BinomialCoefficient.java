/**
 * Program to find Binomial Coefficients
 * @author Vallabh
 *
 */
public class BinomialCoefficient {

	public static void main(String[] args){
		int n = 5;
		int k = 3;
		int[][] Coef = new int[n+1][k+1];
		
		for(int i=0; i<=n; i++){
			
			for(int j = 0; j<=Math.min(i, k); j++){
				
				if( j == 0 || i == j){
					Coef[i][j] = 1;
				}
				else
					Coef[i][j] = Coef[i-1][j-1] + Coef[i-1][j];
			}
		}
		
		System.out.println();
	}
}
