import java.awt.Graphics;

import javax.swing.JComponent;


public class OvalComponent extends GapComponent
{
	
	public OvalComponent(int gap) {
		super(gap);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		g.drawOval(getGap(), getGap(), getWidth() - 2*getGap(), getHeight() - 2*getGap());
	}
	
}
