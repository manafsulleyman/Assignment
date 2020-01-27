package org.amalitech.classcode21_01_2020;

import java.util.Scanner;

	public class ClassCode_assigmet {
    static Scanner kybd_input = new Scanner (System.in);
		
    public static void main(String[] args) {
			
			//Initializations
			boolean program_Running_bool = false;
			
			System.out.println("Please enter start to begin the program");
			//We need a trigger to end the code
			re_run_kybd_input(code_trigger_stater_str);
			}
            static String code_trigger_stater_str = "start";
			static String code_trigger_ender_str = "end";
            private static void re_run_kybd_input(String code_trigger_stater_str) {
			boolean program_Running_bool;
			
			String kybd_input_str = kybd_input.nextLine();
			
                   if (kybd_input_str.equalsIgnoreCase(code_trigger_stater_str)) {

			program_Running_bool = true;

			// function that accepts the text to be displayed from the user
			
			while(program_Running_bool == true) {
				
				System.out.println("Enter Text here .....\n");
				String todisplay = kybd_input.nextLine();
				System.out.println("Your input is : " + todisplay +"\n");
			
			if(todisplay.equalsIgnoreCase("end")) {
				program_Running_bool = false; 
				System.out.println("The program has ended");
				System.exit(0);
				
				}
			}
			}
			else if 
				(kybd_input_str.equalsIgnoreCase(code_trigger_ender_str)) {
				
				System.out.println("Wrong Input, Please Enter Start to begin");
				re_run_kybd_input(code_trigger_stater_str);
				//System.exit(0);
			}
			else {
		
				System.out.println( "YWrong Input, Please Enter Start to begin");
			re_run_kybd_input(code_trigger_stater_str);
			}
				kybd_input.close();

			//re_run_kybd_input(code_trigger_stater_str);
			}
	}
