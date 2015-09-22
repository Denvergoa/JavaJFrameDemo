import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.JFrame;


public class MyFrame extends JFrame 
{
	public void initOvals(){
		
		GridLayout g1 = new GridLayout(2, 3);
		setLayout(g1);
		for (int i = 0; i<2; i++){
			RectComponent rc = new RectComponent();
			add(rc);
			OvalComponent oc = new OvalComponent(20);
			add(oc);
			TriangleComponent tc = new TriangleComponent(15);
			add(tc);
		}
	}
}
	

