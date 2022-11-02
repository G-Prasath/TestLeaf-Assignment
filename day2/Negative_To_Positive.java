package week1.day2;

public class Negative_To_Positive {

	public static void main(String[] args) {
		
		int num = 40, temp;
		temp = num;
		
		if(num < 0) {
			num = (num * (-1));
			System.out.println("This Negative Number : " + temp + " is Convert postive Number : " + num);
			
		}
		else {
			System.out.println("This is Positive Number : "+temp);
		}
		
		
	}

}
