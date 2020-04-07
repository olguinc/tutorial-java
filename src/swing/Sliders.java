package swing;

import javax.swing.*;
import java.awt.*;

public class Sliders {

	public static void main(String[] args) {

		MarcoSlider m = new MarcoSlider();

		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		m.setVisible(true);
	}
}

class MarcoSlider extends JFrame {

	public MarcoSlider() {

		setTitle("Sliders Clase 96");

		setBounds(350, 250, 400, 350);

		LaminaSlider p = new LaminaSlider();

		add(p);
	}
}

class LaminaSlider extends JPanel {
	
	public LaminaSlider() {
		
		JSlider control = new JSlider(0,100,50);
		
		control.setMajorTickSpacing(25);
		
		control.setMinorTickSpacing(5);
		
		control.setPaintTicks(true);
		
		control.setPaintLabels(true);
		
		add(control);
		
	}

}
