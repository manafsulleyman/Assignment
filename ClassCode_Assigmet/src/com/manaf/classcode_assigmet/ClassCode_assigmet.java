package com.manaf.classcode_assigmet;

import java.util.Scanner;

public class ClassCode_assigmet {

	public static void main(String[] args) {
		
		//Initializations
		boolean program_Running_bool = false;
		String code_trigger_stater_str = "start";
		
		//We need a trigger to end the code
		re_run_kybd_input(code_trigger_stater_str);
		

		}

		static String code_trigger_ender_str = "end";

		private static void re_run_kybd_input(String code_trigger_stater_str) {
		boolean program_Running_bool;
		Scanner kybd_input = new Scanner (System.in);
		String kybd_input_str = kybd_input.nextLine();
		

		if (kybd_input_str.equalsIgnoreCase(code_trigger_stater_str)) {

		program_Running_bool = true;

		// function that accepts the text to be displayed from the user
		int x=1 ; 
		int y=20; 
		
		while(x<y) {
			
			System.out.println("Enter Text here .....\n");
			String todisplay = kybd_input.nextLine();
			System.out.println("Your input is : " + todisplay +"\n");
				x++;
		if(todisplay.equalsIgnoreCase("end")) {
			System.out.println("The program has ended");
			System.exit(0);
			
			}
		}
		
		}
		else if 
			(kybd_input_str.equalsIgnoreCase(code_trigger_ender_str)) {
			
			System.out.println("The program has ended");
			System.exit(0);
		}
		else {
	
			System.out.println( "Your input is: "+ kybd_input_str +
								" Please enter start to restart the program");
		re_run_kybd_input(code_trigger_stater_str);
		}
			kybd_input.close();

		//re_run_kybd_input(code_trigger_stater_str);
		}

}




