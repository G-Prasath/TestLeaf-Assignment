package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		int num = 22, temp, sum = 0, rem;	
		temp = num;
		
		while(num > 0) {
			rem = num % 10;   
			sum = (sum*10)+rem;
			num = num / 10;
		}
		
		if(temp == sum) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
	}

}
