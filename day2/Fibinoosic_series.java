package week1.day2;

public class Fibinoosic_series {

	public static void main(String[] args) {
		int range = 8, fno = 0, sno = 1, sum;
		
		for(int i=0; i<range; i++) {
			
			System.out.println(fno);
			sum = fno + sno; //  sum = 0+1
			fno = sno;		// fno = 1
			sno = sum;		// sno = 1
		}
		
	}

}
