package swing;

import java.awt.*;
import javax.swing.*;

public class Spinners {

	public static void main(String[] args) {
		
		MarcoSpinner m = new MarcoSpinner();
		
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		m.setVisible(true);
	}
}

class MarcoSpinner extends JFrame{
	
	public MarcoSpinner() {
		
		setTitle("Spinners Clase 98");

		setBounds(350, 250, 400, 350);
		
		LaminaSpinner p = new LaminaSpinner();
		
		add(p);	
	}
}

class LaminaSpinner extends JPanel{
	
	public LaminaSpinner() {
		
		//String lista[]= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		JSpinner control = new JSpinner(new SpinnerNumberModel(5,0,10,1));
		
		Dimension d = new Dimension(100,20);
		
		control.setPreferredSize(d);
		
		add(control);
	}
}