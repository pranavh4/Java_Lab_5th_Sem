import java.awt.*;
import java.applet.*;
import java.awt.event.*;

class Mouse extends MouseAdapter
{
	
}
public class App1 extends Applet{
	int x = 0, y = 0;
	String msg = "*";
	public void init()
	{	
		Button b1 = new Button("BUTTON");
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				showStatus("Button Clicked");
			}
		});
		add(b1);
		addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent arg0) {
				showStatus("Mouse Clicked");
			}
			public void mouseEntered(MouseEvent arg0) {
				showStatus("Mouse Entered");
			}
			public void mouseExited(MouseEvent arg0) {
				showStatus("Mouse Exited");
			}
			public void mousePressed(MouseEvent arg0) {
				showStatus("Mouse Pressed");
			}
			public void mouseReleased(MouseEvent arg0) {
				showStatus("Mouse Released");
			}
		});
		addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent me) {
				x = me.getX();
				y = me.getY();
				repaint();
			}
			public void mouseMoved(MouseEvent me) {
				showStatus("X: "+me.getX()+" Y: "+me.getY());
			}	
		});
		addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent k) {
				showStatus("Key Pressed: "+ k.getKeyChar());
			}
			public void keyReleased(KeyEvent k) {
				showStatus("Key Released");
			}
			public void keyTyped(KeyEvent k) {
				showStatus("Key Typed: "+ k.getKeyChar());
			}
		});
		setFocusable(true);
	}
	public void paint(Graphics g)
	{
		g.drawString(msg, x, y);
	}
}
