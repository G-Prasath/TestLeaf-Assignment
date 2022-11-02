package week1.day2;

import java.util.Arrays;

public class Missing_Number_in_Array {

	public static void main(String[] args) {
		
		int num [] = {1,2,3,4,7,8,6};
		
		Arrays.sort(num);		
		
		for(int i=0; i<num.length; i++) {
			int temp = i+1;
			
			if(num[i] != temp) {
				System.out.println(temp);
				break;
			}
		
		}

	}

}
