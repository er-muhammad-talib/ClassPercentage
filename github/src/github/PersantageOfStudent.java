package github;
import java.util.Scanner;
public class PersantageOfStudent {

// This is my on code
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		int sum = 0 ; 
		System.out.println("How many subject:");
		int num = obj.nextInt();
		
		int maximumNumber = num * 100 ;
		System.out.println("Enter Subject Number:");
		int [] a = new int[num];
		
		for(int i = 0 ; i < num ; i++) {
			
			a[i] = obj.nextInt();
		}
		System.out.println("Your subject number:");
		
		for(int i = 0 ; i < num ; i++ ) {
			sum = sum + a[i];
			System.out.println(a[i]);
		}
		
		System.out.println("Maxinum Number is: " + maximumNumber);
		System.out.println("Obtain Number: " + sum);
		
		float per = (sum * 100) / maximumNumber ; 
		System.out.println("Your persantage: " + per);
		
		if(per >= 33 & per < 45) {
			
			System.out.println("Third Division:" + per + "% /n" + "D Grade"  );
		
		}else if(per >= 45 & per < 60) {
			
			System.out.println("Second Division:" + per + " % " + "C Grade"  );
		
		}else if(per >= 60 & per < 70) {
			
			System.out.println("First Division:" + per + " % " + "B Grade"  );
			
		}else if(per >= 70 & per < 100) {
			
			System.out.println("Toper" + per + " % " + "A+ Grade"  );
		}else {
			System.out.println("You are faile:" + per + " % " + "F Grade");
		}
		

	}

}


