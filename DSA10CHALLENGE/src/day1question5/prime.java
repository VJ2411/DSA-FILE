package day1question5;

public class prime {

	public static void main(String[] args) {
		int i = 2;
		int n = 37;
		boolean isprime = checkprime(n,i);
        
		String result;
		if (isprime) {
		    result = "Prime";
		} else {
		    result = "Not Prime";
		}
		    System.out.println(n + " is : "+ result); 
	}

	private static boolean checkprime(int n, int i) {
		if (n<2)
		return false;
		
		if(i==n)
			return true;
		
		if(n%i==0)
			return false;
		
		i=i+1;
		return checkprime(n,i);
	}

}
