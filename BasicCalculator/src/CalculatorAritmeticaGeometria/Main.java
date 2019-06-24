package CalculatorAritmeticaGeometria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        // creem obiect nou de tip Calculator fara static in metoda
                Calculator calc = new Calculator();
       
        //definim tipul variabilelor
                double x, y, z, b, h;
        
        //creem obiectul de tip scaner pentru a citi de latastatura
                Scanner scanner = new Scanner(System.in);
        
//calculatorul aritmetic cu utilizarea metodelor din classa Calculator
        System.out.println("Introduceti primul numar si apasati Enter");
                //citim prima variabila de la tastatura
                x = scanner.nextDouble();
                
        System.out.println("Introduceti al doilea numar si apasati Enter");
                //citim a doua variabila de la tastatura
                y = scanner.nextDouble();
                  
                //creem o variabila double cu numele suma
                double rez;
        
                //chemam metoda aduna din clasa Calculator pentru definirea valorii pentru variabila rez
                rez = calc.aduna(x, y);
        
                                    // chemarea metodei aduna daca este definita in classa Calculator ca fiind statica 
                                    // suma = Calculator.aduna(x, y); 
        
        
                //afisam variabila suma
                System.out.println("Suma numerelor " + x + " si " + y + " este: " + rez);
    
                                    //chemam metoda scade din clasa Calculator pentru definirea valorii pentru variabila rez
                                    //rez = calc.scade(x, y);
        
                                    // chemarea metodei scade daca este definita in classa Calculator ca fiind statica 
                                    // rez = Calculator.scade(x, y); 
        
                //afisam variabila rez daca este cazul sau apelam direct la metoda scade in timpul afisarii
                System.out.println("Diferenta numerelor " + x + " si " + y + " este: " + calc.scade(x, y));
    
                                    //chemam metoda inmulteste din clasa Calculator pentru definirea valorii pentru variabila rez
                                    //rez = calc.inmulteste(x, y);
        
                                    // chemarea metodei inmulteste daca este definita in classa Calculator ca fiind statica 
                                    // rez = Calculator.inmulteste(x, y); 
        
                //afisam variabila rez daca este cazul sau apelam direct la metoda inmulteste in timpul afisarii
                System.out.println("Produsul inmultirii numerelor " + x + " si " + y + " este: " + calc.inmulteste(x, y));
        
                                    //chemam metoda imparte din clasa Calculator pentru definirea valorii pentru variabila rez
                                    //rez = calc.imparte(x, y);
        
                                    // chemarea metodei daca este definita in classa Calculator ca fiind statica 
                                    // rez = Calculator.imparte(x, y); 
        
                //afisam variabila rez daca este cazul sau apelam direct la metoda imparte in timpul afisarii
                System.out.println("Catul impartirii numerelor " + x + " si " + y + " este: " + calc.imparte(x, y));
    

//calcuator geometric cu apelarea la metodele din classa Geometry                  
            // creem obiect nou de tip Geometry fara static in metoda
                Geometry geo = new Geometry();
    
        //calculul geometruc pentru dreptunghiul de laturile X si y
        System.out.println("Introduceti lungime primei laturi a dreptunghiului si apasati Enter");
        //citim prima variabila de la tastatura
                x = scanner.nextDouble();
                
                System.out.println("Introduceti lungimea celei de a doua laturi a dreptunghiului si apasati Enter");
        //citim a doua variabila de la tastatura
                y = scanner.nextDouble();

        //chemam metoda ariaDr din clasa Geometry pentru definirea valorii pentru variabila rez
                //rez = geo.perimDr(x, y);
        
                        // chemarea metodei daca este definita in classa Geometry ca fiind statica 
                        //      rez = Geometry.perimDr(x, y); 
                        //      rez = Geometry.ariaDr(x, y);
        
                //afisam variabila rez daca este cazul
                System.out.println("Perimetrul dreptunghiului cu laturile " + x + " si " + y + " este: " + geo.perimDr(x, y));        
                System.out.println("Aria dreptunghiului cu laturile " + x + " si " + y + " este: " + geo.ariaDr(x, y));
    
        
        //calculul geometruc pentru patratul de latura X
        System.out.println("Introduceti lungime laturii patratului si apasati Enter");
        //citim variabila de la tastatura
                x = scanner.nextDouble();
                
        //chemam metoda perimPatr din clasa Geometry pentru definirea valorii pentru variabila rez
                //rez = geo.perimPatr(x);
        
                        // chemarea metodei daca este definita in classa Geometry ca fiind statica 
                        //      rez = Geometry.perimPatr(x); 
        
                //afisam variabila rez daca este cazul
                System.out.println("Perimetrul patratului cu latura [" + x + "] este: " + geo.perimPatr(x));        
                System.out.println("Aria patratului cu latura [" + x + "] este: " + + geo.ariaPatr(x));
      
        
        //calculul geometruc pentru triunghiul de laturile x, y si z, baza b si inaltimea h
                        
        System.out.println("Introduceti lungime primei laturi a triunghiului si apasati Enter");
                //citim prima variabila de la tastatura
                x = scanner.nextDouble();
                
        System.out.println("Introduceti lungimea celei de a doua laturi a triunghiului si apasati Enter");
                //citim a doua variabila de la tastatura
                y = scanner.nextDouble();
                
        System.out.println("Introduceti lungimea celei de a treia laturi a triunghiului si apasati Enter");
                //citim a doua variabila de la tastatura
                z = scanner.nextDouble();

                            //chemam metoda perimTri din clasa Geometry pentru definirea valorii pentru variabila rez
                            //rez = geo.perimTri(x, y, z);
        
                            // chemarea metodei daca este definita in classa Geometry ca fiind statica 
                            // rez = Geometry.perimTri(x, y, z); 
                               
                            //afisam variabila rez daca este cazul
        System.out.println("Perimetrul triunghiului cu laturile " + x + " " + y + " si " + z + " este: " + geo.perimTri(x, y, z));            
                
        
        System.out.println("Introduceti lungime bazei triunghiului si apasati Enter");
                //citim prima variabila de la tastatura
                b = scanner.nextDouble();
                
        System.out.println("Introduceti inaltimea triunghiului si apasati Enter");
                //citim a doua variabila de la tastatura
                h = scanner.nextDouble();
                
                            //chemam metoda ariaTri din clasa Geometry pentru definirea valorii pentru variabila rez
                            //rez = geo.ariaTri(b, h);
        
                            // chemarea metodei daca este definita in classa Geometry ca fiind statica 
                            // rez = Geometry.ariaTri(b, h); 
                               
                            //afisam variabila rez daca este cazul
        System.out.println("Aria triunghiului cu baza " + b +  " si inaltimea " + h + " este: " + geo.ariaTri(b, h));
    }
    
}
