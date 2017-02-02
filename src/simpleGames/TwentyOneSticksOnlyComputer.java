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

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
*
* @author User
*/

public class TwentyOneSticksOnlyComputer {

public String Player1;
public String Player2;

public int sticks = 21;
public int random;
public static int gameCounter = 0;

Scanner myScanner = new Scanner(System.in);

public static void main(String[] args) {
TwentyOneSticksOnlyComputer ts21 = new TwentyOneSticksOnlyComputer();
ts21.playGame();
// ts21.testRandom();
}

public void testRandom(){
for (int counter = 0; counter <11; counter++){
int test = createRandom();
System.out.println(test);
}
}

public void playGame(){
System.out.println("Number of sticks at beginning of game: " + sticks);
while (sticks >0){
// ask();
int minus = createRandom();
sticks -= minus;
gameCounter ++;
System.out.println("Game rep: "+ gameCounter + " Number of sticks remaining: " + sticks);
}
}

public int ask(){
System.out.println("How many sticks do you want to take?");
int answer = myScanner.nextInt();
return answer;
}

public int createRandom(){

// nextInt is normally exclusive of the top value,
// so add 1 to make it inclusive
random = ThreadLocalRandom.current().nextInt(1, 3);
return random;
}
}
