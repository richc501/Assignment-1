//Richard Cunningham
//Ask for inputs
//call to methods add, subtract, multiply, divide
//fellow formulas for each method
//output answers
import java.util.Scanner;
public class ComplexNumber 
{
	private static double answerRealPart, answerImaginaryPart, realPart1, realPart2, imaginaryPart1, imaginaryPart2;
	private static String addAnswer, subtractAnswer, multiplyAnswer, divideAnswer;
	private static Scanner keyboard = new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Input real part 1");//inputs real parts
		realPart1 = keyboard.nextDouble();
		System.out.println("Input real part 2");//inputs real parts
		realPart2 = keyboard.nextDouble();
		System.out.println("Input imaginary part 1");//inputs imaginary parts
		imaginaryPart1 = keyboard.nextDouble();
		System.out.println("Input imaginary part 2");//inputs imaginary parts
		imaginaryPart2 = keyboard.nextDouble();
		add();
		System.out.println("Sum = " + addAnswer);
		subtract();
		System.out.println("Difference = " + subtractAnswer);
		multiply();
		System.out.println("Product = " + multiplyAnswer);
		divide();
		System.out.println("Quotient = " + divideAnswer);
	}
	private static String add()//adds complex numbers
	{
		answerRealPart = (realPart1+realPart2);
		answerImaginaryPart = (imaginaryPart1+imaginaryPart2);
		addAnswer = answerRealPart + "+" + answerImaginaryPart + "i";
		return addAnswer;
	}
	public static String subtract()//subtracts complex numbers
	{
		answerRealPart = (realPart1-realPart2);
		answerImaginaryPart = (imaginaryPart1-imaginaryPart2);
		subtractAnswer = answerRealPart + "+" + answerImaginaryPart + "i";
		return subtractAnswer;
	}
	public static String multiply()//Multiples complex numbers
	{
		answerRealPart = (realPart1*realPart2)-(imaginaryPart1*imaginaryPart2);
		answerImaginaryPart = (realPart1*imaginaryPart2)+(imaginaryPart1*realPart2);
		multiplyAnswer = answerRealPart + "+" + answerImaginaryPart + "i";
		return multiplyAnswer;
	}
	public static String divide()//Divides complex numbers
	{
		double denominator = (realPart2*realPart2)+(imaginaryPart2*imaginaryPart2);
		answerRealPart = (((realPart1*realPart2)+(imaginaryPart1*imaginaryPart2))/(denominator));
		answerImaginaryPart = (((imaginaryPart1*realPart2)-(realPart1*imaginaryPart2)))/(denominator);
		divideAnswer = answerRealPart + "+" + answerImaginaryPart + "i";
		return divideAnswer;
	}
	public String toString()
	{
		return answerRealPart+"+"+answerImaginaryPart+"i";
	}
}
