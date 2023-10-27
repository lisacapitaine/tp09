package exemple;
import bandeau.Bandeau;

public class clinio extends Effet {

	public void executer(String Message, Bandeau b)
	{
        
        for(int i =0 ; i<=7; i++){
			b.setMessage(Message);
			b.sleep(22);
			b.setMessage("");
			b.sleep(22);
        }
	}
}
