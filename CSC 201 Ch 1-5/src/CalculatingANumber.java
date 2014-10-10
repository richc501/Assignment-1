//Richard Cunningham
//If the chapter number is 2, divide your student ID by 26, consider the remainder and increment it by 1. 
//The result you obtain represents the number of the programming exercise you will solve for online discussions, which should be from chapter 2.
//If the chapter number is 3, divide your student ID by 34, consider the remainder and increment it by 1. 
//The result you obtain represents the number of the programming exercise you will solve for online discussions, which should be from chapter 3.
//If the chapter number is 4, divide your student ID by 46, consider the remainder and increment it by 1. 
//The result you obtain represents the number of the programming exercise you will solve for online discussions, which should be from chapter 4.
//If the chapter number is 5, divide your student ID by 38, consider the remainder and increment it by 1. 
//The result you obtain represents the number of the programming exercise you will solve for online discussions, which should be from chapter 5.
//Consider the problem, design an algorithm (or algorithms) that would solve the problem, and then implement the algorithm in Java.
//Please insert the algorithm written in pseudocode as a comment in the beginning of your program.
//Submit the source code, along with snapshots of your running program - you can take snapshots using PrintScreen, making sure that the console window in which you run the program appears on the screen.
//Copy the snapshot in a word processing program of your choosing. If your program has different outcomes, take snapshots of each variation.
//Upload your screenshots in Blackboard using the Assignment Upload area below.

//Ask for input for student ID
//mod student ID by 4
//make switch for 2, 3, 4, and 5
// mod studentID by certain number based of chapter and add that by one;
//Ask user where the number is located in text and input the page number;
//output exercise number, chapter number, page number
import java.util.Scanner;
public class CalculatingANumber 
{
	public static void main(String[]args)
	{
		int studentID, chapterNumber, programmingExerciseNumber = 0, pageNumber;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your student ID please.");
		studentID = keyboard.nextInt();//inputs student ID
		//determines which chapter
		chapterNumber = (studentID%4)+2;			
		System.out.println(chapterNumber);
		switch (chapterNumber) //determine which case is needed
		{
		case 2://Chapter 2
			System.out.println("Chapter 2 Selected, Determining which number you need to do.");
			programmingExerciseNumber = studentID%26;//Determines exercise number
			programmingExerciseNumber++;
			System.out.println("Your problem to do in Chapter 2 is number: "+programmingExerciseNumber);
			break;
		case 3://Chapter 3
			System.out.println("Chapter 3 Selected, Determining which number you need to do.");
			programmingExerciseNumber = studentID%34;//Determines exercise number
			programmingExerciseNumber++;
			System.out.println("Your problem to do in Chapter 3 is number: "+programmingExerciseNumber);
			break;
		case 4://Chapter 4
			System.out.println("Chapter 4 Selected, Determining which number you need to do.");
			programmingExerciseNumber = studentID%46;//Determines exercise number
			programmingExerciseNumber++;
			System.out.println("Your problem to do in Chapter 3 is number: "+programmingExerciseNumber);
			break;
		case 5://Chapter 5
			System.out.println("Chapter 3 Selected, Determining which number you need to do.");
			programmingExerciseNumber = studentID%38;//Determines exercise number
			programmingExerciseNumber++;
			System.out.println("Your problem to do in Chapter 3 is number: "+programmingExerciseNumber);
			break;
		}
		System.out.println("Please input the page number where the number is located in the text.");
		pageNumber = keyboard.nextInt();//inputs the page number
		System.out.println("Please solve programming exercise "+programmingExerciseNumber+" from chapter "+chapterNumber+
				", from page "+pageNumber);
		
	}
}
