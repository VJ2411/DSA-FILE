package day2question1;

public class oneton {

	public static void main(String[] args) {
		int num = 10;
		recursion(num);
		}
	static void recursion(int num) {
       if(num > 0) {
    	   recursion(num -1);
    	   System.out.println(num);
       }
		return ;
	}
	

}
