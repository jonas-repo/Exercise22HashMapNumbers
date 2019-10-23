package com.exercise22hashmapofnumbers.app;
import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;;

public class OccurrencesApp {

	public static void main(String[] args) 
	{
		//constant declarations
		final int ELEMENTS = 10;
		
		//Variables declarations
		
		//Objects declaration
		
		Random numbers = new Random();
		HashMap<Integer,Integer> myHash = new HashMap<Integer, Integer>();
		
		//objects initialization
		int[] myArray = new int[ELEMENTS];
		
		for (int i = 0; i < ELEMENTS; i++) 
		{
			myArray[i] = numbers.nextInt(5);
			System.out.print(" "+myArray[i]);
		}
		System.out.println("");
		//Process get the elements that are repeated in the array
		int ocurrences = 0;
		for(int element : myArray )
		{
			if(myHash.containsKey(element))
			{
				ocurrences = myHash.get(element);
				ocurrences++;
				myHash.put(element,ocurrences);
			}
			else
			{
				myHash.put(element, 1);
			}
		}
		
		System.out.println("Ocurrences");
		System.out.println(myHash);
		
		
	}

}
