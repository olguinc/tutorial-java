package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreaTexto {

	public static void main(String[] args) {

		MarcoArea m = new MarcoArea();

		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		m.setVisible(true);
	}
}

class MarcoArea extends JFrame {

	public MarcoArea() {

		setTitle("Areas de Texto Clase 90");

		setBounds(350, 250, 600, 350);

		PanelArea p = new PanelArea();

		add(p);
	}
}

class PanelArea extends JPanel {

	private JTextArea area;

	public PanelArea() {

		area = new JTextArea(8, 20);

		JScrollPane otra_lamina = new JScrollPane(area);

		area.setLineWrap(true);

		add(otra_lamina);

		JButton btn = new JButton("Dale");

		btn.addActionListener(new GestionarArea());
		
		add(btn);
	}

	private class GestionarArea implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(area.getText());
		}
	}
}
