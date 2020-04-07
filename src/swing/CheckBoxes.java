package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxes {

	public static void main(String[] args) {

		MarcoCheck m = new MarcoCheck();

		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		m.setVisible(true);
	}
}

class MarcoCheck extends JFrame {

	public MarcoCheck() {

		setTitle("Check boxes Clase 92");

		setBounds(350, 250, 500, 350);

		LaminaCheck p = new LaminaCheck();

		add(p);
	}
}

class LaminaCheck extends JPanel {

	public LaminaCheck() {

		setLayout(new BorderLayout());

		Font letra = new Font("Serif", Font.PLAIN, 24);

		texto = new JLabel("En un lugar muy muy lejano...");

		texto.setFont(letra);

		JPanel lamina_texto = new JPanel();

		lamina_texto.add(texto);

		add(lamina_texto, BorderLayout.CENTER);

		check1 = new JCheckBox("Negrita");

		check2 = new JCheckBox("Cursiva");

		check1.addActionListener(new ManejaChecks());

		check2.addActionListener(new ManejaChecks());

		JPanel lamina_checks = new JPanel();

		lamina_checks.add(check1);

		lamina_checks.add(check2);

		add(lamina_checks, BorderLayout.SOUTH);
	}

	private class ManejaChecks implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int tipo = 0;

			if (check1.isSelected())
				tipo += Font.BOLD;

			if (check2.isSelected())
				tipo += Font.ITALIC;

			texto.setFont(new Font("Serif", tipo, 24));
		}
	}

	private JLabel texto;

	private JCheckBox check1, check2;
}