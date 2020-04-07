package swing;

import java.awt.*;
import javax.swing.*;

public class Spinners2 {

	public static void main(String[] args) {

		MarcoSpinner2 m = new MarcoSpinner2();

		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		m.setVisible(true);
	}
}

class MarcoSpinner2 extends JFrame {

	public MarcoSpinner2() {

		setTitle("Spinners Clase 99");

		setBounds(350, 250, 400, 350);

		LaminaSpinner2 p = new LaminaSpinner2();

		add(p);
	}
}

class LaminaSpinner2 extends JPanel {

	public LaminaSpinner2() {

		JSpinner control = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1) {

			// CLASE INTERNA ANONIMA

			public Object getNextValue() {

				return super.getPreviousValue();
			}

			public Object getPreviousValue() {

				return super.getNextValue();
			}
		});

		Dimension d = new Dimension(100, 20);

		control.setPreferredSize(d);

		add(control);
	}
}

/*
 * private class MiModeloSpinner extends SpinnerNumberModel {
 * 
 * public MiModeloSpinner() {
 * 
 * super(5, 0, 10, 1); }
 * 
 * public Object getNextValue() {
 * 
 * return super.getPreviousValue(); }
 * 
 * public Object getPreviousValue() {
 * 
 * return super.getNextValue(); } } }
 */