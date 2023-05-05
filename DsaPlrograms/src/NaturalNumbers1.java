
public class NaturalNumbers1 {

	public static void main(String[] args) {
		
		
		//1st method
		int n = 3;
		int sum = 0;
		sum = n * (n+1)/2;
		System.out.println("Sum of first three natural numbers by using first method is : " + sum);

		
		//2nd method
		int n1 = 3;
		int sum1 = 0;
		for(int i=1; i<=n1;i++) {
			sum1+=i;
		}
		System.out.println("Sum of first three natural numbers by using second method is : " + sum1);
		
		
		//3rd method
		int n2 = 3;
		int sum2 = 0;
		for(int i=1;i<=n2;i++) {
			for(int j=1;j<=i;j++) {
				sum2++;
			}
		}
		System.out.println("Sum of first three natural numbers by using third method is : " + sum2);
	}

}
