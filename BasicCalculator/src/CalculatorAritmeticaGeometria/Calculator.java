package CalculatorAritmeticaGeometria;

/*
 trebuie de calculat suma, diferenta, inmultirea si impartirea a doua numere 
 
pasii de  creare a unei metode:
1. modificatorul de acces: public/private/protected/default
2. optional: static/default
3. tipul de date returnate: primitive (byte, short, char, int, long, float, double, boolean), String sau fara returnare (void)
4. numele metodei tinand cont de conventie (incepe cu litera mica sau simbolul dolar ($) si CamelCase, daca este cazul) si reprezinta o actiune, un verb
5. parametrii metodei intre paranteze rotunde () cu indicarea tipului de date, pot fi indicati sau lasat gol (daca nu este nevoie de ei din exteriorul classei)
6. blocul metodei intre acolade {  ... cod ... } 
7. daca avem tip de date returnate (!!! nu void), obligator ultima linie in cod este return  + expresie de tipul de date indicat: variabile, constante, expresii (matematice, chemeri de metode, expresii logice); 



*/

/**
 *
 * @author User
 */
public class Calculator {
    
    //public static void main (String[] args) {
            
    //}
          
    public double aduna(double x, double y) {
        
        double suma = x + y;
        
        return suma;
        
    }
    
    public double scade(double x, double y) {
        
        double diferenta = x - y;
        
        return diferenta;
        
    }
    
    public double inmulteste(double x, double y) {
        
        double produs = x * y;
        
        return produs;
    }
    
    public double imparte(double x, double y) {
        
        double rezImp = x / y;
        
        return rezImp;
        
    }
}
