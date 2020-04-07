package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CuadroTexto {

	public static void main(String[] args) {

		MarcoTexto m = new MarcoTexto();

		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		m.setVisible(true);
	}
}

class MarcoTexto extends JFrame {

	public MarcoTexto() {

		setTitle("Componentes Swing Clase 86 y 87");

		setBounds(350, 250, 600, 350);

		LaminaTexto p = new LaminaTexto();

		add(p);

		setVisible(true);
	}
}

class LaminaTexto extends JPanel {

	private JTextField campo1;

	private JLabel resultado;

	public LaminaTexto() {

		setLayout(new BorderLayout());

		JPanel lamina1 = new JPanel();

		lamina1.setLayout(new FlowLayout());

		resultado = new JLabel("", JLabel.CENTER);

		JLabel texto1 = new JLabel("Email: ");

		lamina1.add(texto1);

		campo1 = new JTextField(20);

		lamina1.add(campo1);

		add(resultado, BorderLayout.CENTER);

		JButton btn = new JButton("Comprobar");

		DameTexto mievento = new DameTexto();

		btn.addActionListener(mievento);

		lamina1.add(btn);

		add(lamina1, BorderLayout.NORTH);
	}

	private class DameTexto implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			int correcto = 0;

			String email = campo1.getText().trim();

			for (int i = 0; i < email.length(); i++) {
				if (email.charAt(i) == '@') {
					correcto++;
				}
			}

			if (correcto != 1) {
				resultado.setText("Incorrecto!");
			} else {
				resultado.setText("Correcto!");
			}
		}
	}
}