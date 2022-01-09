package com.app.java_jenkin_in_docker;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		System.out.println(checkIfInputIsAnEvenNumber(122));

	}

	public static boolean checkIfInputIsAnEvenNumber(int number) {
		
		return number % 2 == 0;
	}

}
