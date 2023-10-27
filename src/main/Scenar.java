package exemple;

import bandeau.Bandeau;

public class Scenar {

public void executer(Effet e, int nb, Bandeau b, String message){
     for (int i = 0; i<nb; i++){
        e.executer (message, b) ;   

     }
}


}
