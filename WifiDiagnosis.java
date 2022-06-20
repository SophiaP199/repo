//Class:CMSC203
//Instructor: 
//Description: Create a wifi diagnostic program that asks the user a series of questions
//in order to try and solve their wifi problem. Primarily uses if/else statements
//Platform/compiler:
//I pledge that I have completed the programming assignment independently.
//I have not copied the code from a student or any source.
//Print your Name here: Sophia Pettit

import java.util.Scanner;

public class WifiDiagnosis{

public static void main(String[] args) {

	//initialize variables and set up scanner class
	Scanner keyboard = new Scanner(System.in);
	String response;
	String solution;
	
	//introduction to program
	System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
	
	//first step
	System.out.println("First step: reboot your computer");
	System.out.println("Are you able to connect with the internet? (yes or no)");
	response = keyboard.nextLine();
	solution = "Rebooting your computer seemed to work";
	
	//error check the users response 
	while( !(response =="no" || response =="yes")){
		System.out.println("Error, please reenter your response, it should either be a no or a yes.");
		response = keyboard.nextLine();
		}

	//set up loop that will allow user to exit program once "yes" is entered
	while(response != "yes"){
		
		//second step
		System.out.println("Second Step: reboot your router");
		System.out.println("Now are you able to connect with the internet? (yes or no)");
		response = keyboard.nextLine();
		solution = "rebooting your router seemed to work";
		
		//error check response
		while( !(response =="no" || response =="yes")){
			System.out.println("Error, please reenter your response, it should either be a no or a yes.");
			response = keyboard.nextLine();
			}
		}

	while(response !="yes"){
		//third step
		System.out.println("make sure the cables to your router are plugged in firmly and your router is getting power");
		System.out.println("Now are you able to connect with the internet? (yes or no)");
		response = keyboard.nextLine();
		solution = "rechecking your router connection seemed to work";

		//error check response
		while( !(response =="no" || response =="yes")){
			System.out.println("Error, please reenter your response, it should either be a no or a yes.");
			response = keyboard.nextLine();
			}
		}
		
	while(response !="yes"){
		//fourth step
		System.out.println("move your computer closer to your router");
		System.out.println("Now are you able to connect with the internet? (yes or no)");
		response = keyboard.nextLine();
		solution = "moving your computer closer to your router seemed to work";
		
		//error check response
		while( !(response =="no" || response =="yes")){
			System.out.println("Error, please reenter your response, it should either be a no or a yes.");
			response = keyboard.nextLine();
			}
		}

	while(response !="yes"){
		//fifth step
		System.out.println("Try contacting your ISP");
		
		}
	
	//prints which step worked
	System.out.println(solution);

	//prints programmer name
	System.out.println("Programmer Name: Sophia Pettit");





	}
}