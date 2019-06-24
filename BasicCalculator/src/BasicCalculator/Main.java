package BasicCalculator;

//import java util Scanner

import java.util.Scanner; 

/**
 *
 * @author User
 */
public class Main {
    
    public static void main(String[] args){
       
        System.out.println("Alegeti optinea din lista de mai jos: ");
        System.out.println("1. Calculul sumei a doua numere intregi");
        System.out.println("2. Calculul sumei a doua numere cu zecimale");
        System.out.println("3. Calculul ariei dreptunghiului/patratului");
        System.out.println("4. Calculul perimetrului dreptunghiului/patratului");
        System.out.println("5. Afisarea primelor N numere pare"); 
        System.out.println("6. Afisarea primelor N numere impare");
        System.out.println("7. Afisarea primelor N numere din sirul lui Fibonacci");
        System.out.println("8. Identificarea literei din alfabetul latin daca este vocala sau consoana");
        
        //creare obiect nou in classa Scanner
        Scanner sc = new Scanner(System.in);
        
        int option = sc.nextInt();
        
        switch (option){
                
                case 1:
                    System.out.println("Salut, introdu primul numar intreg si apasa tasta ENTER");
                    int x = sc.nextInt();
                    System.out.println("Acum introdu al doilea numar intreg si apasa tasta ENTER");
                    int y = sc.nextInt();
                    
                    //crearea obiectului de classa Suma
                    Suma calc = new Suma();
                    //apelam metoda suma din classa Suma
                    int sum = calc.sumaInt(x, y);
                    System.out.println("Suma numerelor intregi " + x + " si " + y + " este: " + sum);
                    break;
                
                case 2:
                    System.out.println("Salut, introdu primul numar de tip double si apasa tasta ENTER");
	            double xd = sc.nextDouble();
	            System.out.println("Acum introdu al doilea numar de tip double si apasa tasta ENTER");
                    double yd = sc.nextDouble();

		    //crearea obiectului de classa Suma
                    Suma suma = new Suma();
                    //apelam metoda suma din classa Suma
                    double sumaDxy = suma.sumaDouble(xd, yd);
                    System.out.println("Suma numerelor de tip double " + xd + " si " + yd + " este: " + sumaDxy);
                    break;            
                
                case 3:
                    System.out.println("Salut, introdu marimea laturii X a dreptunghiului si apasa tasta ENTER");
                    double latx = sc.nextDouble();
                    System.out.println("Acum introdu marimea laturii Y a dreptunghiului si apasa tasta ENTER");
                    double laty = sc.nextDouble();
                    
                    //crearea obiectului ariaDr de classa AriaPerim
                    AriaPerim ariaDr = new AriaPerim();
                    //apelam metoda aria din classa AriaPerim
                    double aria = ariaDr.aria(latx, laty);
                    System.out.println("Aria dreptunghiului cu laturile " + latx + " si " + laty + " este " + aria);
                    break;
                
                case 4:
                    System.out.println("Salut, introdu marimea laturii X a dreptunghiului si apasa tasta ENTER");
                    double laturax = sc.nextDouble();
                    System.out.println("Acum introdu marimea laturii Y a dreptunghiului si apasa tasta ENTER");
                    double laturay = sc.nextDouble();
                    
                    //crearea obiectului perimDr de classa AriaPerim
                    AriaPerim perimDr = new AriaPerim();
                    //apelam metoda perim din classa AriaPerim
                    double perim = perimDr.perim(laturax, laturay);
                    System.out.println("Perimetrul dreptunghiului cu laturile " + laturax + " si " + laturay + " este: " + perim);
                    break;             
                
                case 5:
                    System.out.println("Salut, introdu cantitatea de numere pare ce urmeaza a fi afisata si apasa tasta ENTER");
                    int numPare = sc.nextInt();
                    System.out.println("Afisarea primelor " + numPare + " numere pare");
                    
                    PrimeleNumere nP = new PrimeleNumere();
                    nP.numP(numPare);
                    break;
              
                case 6:
                    System.out.println("Salut, introdu cantitatea de numere impare ce urmeaza a fi afisata si apasa tasta ENTER");
                    int numImpare = sc.nextInt();
                    System.out.println("Afisarea primelor " + numImpare + " numere impare");
                    
                    PrimeleNumere nImp = new PrimeleNumere();
                    nImp.numImp(numImpare);
                    break;
                    
                case 7:
                    System.out.println("Salut, introdu cantitatea de numere din sirul Fibonacci ce urmeaza a fi afisata si apasa tasta ENTER");
                    int numFib = sc.nextInt();
                    System.out.println("Afisarea primelor " + numFib + " numere din sirul lui Fibonacci");
                    
                    Fibonacci nFib = new Fibonacci();
                    nFib.fibo(numFib);
                    break;
                    
                case 8:
                    System.out.println("Salut, introdu o litera a alfabetului latin si apasa tasta Enter");
                    String simbol = sc.next();
                    
                    IdentificaLitera identLit = new IdentificaLitera();
                    identLit.idLit(simbol);
                    break;
                    
                default: 
                    System.out.println("Ati ales o optiune gresita, reveniti in meniul principal"); 
        }
    }
}
 