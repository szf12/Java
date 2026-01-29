import java.util.Random;
import java.util.Vector;
import java.util.Scanner;

class Kivalasztas {

	
import java.util.Random;
import java.util.Scanner;

/*
 * Készítő: Márton Róbert Hetény
 */
class Kocka {


import java.util.Random;
import java.util.Scanner;

class Kocka{

  
/* Pál Orsolya */

import java.util.Vector;
import java.util.Random;
import java.util.Scanner;

class Kocka{
	public static void main( String[] args ){
		System.out.println( "Készítő: Pál Orsolya (Kockajáték)\n"
		+ "A játék menete: 3 dobókockával dobunk. Először a gép dob, utána a játékos, azaz te. " 
		+ "A játékosnak el kell indítania a saját dobását az \'I\' billentyű lenyomásával. " 
		+ "A többi billentyű lenyomására kilépünk a játékból. "
		+ "Végül összesítjük a pontokat, és aki nagyobbat dobott, az nyer." );
		
		Vector<Integer> machineDices = new Vector<>();
		Vector<Integer> playerDices = new Vector<>();
				
		Random rand = new Random();
		for( int i = 0; i < 3; i++ ){
			machineDices.add( rand.nextInt( 6 ) + 1 );
		}
		System.out.println( "\nA gép dobása: " + machineDices );
		System.out.print( "Saját kockadobás indítása (I - Igen): " );
		
		Scanner scan = new Scanner( System.in );
		char startGame = scan.next().charAt(0);
		if( startGame == 'I' || startGame == 'i') {
			for( int i = 0; i < 3; i++ ){
				playerDices.add( rand.nextInt( 6 ) + 1 );
			}
			System.out.println( "A játékos dobása: " + playerDices );
						
			int playerPoints = 0;
			int machinePoints = 0;
			for( int playerDice : playerDices ){
				playerPoints += playerDice;
			}
			
			for( int machineDice : machineDices ){
				machinePoints += machineDice;
			}
			
			System.out.println( "\nÖsszesítés: ");
			System.out.println( "Gép: " + machinePoints );
			System.out.println( "Játékos: " + playerPoints );
			
			if( playerPoints > machinePoints ){
				System.out.println( "\nNyertél" );
			} else if( playerPoints == machinePoints ){
				System.out.println( "\nDöntetlen");
			} else {
				System.out.println( "\nVesztettél" );
			}
		}		
	}
}
Kocka.java
Külső
Kocka.java megjelenítése.

}

}
Kocka.java
Külső
Kocka.java megjelenítése.
    }
}

}
