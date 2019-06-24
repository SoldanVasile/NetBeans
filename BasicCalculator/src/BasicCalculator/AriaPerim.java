package BasicCalculator;
/**
 *
 * @author User
 */
//importam classa scaner din utility java

import java.util.Scanner;

public class AriaPerim {

	public static void main(String args) {

	// creare obiect nou din clasa scanner pentru a putea introduce informatii de la tastatura calculatorului
		Scanner scanner = new Scanner(System.in);

	//introducere unui mesaj de salut, cu solicitarea de a introduce primul numar 
		System.out.println("Salut, introdu latura patratului si apasa tasta ENTER");
	
	// creare obiect nou din clasa scanner pentru a putea introduce informatii de la tastatura calculatorului
		double lat = scanner.nextDouble();
	
	// calculul ariei patratului de latura X
		double aria = lat * lat;

	//afiseaza aria patratului cu latura x
		System.out.println("Aria patratului cu latura " + lat + " este " + aria);

	// calculul perimetrului patratului de latura X
		double perim = lat * 4;

	//afiseaza perimetrul patratului cu latura x
		System.out.println("Perimetrul patratului cu latura " + lat + " este " + perim);


//partea a doua cu dreptunghiul cu laturile X si Y

	//introducere unui mesaj de salut, cu solicitarea de a introduce marimea laturii X a dreptunghiului 
		System.out.println("Salut, introdu marimea laturii X a dreptunghiului si apasa tasta ENTER");
		
	// creare obiect nou din clasa scanner pentru a putea introduce informatii de la tastatura calculatorului
		double latx = scanner.nextDouble();
	
	//introducere unui mesaj cu solicitarea de a introduce marimea laturii Y a dreptungiului	
		System.out.println("Acum introdu marimea laturii Y a dreptunghiului si apasa tasta ENTER");
		
		double laty = scanner.nextDouble();

		double ariaxy = latx * laty;

	//afiseaza aria dreptunghiului cu laturile X si Y
		System.out.println("Aria dreptunghiului cu laturile " + latx + " si " + laty + " este " + ariaxy);

	// calculul perimetrului dreptunghiului cu laturile X si Y
		double perimxy = (latx + laty) * 2;

	//afiseaza perimetrul dreptunghiului cu laturile X si Y
		System.out.println("Perimetrul dreptunghiului cu laturile " + latx + " si " + laty + " este " + perimxy);

	}
        
        public double aria(double latx, double laty){
        return latx * laty;
        }
        
        public double perim(double latx, double laty){
            return (latx + laty) * 2; 
        }
}
