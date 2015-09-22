import javax.swing.JFrame;


public class Starter 
{
	public static void main(String[] args){
		MyFrame frame = new MyFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(200, 200, 300, 300);
		frame.initOvals();
		frame.setVisible(true);
	} 
}
