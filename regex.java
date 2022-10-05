package assignments;

import java.util.Scanner;

public class regex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("input regex: ");
		String regex=sc.nextLine();
		boolean checkbalance;
		
		try {
			checkbalance="".matches(regex);
			while(true) {
				System.out.print("input String: ");
				String input=sc.nextLine();
				System.out.println(input.matches(regex));
			}
			
		} catch (Exception e) {
		System.out.println("balance nya");
		}

	}

}
