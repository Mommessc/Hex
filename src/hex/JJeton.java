package hex;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class JJeton extends JLabel {
	
	int x, y;
	
	/** Constructeur */
	public JJeton(int column, int line, int joueur) {
		super();
		if (joueur == 1) {
			setIcon(new ImageIcon("pion_blanc2.png"));
		} else if (joueur == -1) {
			setIcon(new ImageIcon("pion_noir.png"));
		}
		this.x =6 +  66*column + 100 + 33*line;
		this.y =5 +  57*line + 92;
		
		//line = (ev.getY() - 92)/58;
		//column = (ev.getX() - 100 - line*33)/66;
		
		setBounds(x, y, 66, 58);
	}
	
	public int getColumn() {
		return x;
	}
	
	public int getLine() {
		return y;
	}
}
