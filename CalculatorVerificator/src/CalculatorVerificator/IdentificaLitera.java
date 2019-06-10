/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorVerificator;

/**
 *
 * @author User
 */
//importam classa scaner din utility java

import java.util.Scanner;

public class IdentificaLitera {

	public static void main(String [] args) {

	// creare obiect nou din clasa scanner pentru a putea introduce informatii de la tastatura calculatorului
		Scanner scanner = new Scanner(System.in);
		
	//introducere unui mesaj de salut, cu solicitarea de a introduce o litera alfabetului latin
		System.out.println("Salut, introdu o litera a alfabetului latin si apasa tasta Enter");
	
		String simbol = scanner.nextLine();

	//stabilim ca lungimea sirului sa fie egala cu 1, ca sa fie posibila introducerea unei singure litere
		if (simbol.length() > 1) {
			System.out.println("Ati introdus mai mult de o litera sau simboluri alfanumerice, reveniti si introduceti o singura litera");
		
		} else {
			//vocalele alfabetului latin: A, E, I, O, U
			switch(simbol) {
	
				case "A" :
				case "E" :
				case "I" :
				case "O" :
				case "U" :
				case "a" :
				case "e" :
				case "i" :
				case "o" :
				case "u" :

				System.out.println("Litera " + simbol + " este o vocala");
				break;

				case "B" :
				case "C" :
				case "D" :
				case "F" :
				case "G" :
				case "H" :
				case "J" :
				case "K" :
				case "L" :
				case "M" :
				case "N" :
				case "P" :
				case "Q" :
				case "R" :
				case "S" :
				case "T" :
				case "V" :
				case "W" :
				case "X" :
				case "Y" :
				case "Z" :
				case "b" :
				case "c" :
				case "d" :
				case "f" :
				case "g" :
				case "h" :
				case "j" :
				case "k" :
				case "l" :
				case "m" :
				case "n" :
				case "p" :
				case "q" :
				case "r" :
				case "s" :
				case "t" :
				case "v" :
				case "w" :
				case "x" :
				case "y" :
				case "z" :
				
				System.out.println("Litera " + simbol + " este o consoana");
				break;

			default:
				System.out.println("Simbolul " + simbol + " nu este o litera a alfabetului latin");

			}
		} 
	}
}