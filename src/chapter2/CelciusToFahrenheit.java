package chapter2;

import java.util.Scanner;
public class CelciusToFahrenheit{


	public static void main(String [] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter degree in Celcius: ");
	double degreeInCelcius = input.nextDouble();
	
	double degreeInFahrenheit = (9.0 / 5.0) * degreeInCelcius + 32;
	
	System.out.println(degreeInCelcius+ " in Celcius is " +degreeInFahrenheit+ " in Fahrenheit");

	}
}