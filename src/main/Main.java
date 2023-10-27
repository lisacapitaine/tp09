package exemple;
import java.awt.Color;
import java.awt.Font;

import bandeau.Bandeau;

public class Main {

	public static void main(String[] args) {

    Bandeau b = new Bandeau () ; 
    zoomer z = new zoomer () ; 
    clinio c = new clinio () ; 
    Rainbow r = new Rainbow () ; 
    Scenar s = new Scenar () ; 
    
    s.executer (z, 1, b, "entituconstitutionnelement") ; 
    s.executer (c, 3, b, "boo") ; 
    s.executer(r, 1, b, "redondant") ; 



  }
}
