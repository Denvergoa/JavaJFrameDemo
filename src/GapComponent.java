import javax.swing.JComponent;


public class GapComponent extends JComponent 
{
	private int gap = 10;
	
	public GapComponent() {  //конструктор без параметров
		this(10);
	} 
	public GapComponent(int gap){ //конструктор с параметром
		this.gap = gap;
	}

	public int getGap() {
		return gap;
	}

	public void setGap(int gap) {
		this.gap = gap;
	}
	
	
}
