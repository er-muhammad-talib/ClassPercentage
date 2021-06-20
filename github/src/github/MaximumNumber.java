package github;

import java.util.Scanner;

public class MaximumNumber {

//  This is my first repo in git

        public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("How many number in arrey:");
		int n = obj.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			
			arr[i]  = obj.nextInt();
		}
		
		System.out.println("you enter number:");
		for(int i = 0 ; i < n ; i++) {
			System.out.println(arr[i]);
		}
		
		int max = arr[0];
		for(int i = 1 ; i < arr.length ; i++ ) {
			
			if(arr[i] > max) {
				
				max = arr[i];
			}
		}
		System.out.println("Maximum Number is:" + max);

	
}

}
