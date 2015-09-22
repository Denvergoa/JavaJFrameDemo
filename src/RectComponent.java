import java.awt.Graphics;


public class RectComponent extends GapComponent 
{
//	public RectComponent() {
//		this(10);
//	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		//g.drawRect(gap, gap, getWidth() - 2*gap, getHeight() - 2*gap);
		g.drawRect(getGap(), getGap(), getWidth() - 2*getGap(), getHeight() - 2*getGap());
	}	

}
