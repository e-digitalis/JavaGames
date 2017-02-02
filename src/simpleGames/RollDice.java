/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleGames;

/**
 *
 * @author User
 */
public class RollDice {
	// random number between 0 and (almost) 1



	public static double  randomNumber = Math.random();

	public static double createRandomNumber(){
		randomNumber = (randomNumber * 6) + 1; 
		//making the range go from 1-6 instead of 0 to .9

		int randomInt = (int) randomNumber; 
		//casting as int to truncate decimals
		
		System.out.println(randomInt);
		
		return randomInt;	
	}
}	


