package exemple;
import java.awt.Color;
import java.awt.Font;

import bandeau.Bandeau;


public class Rainbow extends Effet {

	public void executer (String Message, Bandeau b)
	{
        b.setFont(new Font("Comic sans ms", Font.PLAIN, 13));

		for(int i = 0; i < 60 ;i++)
		{
			b.setMessage(Message);
			b.setForeground(Color.yellow);
			b.sleep(369);
			b.setForeground(Color.orange);
			b.sleep(324);
			b.setForeground(Color.red);
			b.sleep(300);
			b.setForeground(Color.pink);
			b.sleep(277);
            b.setForeground(Color.blue);
			b.sleep(211);
            b.setForeground(Color.green);
			b.sleep(200);
		}
	}
}
