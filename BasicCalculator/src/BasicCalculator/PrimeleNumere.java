/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicCalculator;

/**
 *
 * @author User
 */

//importam classa scaner din utility java

import java.util.Scanner;

public class PrimeleNumere {

	public static void main(String args) {

		// creare obiect nou din clasa scanner pentru a putea introduce informatii de la tastatura calculatorului
		Scanner scanner = new Scanner(System.in);

		//introducere unui mesaj de salut, cu solicitarea de a introduce cantitatea de numere pare ce urmeaza a fi afisate  
		System.out.println("Salut, introdu cantitatea de numere pare ce urmeaza a fi afisata si apasa tasta ENTER");
	
		int numPare = scanner.nextInt();
			
		System.out.println("Afisarea primelor " + numPare + " numere pare");

	 	int num = 0; 
		int highLimit = numPare*2;
		//identificarea si afisarea numerelor pare
		while (++num < highLimit && ++num % 2 ==0) {
			
			System.out.println("  " + num);
			
		}

		//introducere unui mesaj de salut, cu solicitarea de a introduce cantitatea de numere impare ce urmeaza a fi afisate  
		System.out.println("Salut, introdu cantitatea de numere impare ce urmeaza a fi afisata si apasa tasta ENTER");
	
		int numImpare = scanner.nextInt();
			
		System.out.println("Afisarea primelor " + numImpare + " numere impare");

		num = -1;
		highLimit = numImpare * 2;
		//identificarea si afisarea numerelor impare
		while (++num < highLimit && ++num % 2 !=0 ) {

			System.out.println(" " + num);
			 
		}	
	}
        
        // metoda ce afiseaza primele numerele pare
        public void numP(int numPare) {
            int num = 0; 
            int highLimit = numPare*2;
            //identificarea si afisarea numerelor pare
            while (++num < highLimit && ++num % 2 ==0) {
                
                System.out.println(" " + num);
			
            } 
        } 
        
        // metoda ce afiseaza primele numerele impare
        public void numImp(int numImpare){
            int num = -1;
            int highLimit = numImpare * 2;
            //identificarea si afisarea numerelor impare
            while (++num < highLimit && ++num % 2 !=0 ) {

            System.out.println(" " + num);
        
            }
        }
        
        
}

        
