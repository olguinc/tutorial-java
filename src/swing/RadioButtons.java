package swing;

import javax.swing.*;

public class RadioButtons {

	public static void main(String[] args) {

		MarcoRadio m = new MarcoRadio();

		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		m.setVisible(true);
	}
}

class MarcoRadio extends JFrame {

	public MarcoRadio() {

		setTitle("Radio Buttons Clase 93");

		setBounds(350, 250, 500, 350);

		LaminaRadio p = new LaminaRadio();

		add(p);
	}
}

class LaminaRadio extends JPanel {

	public LaminaRadio() {

		ButtonGroup grupo = new ButtonGroup(); // El grupo no se puede agregar a la lamina

		ButtonGroup grupo2 = new ButtonGroup();

		btn1 = new JRadioButton("Azul", false);

		btn2 = new JRadioButton("Rojo", true);

		btn3 = new JRadioButton("Amarillo", false);

		btn4 = new JRadioButton("Masculino", false);

		btn5 = new JRadioButton("Femenino", false);

		grupo.add(btn1);

		grupo.add(btn2);

		grupo.add(btn3);

		grupo2.add(btn4);

		grupo2.add(btn5);

		add(btn1);

		add(btn2);

		add(btn3);

		add(btn5);

		add(btn4);
	}

	private JRadioButton btn1, btn2, btn3, btn4, btn5;
}
