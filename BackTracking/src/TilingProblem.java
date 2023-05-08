
public class TilingProblem {

	
	public static int getWays(int n) {//5
		//base case
		if(n<=3) {
			return n;
		}
		
		//recursive call
		return getWays(n-1)+getWays(n-2);
	}
	
	public static void main(String[] args) {
		
		System.out.println("for n = 1, total ways : " + getWays(1));
		System.out.println("for n = 2, total ways : " + getWays(2));
		System.out.println("for n = 3, total ways : " + getWays(3));
		System.out.println("for n = 4, total ways : " + getWays(4));
		System.out.println("for n = 5, total ways : " + getWays(5));

	}

}
