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

public class Suma {

	public static void main(String [] args) {

	// creare obiect nou din clasa scanner pentru a putea introduce informatii de la tastatura calculatorului
		Scanner scanner = new Scanner(System.in);

	//introducere unui mesaj de salut, cu solicitarea de a introduce primul numar 
		System.out.println("Salut, introdu primul numar intreg si apasa tasta ENTER");
	
		int numix = scanner.nextInt();
	
	//introducere unui mesaj cu solicitarea de a introduce al doilea numar 	
		System.out.println("Acum introdu al doilea numar intreg si apasa tasta ENTER");
		
		int numiy = scanner.nextInt();

	//calculul sumei numerelor x si y
		int sumaixy = numix + numiy;

	//afiseaza suma celor doua numere
		System.out.println("Suma numerelor intregi " + numix + " si " + numiy + " este " + sumaixy);


//partea a doua, cu numere de tip double

	//introducere unui mesaj de salut, cu solicitarea de a introduce primul numar 
		System.out.println("Salut, introdu primul numar de tip double si apasa tasta ENTER");
	
	// creare obiect nou din clasa scanner pentru a putea introduce informatii de la tastatura calculatorului
		double numdx = scanner.nextDouble();
	
	//introducere unui mesaj cu solicitarea de a introduce al doilea numar 	
		System.out.println("Acum introdu al doilea numar de tip double si apasa tasta ENTER");
		
		double numdy = scanner.nextDouble();

		double sumadxy = numdx + numdy;

	//afiseaza suma celor doua numere
		System.out.println("Suma numerelor de tip double " + numdx + " si " + numdy + " este " + sumadxy);

//partea a treia, cu numere de tip floate

	//introducere unui mesaj de salut, cu solicitarea de a introduce primul numar 
		System.out.println("Salut, introdu primul numar de tip float si apasa tasta ENTER");
	
	// creare obiect nou din clasa scanner pentru a putea introduce informatii de la tastatura calculatorului
		float numfx = scanner.nextFloat();
	
	//introducere unui mesaj cu solicitarea de a introduce al doilea numar 	
		System.out.println("Acum introdu al doilea numar de tip float si apasa tasta ENTER");
		
		float numfy = scanner.nextFloat();

		float sumafxy = numfx + numfy;

	//afiseaza suma celor doua numere
		System.out.println("Suma numerelor de tip float " + numfx + " si " + numfy + " este " + sumafxy);

	}
}
