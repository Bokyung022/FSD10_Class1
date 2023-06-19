package June7th;

import java.util.Scanner;

public class MyProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String fn = kb.next();
		System.out.println("Your first name is " + fn);
		
		System.out.println("What is your last name?");
		String ln = kb.next();
		System.out.println("Your last name is " + ln);
		
		System.out.println("What is your age?");
		int age = kb.nextInt();
		System.out.println("Your age is " + age);
		
		kb.close();
		
	}
}
