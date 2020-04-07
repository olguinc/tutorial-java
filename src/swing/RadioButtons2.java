package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtons2 {

	public static void main(String[] args) {

		MarcoRadio2 m = new MarcoRadio2();

		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		m.setVisible(true);
	}
}

class MarcoRadio2 extends JFrame {

	public MarcoRadio2() {

		setTitle("Radio Buttons Clase 94");

		setBounds(350, 250, 500, 350);

		LaminaRadio2 p = new LaminaRadio2();

		add(p);
	}
}

class LaminaRadio2 extends JPanel {

	public LaminaRadio2() {

		setLayout(new BorderLayout());

		texto = new JLabel("En un lugar muy muy lejano...");

		texto.setFont(new Font("Serif", Font.PLAIN, 12));

		add(texto, BorderLayout.CENTER);

		lamina_botones = new JPanel();

		grupo = new ButtonGroup();

		colocarBotones("Pequeño", false, 10);

		colocarBotones("Mediano", false, 24);

		colocarBotones("Grande", false, 40);

		colocarBotones("Muy grande", false, 56);

		add(lamina_botones, BorderLayout.NORTH);

	}

	public void colocarBotones(String nombre, boolean seleccionado, final int tamano) {

		JRadioButton btn = new JRadioButton(nombre, seleccionado);

		grupo.add(btn);

		lamina_botones.add(btn);

		ActionListener evento = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				texto.setFont(new Font("Serif", Font.PLAIN, tamano));
			}
		};

		btn.addActionListener(evento);
	}

	private JLabel texto;

	private JRadioButton btn1, btn2, btn3, btn4;

	private ButtonGroup grupo;

	private JPanel lamina_botones;
}
