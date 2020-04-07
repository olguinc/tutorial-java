package swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Combos {

	public static void main(String[] args) {

		MarcoCombo m = new MarcoCombo();

		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		m.setVisible(true);
	}
}

class MarcoCombo extends JFrame {

	public MarcoCombo() {

		setTitle("ComboBox Clase 95");

		setBounds(350, 250, 600, 350);

		LaminaCombo p = new LaminaCombo();

		add(p);
	}
}

class LaminaCombo extends JPanel {

	public LaminaCombo() {

		setLayout(new BorderLayout());

		texto = new JLabel("En un lugar muy muy lejano");

		texto.setFont(new Font("Serif", Font.PLAIN, 18));

		add(texto, BorderLayout.CENTER);

		JPanel lamina_norte = new JPanel();

		combo = new JComboBox();

		combo.setEditable(false);

		combo.addItem("Serif");

		combo.addItem("SansSerif");

		combo.addItem("Courier");

		combo.addItem("Monospaced");

		EventoCombo ev = new EventoCombo();

		combo.addActionListener(ev);

		lamina_norte.add(combo);

		add(lamina_norte, BorderLayout.NORTH);
	}

	private class EventoCombo implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			texto.setFont(new Font((String) combo.getSelectedItem(), Font.PLAIN, 18));
		}
	}

	private JLabel texto;

	private JComboBox combo;
}
