package exemple;
import java.awt.Color;
import java.awt.Font;

import bandeau.Bandeau;


public class zoomer extends Effet {
 

	public void executer(String message, Bandeau b){ 
         b.setMessage(message);
            for (int i = 0; i < 100; i += 17) {
            b.setFont(new Font("Dialog", Font.BOLD, i));
            b.sleep(300);
        }
        


}
}
