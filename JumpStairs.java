/**
 * There are n steps, you can climb 1 step or 2 step at a time. 
 * @author Vallabh
 *
 */
public class JumpStairs {
	public static void main(String[] args){
		int n = 5;
		
		if(n==1)
			System.out.println(1);
		if(n==2)
			System.out.println(2);
		int prevPrev = 1;
		int current = 0;
		int prev = 2;
		
		for(int i = 3;i<=n;i++){
			current = prev + prevPrev;
			prevPrev = prev;
			prev = current;			
		}
		System.out.println(current);
		
	}

}
