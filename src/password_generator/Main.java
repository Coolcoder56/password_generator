package password_generator;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of character you want: ");
		Scanner input = new Scanner(System.in);
		
		int digit = input.nextInt();
		
		String lower_case = "qwertyuiopasdfghjklzxcvbnm";
		String upper_case = "QWERTYUIOPASDFGHJKLZXCVBNM";
		String Special_char = "!@#\\//$%^&*()_+|}{[=]?<>:";
		String num = "1234567890";
		System.out.println("Choose\n"
				+ " 1)Only upper case \t"
				+ " 2)only lower case \t"
				+ "3)special char\t"
				+ " 4)num \t"
				+ "5)upper+lower case+special char");
		Scanner sc =  new Scanner(System.in);
		int choice = sc.nextInt();
		char[] password = new char [digit];
		
		Random r = new Random();
		
		switch(choice){
			case 1:
				String combination1 = upper_case;
				for(int i = 0; i< digit;i++){
					password [i]= combination1.charAt(r.nextInt(combination1.length()));
				}
			 break;
			case 2:
				String combination2 = lower_case;
				for(int i = 0; i< digit;i++){
					password [i]= combination2.charAt(r.nextInt(combination2.length()));
				}
				break;
			case 3:
				String combination3 = Special_char;
				for(int i = 0; i< digit;i++){
					password [i]= combination3.charAt(r.nextInt(combination3.length()));
				}
				break;
			case 4:
				String combination4 = num;
				for(int i = 0; i< digit;i++){
					password [i]= combination4.charAt(r.nextInt(combination4.length()));
				}
				break;
				
			case 5:
				String combination5 = upper_case+lower_case+Special_char+num;
				for(int i = 0; i< digit;i++){
					password [i]= combination5.charAt(r.nextInt(combination5.length()));
				}
				break;
		}	
	
		
	
		
		
		
//		for(int i=0; i<=digit;i++){
//			int rand = (int) (3*Math.random());
//			
//			switch(rand){
//				case 0:
//				password +=String.valueOf((int)(0 * Math.random()));
//				break;
//				case 1:
//				rand = (int)(lower_case.length() * Math.random());
//				password += String.valueOf(lower_case.charAt(rand));
//				break;
//				case 2:
//				rand = (int)(upper_case.length() * Math.random());
//				password += String.valueOf(upper_case.charAt(rand));
//				case 3:
//				rand = (int)(Special_char.length() * Math.random());
//				password += String.valueOf(Special_char.charAt(rand));
//				}
//			}
		System.out.println("New passwor is "+new String(password));
	}

}
	
