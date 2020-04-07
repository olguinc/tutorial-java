package swing;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class CuadroTexto1 {

	public static void main(String[] args) {
		MarcoTexto1 m = new MarcoTexto1();

		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoTexto1 extends JFrame {

	public MarcoTexto1() {

		setTitle("Text Fields Clase 88");

		setBounds(350, 250, 600, 350);

		LaminaTexto1 p = new LaminaTexto1();

		add(p);

		setVisible(true);
	}
}

class LaminaTexto1 extends JPanel {

	public LaminaTexto1() {

		JTextField campo1 = new JTextField(20);

		EscuchaTexto evento = new EscuchaTexto();

		Document doc = campo1.getDocument();

		doc.addDocumentListener(evento);

		add(campo1);
	}

	private class EscuchaTexto implements DocumentListener {

		@Override
		public void insertUpdate(DocumentEvent e) {
			System.out.println("Has insertado texto");

		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			System.out.println("Has borrado texto");

		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
		}
	}
}