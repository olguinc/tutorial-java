package swing;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Sliders2 {

	public static void main(String[] args) {

		MarcoSlider2 m = new MarcoSlider2();

		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		m.setVisible(true);
	}
}

class MarcoSlider2 extends JFrame {

	public MarcoSlider2() {

		setTitle("Sliders Clase 97");

		setBounds(350, 250, 400, 350);

		LaminaSlider2 p = new LaminaSlider2();

		add(p);
	}
}

class LaminaSlider2 extends JPanel {

	public LaminaSlider2() {

		setLayout(new BorderLayout());

		rotulo = new JLabel("En un lugar muy muy lejano...");

		add(rotulo, BorderLayout.CENTER);

		control = new JSlider(8, 50, 12);

		control.setMajorTickSpacing(20);

		control.setMinorTickSpacing(5);

		control.setPaintTicks(true);

		control.setPaintLabels(true);

		control.setFont(new Font("Serif", Font.ITALIC, 10));

		control.addChangeListener(new EventoSlider());

		JPanel lamina_sld = new JPanel();

		lamina_sld.add(control);

		add(lamina_sld, BorderLayout.NORTH);

	}

	private class EventoSlider implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {

//			System.out.println("Estas deslizando a " + control.getValue());

			rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));
		}
	}

	private JLabel rotulo;

	private JSlider control;
}
