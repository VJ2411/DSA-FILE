package day1question1;

public class findgcd {

	public static void main(String[] args) {
		int a = 15, b = 20;
		System.out.println(findGCD(a,b)); 
	}
		
		static int findGCD(int a, int b)   
		{   
		if (b == 0)   
		return a;     
		return findGCD(b, a % b);   
		}   
	}


