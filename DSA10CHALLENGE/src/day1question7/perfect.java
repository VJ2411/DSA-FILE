package day1question7;

public class perfect {
       static long sum = 0; 
	public static void main(String[] args) {
		long num = 28;
		if(isPerfect(num, 1) == num)
            System.out.println(num+" is a perfect number");
        else
            System.out.println(num+" is not a perfect number");
		

	}
	static long isPerfect(long num , int i) {
		if (i <= num/2) {
			if (num%1 == 0)
				sum = sum +i;
			i++;
			
			isPerfect(num,i);
		}
		return sum;
	}
	
	

}
