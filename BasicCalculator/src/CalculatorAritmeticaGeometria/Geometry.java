package CalculatorAritmeticaGeometria;

/*
 trebuie de calculat perimetrul di aria la triungi, patrat , dreptunghi
 

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
public class Geometry {
 
    public double perimDr(double x, double y) {
        
        double perim = (x + y) * 2;
        
        return perim;
        
    }
    
    public double ariaDr(double x, double y) {
        
        double aria = x * y;
        
        return aria;
        
    }
    
    public double perimPatr(double x) {
        
        double perim = x * 4;
        
        return perim; 
    }
     
    public double ariaPatr(double x) {
        
        double aria = x * x;
        
        return aria;
        
    }
    
    public double perimTri(double a, double b, double c){
        
        double perim = a + b + c;
        
        return perim; 
        
    }
    
    public double ariaTri(double b, double h) {
        
        double aria = (b * h) / 2;
        
        return aria; 
        
    }
    
}
