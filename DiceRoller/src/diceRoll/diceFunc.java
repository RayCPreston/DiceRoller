package diceRoll;


import java.util.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class diceFunc {
	
	public static int rollDice(int numDie, String die) {
		int rand;
		
		switch(die) {
		case "d4": rand = 4;
			break;
		case "d6": rand = 6;
			break;
		case "d8": rand = 8;
			break;
		case "d10": rand = 10;
			break;
		case "d12": rand = 12;
			break;
		case "d20": rand = 20;
			break;
		case "d100": rand = 100;
			break;
		default: rand = 0;
			break;
		}
		
		if(rand == 0) {
			System.out.println("--Error with dice selection--");
			return 0;
		}
		
		int result = 0;
		for (int i = 0; i < numDie; i++) {
			int temp = ThreadLocalRandom.current().nextInt(2, rand + 1);
			result += temp;
		}
		
		return result;
		
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input how many die you would like to roll");
		int numDie = sc.nextInt();
		System.out.println("What kind of die would you like to roll?");
		String die = sc.next();
		
		System.out.println(rollDice(numDie, die));
		
	}

}


