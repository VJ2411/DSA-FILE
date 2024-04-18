package day1question3;

public class primefactors {

	public static void main(String[] args) {
		int N= 16;
		factors(N,1);

	}

	private static void factors(int n, int i) {
		 if (i <= n) {
	            if (n % i == 0) {
	                System.out.print(i + " ");
	            }
	            factors(n, i + 1);
	        }
		
	}

}
