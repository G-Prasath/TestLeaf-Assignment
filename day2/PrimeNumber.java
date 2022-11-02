package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num = 21;
		
		boolean flag = false;
		
		for(int i=2; i<num/2; i++) {
			
			if(num%2 == 0) {
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime Number");	
		}
		System.out.println(num/2);
		
		
		
		

	}

}
