package BasicCalculator;

/**
 *
 * @author User
 */


//importam classa scaner din utility java

import java.util.Scanner;

public class Fibonacci {

	public static void main(String args) {

		// creare obiect nou din clasa scanner pentru a putea introduce informatii de la tastatura calculatorului
		Scanner scanner = new Scanner(System.in);

		//introducere unui mesaj de salut, cu solicitarea de a introduce cantitatea de numere pare ce urmeaza a fi afisate  
		System.out.println("Salut, introdu cantitatea de numere din sirul Fibonacci ce urmeaza a fi afisata si apasa tasta ENTER");
	
		int numFib = scanner.nextInt();
			
		System.out.println("Afisarea primelor " + numFib + " numere din sirul lui Fibonacci");

	 	int num1 = 0, num2 = 1, num3;
	 	num3 = num2 + num1;
	 		 	
	 	//identificarea si afisarea numerelor Fibonacci 
		for (int i = 0; i < numFib; i++) {
			
			int num = num1 + num2;
			
			num1 = num2;
			
			num2 = num3;
			
			num3 = num2 + num1;
			
			System.out.println("  " + num);
			
		}
	}
        
        public void fibo(int numFib){
                int num1 = 0, num2 = 1, num3;
	 	num3 = num2 + num1;
	 		 	
	 	//identificarea si afisarea numerelor Fibonacci 
		for (int i = 0; i < numFib; i++) {
			
			int num = num1 + num2;
			
			num1 = num2;
			
			num2 = num3;
			
			num3 = num2 + num1;
			
			System.out.println("  " + num);
                }
        }
}